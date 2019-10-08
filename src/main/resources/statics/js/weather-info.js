var cityNamesRegex = /^\s*[a-zA-Z,\s]+\s*$/;

$(document).ready(function() {
	
    $(document).tooltip();
    $("#submit").click(function(event) {
        event.preventDefault();
        $(".alert").hide();
        var cityNames = $("#city-names").val();
        if(!cityNames) {
            $(".empty-error-alert").show();
            return;
        }

        if(!cityNames.match(cityNamesRegex)) {
            $(".invalid-error-alert").show();
            console.log("invalid");
            return;
        }

        $("#weather-results").empty();
        $(".loading-results-alert").show();
        $.get("/weather/getWeatherInfoByCities/"+cityNames, function(results, status){
            if(status === 'success' && results.length > 0) {        			 
                loadResults(results);
                $("#city-names").val("");
            } else {
                $(".no-results-alert").show();
            }
            $(".loading-results-alert").hide();
        }).fail(function() {
            alert('woops.. Something went wrong. Please Contact Application Support Team');
        });;
    });

    function loadResults(results) {
        $(results).each(function(index,result) {
            $("#weather-results").append(createWidget(result));
        });        
    }

	function createWidget(report) {
	    $widget = '<div class="weather-widget">'+
	                '<table>'+
	                    '<tr>'+
	                        '<td colspan="2" class="city-name">' + report.name + ', '+ report.sys.country +'</td>'+
	                    '</tr>'+
	                    '<tr>'+
	                        '<td class="temperature">' + report.main.temp +'<sup>o</sup>F</td>'+
	                        '<td class="weather-image"></td>'+
	                    '</tr>'+
	                    '<tr class="metric">'+
	                        '<td class="text-right">Cloudiness:</td>'+
	                        '<td>' + report.clouds.all + '%</td>'+
	                    '</tr>'+
	                    '<tr class="metric">'+
	                        '<td class="text-right">Pressure:</td>'+
	                        '<td>' + report.main.pressure + 'hpa</td>'+
	                    '</tr>'+
	                    '<tr class="metric">'+
	                        '<td class="text-right">Humidity:</td>'+
	                        '<td>' + report.main.humidity + '%</td>'+
	                    '</tr>'+
	                    '<tr class="metric">'+
	                        '<td class="text-right">Wind:</td>'+
	                        '<td>' + report.wind.speed + ' m/s</td>'+
	                    '</tr>'+
	                '</table>'+
	            '</div>';
	
	    return $widget;
	}
});