/* Copyright (c) 2006 MetaCarta, Inc., published under the BSD license.
 * See http://svn.openlayers.org/trunk/openlayers/release-license.txt 
 * for the full text of the license. */


/**
 * @requires OpenLayers/Control/DragFeature.js
 * @requires OpenLayers/Control/SelectFeature.js
 * @requires OpenLayers/Handler/Keyboard.js
 * 
 * Class: OpenLayers.Control.ModifyFeature
 * Control to modify features.  When activated, a click renders the vertices
 *     of a feature - these vertices can then be dragged.  By default, the
 *     delete key will delete the vertex under the mouse.  New features are
 *     added by dragging "virtual vertices" between vertices.  Create a new
 *     control with the <OpenLayers.Control.ModifyFeature> constructor.
 *
 * Inherits From:
 *  - <OpenLayers.Control>
 */
OpenLayers.Control.ModifyFeature = OpenLayers.Class(OpenLayers.Control, {

    /**
     * APIProperty: geometryTypes
     * {Array(String)} To restrict modification to a limited set of geometry
     *     types, send a list of strings corresponding to the geometry class
     *     names.
     */
    geometryTypes: null,

    /**
     * Property: layer
     * {<OpenLayers.Layer.Vector>}
     */
    layer: null,
    
    /**
     * Property: feature
     * {<OpenLayers.Feature.Vector>} Feature currently available for modification.
     */
    feature: null,
    
    /**
     * Property: vertices
     * {Array(<OpenLayers.Feature.Vector>)} Verticies currently available
     *     for dragging.
     */
    vertices: null,
    
    /**
     * Property: virtualVertices
     * {Array(<OpenLayers.Feature.Vector>)} Virtual vertices in the middle
     *     of each edge.
     */
    virtualVertices: null,

    /**
     * Property: selectControl
     * {<OpenLayers.Control.Select>}
     */
    selectControl: null,
    
    /**
     * Property: dragControl
     * {<OpenLayers.Control.DragFeature>}
     */
    dragControl: null,
    
    /**
     * Property: keyboardHandler
     * {<OpenLayers.Handler.Keyboard>}
     */
    keyboardHandler: null,
    
    /**
     * APIProperty: deleteCodes
     * {Array(Integer)} Keycodes for deleting verticies.  Set to null to disable
     *     vertex deltion by keypress.  If non-null, keypresses with codes
     *     in this array will delete vertices under the mouse. Default
     *     is 46 and 100, the 'delete' and lowercase 'd' keys.
     */
    deleteCodes: null,

    /**
     * APIProperty: virtualStyle
     * {<OpenLayers.Feature.Vector.Style>}
     */
    virtualStyle: null,
    
    /**
     * APIProperty: onModificationStart 
     * {Function} Optional function to be called when a feature is selected
     *     to be modified. The function should expect to be called with a
     *     feature.  This could be used for example to allow to lock the
     *     feature on server-side.
     */
    onModificationStart: function() {},

    /**
     * APIProperty: onModification
     * {Function} Optional function to be called when a feature has been
     *     modified.  The function should expect to be called with a feature.
     */
    onModification: function() {},

    /**
     * APIProperty: onModificationEnd
     * {Function} Optional function to be called when a feature is finished 
     *     being modified.  The function should expect to be called with a
     *     feature.
     */
    onModificationEnd: function() {},

    /**
     * Constructor: OpenLayers.Control.ModifyFeature
     * Create a new modify feature control.
     *
     * Parameters:
     * layer - {<OpenLayers.Layer.Vector>} Layer that contains features that
     *     will be modified.
     * options - {Object} Optional object whose properties will be set on the
     *     control.
     */
    initialize: function(layer, options) {
        this.layer = layer;
        this.vertices = [];
        this.virtualVertices = [];
        this.styleVirtual = OpenLayers.Util.extend({}, this.layer.style);
        this.styleVirtual.fillOpacity = 0.3;
        this.styleVirtual.strokeOpacity = 0.3;
        this.deleteCodes = [46, 100];
        OpenLayers.Control.prototype.initialize.apply(this, [options]);
        if(!(this.deleteCodes instanceof Array)) {
            this.deleteCodes = [this.deleteCodes];
        }
        var control = this;

        // configure the select control
        var selectOptions = {
            geometryTypes: this.geometryTypes,
            onSelect: function(feature) {
                control.selectFeature.apply(control, [feature]);
            },
            onUnselect: function(feature) {
                control.unselectFeature.apply(control, [feature]);
            }
        };
        this.selectControl = new OpenLayers.Control.SelectFeature(
            layer, selectOptions
        );

        // configure the drag control
        var dragOptions = {
            geometryTypes: ["OpenLayers.Geometry.Point"],
            snappingOptions: this.snappingOptions,
            onStart: function(feature, pixel) {
                control.dragStart.apply(control, [feature, pixel]);
            },
            onDrag: function(feature) {
                control.dragVertex.apply(control, [feature]);
            },
            onComplete: function(feature) {
                control.dragComplete.apply(control, [feature]);
            }
        };
        this.dragControl = new OpenLayers.Control.DragFeature(
            layer, dragOptions
        );

        // configure the keyboard handler
        var keyboardOptions = {
            keypress: this.handleKeypress
        };
        this.keyboardHandler = new OpenLayers.Handler.Keyboard(
            this, keyboardOptions
        );
    },

    /**
     * APIMethod: destroy
     * Take care of things that are not handled in superclass.
     */
    destroy: function() {
        this.layer = null;
        this.selectControl.destroy();
        this.dragControl.destroy();
        this.keyboardHandler.destroy();
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
        return (this.selectControl.activate() &&
                this.keyboardHandler.activate() &&
                OpenLayers.Control.prototype.activate.apply(this, arguments));
    },

    /**
     * APIMethod: deactivate
     * Deactivate the controls.
     *
     * Returns: 
     * {Boolean} Successfully deactivated the control.
     */
    deactivate: function() {
        var deactivated = false;
        // the return from the controls is unimportant in this case
        if(OpenLayers.Control.prototype.deactivate.apply(this, arguments)) {
            this.layer.removeFeatures(this.vertices);
            this.layer.removeFeatures(this.virtualVertices);
            this.vertices = [];
            this.dragControl.deactivate();
            if(this.feature) {
                this.selectControl.unselect.apply(this.selectControl,
                                                  [this.feature]);
            }
            this.selectControl.deactivate();
            this.keyboardHandler.deactivate();
            deactivated = true;
        }
        return deactivated;
    },

    /**
     * Method: selectFeature
     * Called when the select feature control selects a feature.
     *
     * Parameters:
     * feature - {<OpenLayers.Feature.Vector>} The selected feature.
     */
    selectFeature: function(feature) {
        this.feature = feature;
        this.resetVertices();
        this.dragControl.activate();
        this.onModificationStart(this.feature);
    },

    /**
     * Method: unselectFeature
     * Called when the select feature control unselects a feature.
     *
     * Parameters:
     * feature - {<OpenLayers.Feature.Vector>} The unselected feature.
     */
    unselectFeature: function(feature) {
        this.layer.removeFeatures(this.vertices);
        this.layer.removeFeatures(this.virtualVertices);
        this.vertices = [];
        this.virtualVertices = [];
        this.feature = null;
        this.dragControl.deactivate();
        this.onModificationEnd(feature);
    },

    /**
     * Method: dragStart
     * Called by the drag feature control with before a feature is dragged.
     *     This method is used to differentiate between points and vertices
     *     of higher order geometries.  This respects the <geometryTypes>
     *     property and forces a select of points when the drag control is
     *     already active (and stops events from propagating to the select
     *     control).
     *
     * Parameters:
     * feature - {<OpenLayers.Feature.Vector>} The point or vertex about to be
     *     dragged.
     * pixel - {<OpenLayers.Pixel>} Pixel location of the mouse event.
     */
    dragStart: function(feature, pixel) {
        // only change behavior if the feature is not in the vertices array
        if(feature != this.feature &&
           OpenLayers.Util.indexOf(this.vertices, feature) == -1 &&
           OpenLayers.Util.indexOf(this.virtualVertices, feature) == -1) {
            if(this.feature) {
                // unselect the currently selected feature
                this.selectControl.clickFeature.apply(this.selectControl,
                                                      [this.feature]);
            }
            // check any constraints on the geometry type
            if(this.geometryTypes == null ||
               OpenLayers.Util.indexOf(this.geometryTypes,
                                       feature.geometry.CLASS_NAME) != -1) {
                // select the point
                this.selectControl.clickFeature.apply(this.selectControl,
                                                      [feature]);
                /**
                 * TBD: These lines improve workflow by letting the user
                 *     immediately start dragging after the mouse down.
                 *     However, it is very ugly to be messing with controls
                 *     and their handlers in this way.  I'd like a better
                 *     solution if the workflow change is necessary.
                 */
                // prepare the point for dragging
                this.dragControl.overFeature.apply(this.dragControl,
                                                   [feature]);
                this.dragControl.lastPixel = pixel;
                this.dragControl.dragHandler.started = true;
                this.dragControl.dragHandler.start = pixel;
                this.dragControl.dragHandler.last = pixel;
            }
        }
    },
    
    /**
     * Method: dragVertex
     * Called by the drag feature control with each drag move of a vertex.
     *
     * Parameters:
     * vertex - {<OpenLayers.Feature.Vector>} The vertex being dragged.
     */
    dragVertex: function(vertex) {
        if(this.feature.geometry.CLASS_NAME == "OpenLayers.Geometry.Point") {
            if(this.feature != vertex) {
                this.feature = vertex;
            }
        } else {
            if(OpenLayers.Util.indexOf(this.virtualVertices, vertex) != -1) {
                vertex.geometry.parent.addComponent(vertex.geometry,
                                                    vertex._index);
                delete vertex._index;
                OpenLayers.Util.removeItem(this.virtualVertices, vertex);
                this.layer.removeFeatures(vertex);
            }
        }
        this.layer.drawFeature(this.feature, this.selectControl.selectStyle);
        this.layer.removeFeatures(this.virtualVertices);
        // keep the vertex on top so it gets the mouseout after dragging
        // this should be removed in favor of an option to draw under or
        // maintain node z-index
        this.layer.drawFeature(vertex);
    },
    
    /**
     * Method: dragComplete
     * Called by the drag feature control when the feature dragging is complete.
     *
     * Parameters:
     * vertex - {<OpenLayers.Feature.Vector>} The vertex being dragged.
     */
    dragComplete: function(vertex) {
        this.resetVertices();
        this.onModification(this.feature);
    },
    
    /**
     * Method: resetVertices
     */
    resetVertices: function() {
        if(this.vertices.length > 0) {
            this.layer.removeFeatures(this.vertices);
            this.vertices = [];
        }
        if(this.virtualVertices.length > 0) {
            this.layer.removeFeatures(this.virtualVertices);
            this.virtualVertices = [];
        }
        if(this.feature &&
           this.feature.geometry.CLASS_NAME != "OpenLayers.Geometry.Point") {
            this.collectVertices(this.feature.geometry);
            this.layer.addFeatures(this.vertices);
            this.layer.addFeatures(this.virtualVertices);
        }
    },
    
    /**
     * Method: handleKeypress
     * Called by the feature handler on keypress.  This is used to delete
     *     vertices and point features.  If the <deleteCode> property is set,
     *     vertices and points will be deleted when a feature is selected
     *     for modification and the mouse is over a vertex.
     *
     * Parameters:
     * {Integer} Key code corresponding to the keypress event.
     */
    handleKeypress: function(code) {
        // check for delete key
        if(this.feature &&
           OpenLayers.Util.indexOf(this.deleteCodes, code) != -1) {
            var vertex = this.dragControl.feature;
            if(vertex &&
               OpenLayers.Util.indexOf(this.vertices, vertex) != -1) {
                // remove the vertex
                vertex.geometry.parent.removeComponent(vertex.geometry);
                this.layer.drawFeature(this.feature,
                                       this.selectControl.selectStyle);
                this.resetVertices();
                this.onModification(this.feature);
            }
        }
    },

    /**
     * Method: collectVertices
     * Collect the vertices from the modifiable feature's geometry and push
     *     them on to the control's vertices array.
     */
    collectVertices: function() {
        this.vertices = [];
        this.virtualVirtices = [];        
        var control = this;
        function collectComponentVertices(geometry) {
            var i, vertex, component;
            if(geometry.CLASS_NAME == "OpenLayers.Geometry.Point") {
                vertex = new OpenLayers.Feature.Vector(geometry);
                control.vertices.push(vertex);
            } else {
                for(i=0; i<geometry.components.length; ++i) {
                    component = geometry.components[i];
                    if(component.CLASS_NAME == "OpenLayers.Geometry.Point") {
                        vertex = new OpenLayers.Feature.Vector(component);
                        control.vertices.push(vertex);
                    } else {
                        collectComponentVertices(component);
                    }
                }
                
                // add virtual vertices in the middle of each edge
                if(geometry.CLASS_NAME != "OpenLayers.Geometry.MultiPoint") {
                    for(i=0; i<geometry.components.length-1; ++i) {
                        var prevVertex = geometry.components[i];
                        var nextVertex = geometry.components[i + 1];
                        if(prevVertex.CLASS_NAME == "OpenLayers.Geometry.Point" &&
                           nextVertex.CLASS_NAME == "OpenLayers.Geometry.Point") {
                            var x = (prevVertex.x + nextVertex.x) / 2;
                            var y = (prevVertex.y + nextVertex.y) / 2;
                            var point = new OpenLayers.Feature.Vector(
                                new OpenLayers.Geometry.Point(x, y),
                                null, control.styleVirtual
                            );
                            // set the virtual parent and intended index
                            point.geometry.parent = geometry;
                            point._index = i + 1;
                            control.virtualVertices.push(point);
                        }
                    }
                }
            }
        }       
        collectComponentVertices(this.feature.geometry);
    },

    /**
     * Method: setMap
     * Set the map property for the control and all handlers.
     *
     * Parameters:
     * map - {<OpenLayers.Map>} The control's map.
     */
    setMap: function(map) {
        this.selectControl.setMap(map);
        this.dragControl.setMap(map);
        OpenLayers.Control.prototype.setMap.apply(this, arguments);
    },

    CLASS_NAME: "OpenLayers.Control.ModifyFeature"
});
