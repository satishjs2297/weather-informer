<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <title>Weather Information</title>
    <meta http-equiv=“Content-Type” content=“text/html; charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <script type="text/javascript" src="<spring:url value="/resources/js/jquery.js"/>"> </script>
    <script type="text/javascript" src="<spring:url value="/resources/js/jquery-ui.min.js"/>"> </script> 
    <script type="text/javascript" src="<spring:url value="/resources/js/weather-info.js"/>"> </script>
    
    <link rel="icon" type="image/png" href="<spring:url value="/resources/css/images/weather.png"/>">
 	<link href='<spring:url value="/resources/css/jquery-ui.min.css"/>' rel="stylesheet" />
    <link href='<spring:url value="/resources/css/style.css"/>' rel="stylesheet" />
    

</head>

<body>
    <div id="weather-banner">
        <h1>Weather Information</h1>
    </div>
    <div id="weather-information">
        <div id="weather-form">
            <div class="ui-widget alert empty-error-alert">
                <div class="ui-state-error ui-corner-all" style="padding: 0 .7em;">
                    <p>
                        <span class="ui-icon ui-icon-alert" style="float: left; margin-right: .3em; margin-top: .1em"></span>
                        <strong>Empty:</strong> Please input city name(s).
                    </p>
                </div>
            </div>
            <div class="ui-widget alert invalid-error-alert">
                <div class="ui-state-error ui-corner-all" style="padding: 0 .7em;">
                    <p>
                        <span class="ui-icon ui-icon-alert" style="float: left; margin-right: .3em; margin-top: .1em"></span>
                        <strong>Invalid:</strong> Please enter valid comma separated city names.
                    </p>
                </div>
            </div>
            <div class="ui-widget alert no-results-alert">
                <div class="ui-state-hover ui-corner-all" style="padding: 0 .7em;">
                    <p>
                        <span class="ui-icon ui-icon-info" style="float: left; margin-right: .3em; margin-top: .1em"></span>
                        <strong>Info:</strong> No results found.
                    </p>
                </div>
            </div>
            <div class="ui-widget">
                <table>
                    <tr>
                        <td><label for="city-names">City Names:</label></td>
                        <td><input type="text" id="city-names" title="Please enter comma(,) seperated values." required></td>
                        <td><input type="button" id="submit" class="ui-button ui-corner-all" value="Submit"></td>
                    </tr>
                </table>
            </div>
        	<div class="ui-widget alert loading-results-alert">
                <div class="ui-state-hover ui-corner-all" style="padding: 0 .7em;">
                    <p>Loading..</p>
                </div>
            </div>
        </div>
        <div id="weather-results">
            
        </div>
    </div>
</body>

</html>
