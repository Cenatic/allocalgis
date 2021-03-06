/* Copyright (c) 2006-2007 MetaCarta, Inc., published under the BSD license.
 * See http://svn.openlayers.org/trunk/openlayers/release-license.txt 
 * for the full text of the license. */


/**
 * @requires OpenLayers/Control.js
 * @requires OpenLayers/Handler/Drag.js
 * @requires OpenLayers/Handler/Feature.js
 * 
 * Class: OpenLayers.Control.DragFeature
 * Move a feature with a drag.  Create a new control with the
 *     <OpenLayers.Control.DragFeature> constructor.
 *
 * Inherits From:
 *  - <OpenLayers.Control>
 */
OpenLayers.Control.DragFeature = OpenLayers.Class(OpenLayers.Control, {

    /**
     * APIProperty: geometryTypes
     * {Array(String)} To restrict dragging to a limited set of geometry types,
     *     send a list of strings corresponding to the geometry class names.
     */
    geometryTypes: null,
    encontrado:false,
    /**
     * APIProperty: onStart
     * {Function} Define this function if you want to know when a drag starts.
     *     The function should expect to receive two arguments: the feature
     *     that is about to be dragged and the pixel location of the mouse.
     *
     * Parameters:
     * feature - {<OpenLayers.Feature.Vector>} The feature that is about to be
     *     dragged.
     * pixel - {<OpenLayers.Pixel>} The pixel location of the mouse.
     */
    onStart: function(feature, pixel) {
    	
    	var d = new Date();
    	this.inicio = d.getTime();
    	onDrag = false;
    	if(ultimoNodo == feature.icon.imageDiv.id)moveInter=false;
    	
    	/*if((_isIE)&&(positionNode))
    	{
    		arrayRoute.splice(positionNode,0,new Object);
			arrayRoute[positionNode].id = positionNode;
			arrayRoute[positionNode].idContext = ultimoNodo;
			arrayRoute[positionNode].lonlat =null;
			arrayRoute[positionNode].inter = true;
												
			for(var y = positionNode+1; y < arrayRoute.length; y++)//el n� de nodos que quedan detr�s
			{
				arrayRoute[y].id = parseInt(arrayRoute[y].id) + 1;
			}
    	}*/
    	 
    	/*if(markerTemporal.markers.length != 0)
    	{*/
    		
    		/*for(var x = 0; x < arrayRoute.length; x++)
			{
				if(arrayRoute[x].idContext == feature.icon.imageDiv.id)
				{
					this.encontrado = true;
					puntoIntermedio = false;
					break;
				}
			}*/
			/*if(!this.encontrado)
			{
				puntoIntermedio = true;
				moveInter = true;
				
				for(var za = 0; za < layerVector.features.length; za++)
				{
					if(layerVector.features[za].id == lastFeatureSelect.id)
					{
						arrayRoute.splice(positionNode,0,new Object);
						arrayRoute[positionNode].id = positionNode;
						arrayRoute[positionNode].idContext = feature.icon.imageDiv.id;
						arrayRoute[positionNode].lonlat = map.getLonLatFromPixel(pixel);
						arrayRoute[positionNode].inter = true;
						
						
						for(var y = za+2; y < arrayRoute.length; y++)//el n� de nodos que quedan detr�s
						{
							arrayRoute[y].id = parseInt(arrayRoute[y].id) + 1;
							
						}
						this.encontrado = true;
					}
				}
				
				
			}*/
    	//}
    	//else this.encontrado = true;
    },

    /**
     * APIProperty: onDrag
     * {Function} Define this function if you want to know about each move of a
     *     feature. The function should expect to receive two arguments: the
     *     feature that is being dragged and the pixel location of the mouse.
     *
     * Parameters:
     * feature - {<OpenLayers.Feature.Vector>} The feature that was dragged.
     * pixel - {<OpenLayers.Pixel>} The pixel location of the mouse.
     */
    onDrag: function(feature, pixel) {
    	onDrag = true;
    		
    	var d = new Date();
    	
    	if((d.getTime() - this.inicio)< 1250)
    	{
    		return;
    	}
    	var d = new Date();
    	this.inicio = d.getTime();
    	//hacer una petici�n nueva
    	try
    	{
    		
    		if(feature)
	    	{
	    		/*if(this.encontrado)
	    		{*/
			    	for(var x = 0; x < arrayRoute.length; x++)
					{
						
						if(arrayRoute[x].idContext == feature.icon.imageDiv.id)
						{
							
							
							var lonlat = map.getLonLatFromViewPortPx( pixel );
							var posicionFeature = arrayRoute[x].id;
							setNodo(lonlat,posicionFeature);
							
							break;
						}
						
					}
				//}
			}
    		
    		
	    }
	    catch(e){}
    },

    /**
     * APIProperty: onComplete
     * {Function} Define this function if you want to know when a feature is
     *     done dragging. The function should expect to receive two arguments:
     *     the feature that is being dragged and the pixel location of the
     *     mouse.
     *
     * Parameters:
     * feature - {<OpenLayers.Feature.Vector>} The feature that was dragged.
     * pixel - {<OpenLayers.Pixel>} The pixel location of the mouse.
     */
    onComplete: function(feature, pixel) {
  	
    	onDrag = false;
    	
    	if(feature)
    	{
    		
    		var lonlat = map.getLonLatFromViewPortPx( pixel );
    		for(var x = 0; x < arrayRoute.length; x++)
			{
				if(arrayRoute[x].idContext == feature.icon.imageDiv.id)
				{
					
					var lonlat = map.getLonLatFromViewPortPx( pixel );
					var posicionFeature = arrayRoute[x].id;
					setNodo(lonlat,posicionFeature);
					break;
				}
				
			}
	    	
		}
		
		
    },	

    /**
     * Property: layer
     * {<OpenLayers.Layer.Vector>}
     */
    layer: null,
    
    /**
     * Property: feature
     * {<OpenLayers.Feature.Vector>}
     */
    feature: null,

    /**
     * Property: dragHandler
     * {<OpenLayers.Handler.Drag>}
     */
    dragHandler: null,

    /**
     * Property: dragCallbacks
     * {Object} The functions that are sent to the drag handler for callback.
     */
    dragCallbacks: {},

    /**
     * Property: featureHandler
     * {<OpenLayers.Handler.Feature>}
     */
    featureHandler: null,

    /**
     * Property: featureCallbacks
     * {Object} The functions that are sent to the feature handler for callback.
     */
    featureCallbacks: {},
    
    /**
     * Property: lastPixel
     * {<OpenLayers.Pixel>}
     */
    lastPixel: null,

    /**
     * Constructor: OpenLayers.Control.DragFeature
     * Create a new control to drag features.
     *
     * Parameters:
     * layer - {<OpenLayers.Layer.Vector>} The layer containing features to be
     *     dragged.
     * options - {Object} Optional object whose properties will be set on the
     *     control.
     */
    initialize: function(layer, options) {
        OpenLayers.Control.prototype.initialize.apply(this, [options]);
        this.layer = layer;
        this.dragCallbacks = OpenLayers.Util.extend({down: this.downFeature,
                                                     move: this.moveFeature,
                                                     up: this.upFeature,
                                                     out: this.cancel,
                                                     done: this.doneDragging
                                                    }, this.dragCallbacks);
        this.dragHandler = new OpenLayers.Handler.Drag(this, this.dragCallbacks);
        this.featureCallbacks = OpenLayers.Util.extend({over: this.overFeature,
                                                        out: this.outFeature
                                                       }, this.featureCallbacks);
        var handlerOptions = {geometryTypes: this.geometryTypes};
        this.featureHandler = new OpenLayers.Handler.Feature(this, this.layer,
                                                        this.featureCallbacks,
                                                        handlerOptions);
    },
    
    /**
     * APIMethod: destroy
     * Take care of things that are not handled in superclass
     */
    destroy: function() {
        this.layer = null;
        this.dragHandler.destroy();
        this.featureHandler.destroy();
        OpenLayers.Control.prototype.destroy.apply(this, []);
    },

    /**
     * APIMethod: activate
     * Activate the control and the feature handler.
     * 
     * Returns:
     * {Boolean} Successfully activated the control and feature handler.
     */
    activate: function() {
        return (this.featureHandler.activate() &&
                OpenLayers.Control.prototype.activate.apply(this, arguments));
    },

    /**
     * APIMethod: deactivate
     * Deactivate the control and all handlers.
     * 
     * Returns:
     * {Boolean} Successfully deactivated the control.
     */
    deactivate: function() {
        // the return from the handlers is unimportant in this case
        this.dragHandler.deactivate();
        this.featureHandler.deactivate();
        this.feature = null;
        this.dragging = false;
        this.lastPixel = null;
        return OpenLayers.Control.prototype.deactivate.apply(this, arguments);
    },

    /**
     * Method: overFeature
     * Called when the feature handler detects a mouse-over on a feature.
     *     This activates the drag handler.
     *
     * Parameters:
     * feature - {<OpenLayers.Feature.Vector>} The selected feature.
     */
    overFeature: function(feature) {
    	
    			
    	if(!this.dragHandler.dragging) {
            this.feature = feature;
            this.dragHandler.activate();
            this.over = true;
            // TBD replace with CSS classes
            this.map.div.style.cursor = "move";
            
            
        } else {
            if(this.feature.id == feature.id) {
                this.over = true;
            } else {
                this.over = false;
            }
        }
    },

    /**
     * Method: downFeature
     * Called when the drag handler detects a mouse-down.
     *
     * Parameters:
     * pixel - {<OpenLayers.Pixel>} Location of the mouse event.
     */
    downFeature: function(pixel) {
    	
    	this.lastPixel = pixel;
        this.onStart(this.feature, pixel);
    },

    /**
     * Method: moveFeature
     * Called when the drag handler detects a mouse-move.  Also calls the
     *     optional onDrag method.
     * 
     * Parameters:
     * pixel - {<OpenLayers.Pixel>} Location of the mouse event.
     */
    moveFeature: function(pixel) {
        var res = this.map.getResolution();
        this.feature.geometry.move(res * (pixel.x - this.lastPixel.x),
                                   res * (this.lastPixel.y - pixel.y));
        this.layer.drawFeature(this.feature);
        this.lastPixel = pixel;
        this.onDrag(this.feature, pixel);
      
    },

    /**
     * Method: upFeature
     * Called when the drag handler detects a mouse-up.  Also calls the
     *     optional onComplete method.
     * 
     * Parameters:
     * pixel - {<OpenLayers.Pixel>} Location of the mouse event.
     */
    upFeature: function(pixel) {
    	
        if(!this.over) {
            this.dragHandler.deactivate();
            this.feature = null;
            
            // TBD replace with CSS classes
            this.map.div.style.cursor = "default";
        }
        
        
    },

    /**
     * Method: doneDragging
     * Called when the drag handler is done dragging.
     *
     * Parameters:
     * pixel - {<OpenLayers.Pixel>} The last event pixel location.  If this event
     *     came from a mouseout, this may not be in the map viewport.
     */
    doneDragging: function(pixel) {
    	
    	this.onComplete(this.feature, pixel);
       
       
    },

    /**
     * Method: outFeature
     * Called when the feature handler detects a mouse-out on a feature.
     *
     * Parameters:
     * feature - {<OpenLayers.Feature.Vector>} The feature that the mouse left.
     */
    outFeature: function(feature) {
    	 
        if(!this.dragHandler.dragging) {
            this.over = false;
            this.dragHandler.deactivate();
            // TBD replace with CSS classes
            this.map.div.style.cursor = "default";
            this.feature = null;
        } else {
            if(this.feature.id == feature.id) {
                this.over = false;
            }
        }
    },
        
    /**
     * Method: cancel
     * Called when the drag handler detects a mouse-out (from the map viewport).
     */
    cancel: function() {
        this.dragHandler.deactivate();
        this.over = false;
    },

    /**
     * Method: setMap
     * Set the map property for the control and all handlers.
     *
     * Parameters: 
     * map - {<OpenLayers.Map>} The control's map.
     */
    setMap: function(map) {
        this.dragHandler.setMap(map);
        this.featureHandler.setMap(map);
        OpenLayers.Control.prototype.setMap.apply(this, arguments);
    },

    CLASS_NAME: "OpenLayers.Control.DragFeature"
});
