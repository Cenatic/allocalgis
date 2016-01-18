/* Copyright (c) 2006-2007 MetaCarta, Inc., published under the BSD license.
 * See http://svn.openlayers.org/trunk/openlayers/release-license.txt 
 * for the full text of the license. */


/**
 * @requires OpenLayers/Layer/Grid.js
 * 
 * Class: OpenLayers.Layer.KaMap
 * 
 * Inherits from:
 *  - <OpenLayers.Layer.Grid>
 */
OpenLayers.Layer.KaMap = OpenLayers.Class(OpenLayers.Layer.Grid, {

    /** 
     * APIProperty: isBaseLayer
     * {Boolean} KaMap Layer is always a base layer 
     */    
    isBaseLayer: true,

    /**
     * APIProperty: units
     * {?}
     */    
    units: null,

    /**
     * APIProperty: resolution
     * {Float}
     */
    resolution: OpenLayers.DOTS_PER_INCH,
    
    /**
     * Constant: DEFAULT_PARAMS
     * {Object} parameters set by default. The default parameters set 
     * the format via the 'i' parameter to 'jpeg'.    
     */
    DEFAULT_PARAMS: {
        i: 'jpeg',
        map: ''
    },
        
    /**
     * Constructor: OpenLayers.Layer.KaMap
     * 
     * Parameters:
     * name - {String}
     * url - {String}
     * params - {Object} Parameters to be sent to the HTTP server in the
     *    query string for the tile. The format can be set via the 'i'
     *    parameter (defaults to jpg) , and the map should be set via 
     *    the 'map' parameter. It has been reported that ka-Map may behave
     *    inconsistently if your format parameter does not match the format
     *    parameter configured in your config.php. (See ticket #327 for more
     *    information.)
     * options - {Object} Additional options for the layer. Any of the 
     *     APIProperties listed on this layer, and any layer types it
     *     extends, can be overridden through the options parameter. 
     */
    initialize: function(name, url, params, options) {
        var newArguments = [];
        newArguments.push(name, url, params, options);
        OpenLayers.Layer.Grid.prototype.initialize.apply(this, newArguments);
        this.params = (params ? params : {});
        if (params) {
            OpenLayers.Util.applyDefaults(
                           this.params, 
                           this.DEFAULT_PARAMS
                           );
        }
    },

    /**
     * Method: getURL
     * 
     * Parameters:
     * bounds - {<OpenLayers.Bounds>} 
     * 
     * Returns:
     * {String} A string with the layer's url and parameters and also the 
     *          passed-in bounds and appropriate tile size specified as 
     *          parameters
     */
    getURL: function (bounds) {
        bounds = this.adjustBounds(bounds);
        var mapRes = this.map.getResolution();
        var scale = Math.round((this.map.getScale() * 10000)) / 10000;
        var pX = Math.round(bounds.left / mapRes);
        var pY = -Math.round(bounds.top / mapRes);
        return this.getFullRequestString(
                      { t: pY, 
                        l: pX,
                        s: scale
                      });
    },

    /**
     * Method: addTile
     * 
     * Parameters:
     * bounds - {<OpenLayers.Bounds>}
     * position - {<OpenLayers.Pixel>}
     * 
     * Returns:
     * {<OpenLayers.Tile.Image>}
     */    
    addTile:function(bounds,position) {
        var url = this.getURL(bounds);
        return new OpenLayers.Tile.Image(this, position, bounds, 
                                             url, this.tileSize);
    },

    /**
     * Method: initGriddedTiles
     */    
    initGriddedTiles:function(bounds) {

        var viewSize = this.map.getSize();
        var minRows = Math.ceil(viewSize.h/this.tileSize.h) + Math.max(1, 2*this.buffer);
        var minCols = Math.ceil(viewSize.w/this.tileSize.w) + Math.max(1, 2*this.buffer);
        
        var extent = this.map.getMaxExtent();
        var resolution = this.map.getResolution();
        var tilelon = resolution*this.tileSize.w;
        var tilelat = resolution*this.tileSize.h;
        
        var offsetlon = bounds.left;
        var tilecol = Math.floor(offsetlon/tilelon) - this.buffer;
        var tilecolremain = offsetlon/tilelon - tilecol;
        var tileoffsetx = -tilecolremain * this.tileSize.w;
        var tileoffsetlon = tilecol * tilelon;
        
        var offsetlat = bounds.top;  
        var tilerow = Math.ceil(offsetlat/tilelat) + this.buffer;
        var tilerowremain = tilerow - offsetlat/tilelat;
        var tileoffsety = -(tilerowremain+1) * this.tileSize.h;
        var tileoffsetlat = tilerow * tilelat;
        
        tileoffsetx = Math.round(tileoffsetx); // heaven help us
        tileoffsety = Math.round(tileoffsety);

        this.origin = new OpenLayers.Pixel(tileoffsetx,tileoffsety);

        var startX = tileoffsetx; 
        var startLon = tileoffsetlon;
        
        var rowidx = 0;
        
        do {
            var row = this.grid[rowidx++];
            if (!row) {
                row = [];
                this.grid.push(row);
            }

            tileoffsetlon = startLon;
            tileoffsetx = startX;

            var colidx = 0;
 
            do {
                var tileBounds = 
                    new OpenLayers.Bounds(tileoffsetlon, 
                                          tileoffsetlat, 
                                          tileoffsetlon + tilelon,
                                          tileoffsetlat + tilelat);

                var x = tileoffsetx;
                x -= parseInt(this.map.layerContainerDiv.style.left);

                var y = tileoffsety;
                y -= parseInt(this.map.layerContainerDiv.style.top);

                var px = new OpenLayers.Pixel(x, y);
                var tile = row[colidx++];
                if (!tile) {
                    tile = this.addTile(tileBounds, px);
                    this.addTileMonitoringHooks(tile); 
                    row.push(tile);
                } else {
                    tile.moveTo(tileBounds, px, false);
                }
     
                tileoffsetlon += tilelon;       
                tileoffsetx += this.tileSize.w;
            } while (tileoffsetlon <= bounds.right + tilelon * this.buffer
                     || colidx < minCols)
            
            tileoffsetlat -= tilelat;
            tileoffsety += this.tileSize.h;
        } while(tileoffsetlat >= bounds.bottom - tilelat * this.buffer
                || rowidx < minRows)
        
        //shave off exceess rows and colums
        this.removeExcessTiles(rowidx, colidx);
        
        //now actually draw the tiles
        this.spiralTileLoad();

    },
    
    /**
     * APIMethod: clone
     * 
     * Parameters: 
     * obj - {Object}
     * 
     * Returns:
     * {<OpenLayers.Layer.Kamap>} An exact clone of this OpenLayers.Layer.KaMap
     */
    clone: function (obj) {
        
        if (obj == null) {
            obj = new OpenLayers.Layer.KaMap(this.name,
                                            this.url,
                                            this.params,
                                            this.options);
        }

        //get all additions from superclasses
        obj = OpenLayers.Layer.Grid.prototype.clone.apply(this, [obj]);

        // copy/set any non-init, non-simple values here
        if (this.tileSize != null) {
            obj.tileSize = this.tileSize.clone();
        }
        
        // we do not want to copy reference to grid, so we make a new array
        obj.grid = [];

        return obj;
    },    
    
    /**
     * APIMethod: getTileBounds
     * Returns The tile bounds for a layer given a pixel location.
     *
     * Parameters:
     * viewPortPx - {<OpenLayers.Pixel>} The location in the viewport.
     *
     * Returns:
     * {<OpenLayers.Bounds>} Bounds of the tile at the given pixel location.
     */
    getTileBounds: function(viewPortPx) {
        var resolution = this.getResolution();
        var tileMapWidth = resolution * this.tileSize.w;
        var tileMapHeight = resolution * this.tileSize.h;
        var mapPoint = this.getLonLatFromViewPortPx(viewPortPx);
        var tileLeft = tileMapWidth * Math.floor(mapPoint.lon / tileMapWidth);
        var tileBottom = tileMapHeight * Math.floor(mapPoint.lat / tileMapHeight);
        return new OpenLayers.Bounds(tileLeft, tileBottom,
                                     tileLeft + tileMapWidth,
                                     tileBottom + tileMapHeight);
    },

    CLASS_NAME: "OpenLayers.Layer.KaMap"
});
