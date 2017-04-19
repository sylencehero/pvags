/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * legend module
 */
define(['ojs/ojcore', 'knockout','ojs/ojLegend'
], function (oj, ko) {
    /**
     * The view model for the main content view template
     */
    function legendContentViewModel() {
        var self = this;
        self.legendSections = ko.observableArray([{items: [
                {text: "Blueberries", color: "#267db3", markerShape: "square"},
                {text: "Kiwis", color: "#68c182", markerShape: "square"},
                {text: "Bananas", color: "#fad55c", markerShape: "square"},
                {text: "Apples", color: "#ed6647", markerShape: "square"},
                {text: "Grapes", color: "#8561c8", markerShape: "square"}
            ]}]);
    }
    
    var legendModel = new legendContentViewModel();
        $(document).ready(
            function ()
            {
                ko.applyBindings(legendModel, document.getElementById('legend-container'));
            }
        );
});
