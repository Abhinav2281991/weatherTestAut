$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WeatherCheck.feature");
formatter.feature({
  "line": 1,
  "name": "Validate the temperature of city shown at ndtv website and open weather API",
  "description": "",
  "id": "validate-the-temperature-of-city-shown-at-ndtv-website-and-open-weather-api",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Validate the temperature of same city getting from open weather api and ndtv website",
  "description": "",
  "id": "validate-the-temperature-of-city-shown-at-ndtv-website-and-open-weather-api;validate-the-temperature-of-same-city-getting-from-open-weather-api-and-ndtv-website",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user redirected to ndtv website",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on weather",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enter \"\u003ccity\u003e\" name",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user check the check box for same city and get temperature of the city",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user call get request and get the temperature of \"\u003ccityname\u003e\" with \"\u003cappid\u003e\" from open weather",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "validate the temperature shown at ndtv website and open weather api is same",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "validate-the-temperature-of-city-shown-at-ndtv-website-and-open-weather-api;validate-the-temperature-of-same-city-getting-from-open-weather-api-and-ndtv-website;",
  "rows": [
    {
      "cells": [
        "city",
        "",
        "cityname",
        "",
        "appid"
      ],
      "line": 13,
      "id": "validate-the-temperature-of-city-shown-at-ndtv-website-and-open-weather-api;validate-the-temperature-of-same-city-getting-from-open-weather-api-and-ndtv-website;;1"
    },
    {
      "cells": [
        "Chand",
        "",
        "Chandigarh",
        "",
        "7fe67bf08c80ded756e598d6f8fedaea"
      ],
      "line": 14,
      "id": "validate-the-temperature-of-city-shown-at-ndtv-website-and-open-weather-api;validate-the-temperature-of-same-city-getting-from-open-weather-api-and-ndtv-website;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7839261000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Validate the temperature of same city getting from open weather api and ndtv website",
  "description": "",
  "id": "validate-the-temperature-of-city-shown-at-ndtv-website-and-open-weather-api;validate-the-temperature-of-same-city-getting-from-open-weather-api-and-ndtv-website;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user redirected to ndtv website",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on weather",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enter \"Chand\" name",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user check the check box for same city and get temperature of the city",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user call get request and get the temperature of \"Chandigarh\" with \"7fe67bf08c80ded756e598d6f8fedaea\" from open weather",
  "matchedColumns": [
    2,
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "validate the temperature shown at ndtv website and open weather api is same",
  "keyword": "Then "
});
formatter.match({
  "location": "GetWeatherDetail.user_redirected_to_ndtv_website()"
});
formatter.result({
  "duration": 27778462400,
  "status": "passed"
});
formatter.match({
  "location": "GetWeatherDetail.user_clicks_on_weather()"
});
formatter.result({
  "duration": 2324626500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chand",
      "offset": 12
    }
  ],
  "location": "GetWeatherDetail.user_enter_name(String)"
});
formatter.result({
  "duration": 2785220300,
  "status": "passed"
});
formatter.match({
  "location": "GetWeatherDetail.user_check_the_check_box_for_same_city_and_get_temperature_of_the_city()"
});
formatter.result({
  "duration": 4591833800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Chandigarh",
      "offset": 50
    },
    {
      "val": "7fe67bf08c80ded756e598d6f8fedaea",
      "offset": 68
    }
  ],
  "location": "GetWeatherDetail.user_call_get_request_and_get_the_temperature_of_with_from_open_weather(String,String)"
});
formatter.result({
  "duration": 2107976400,
  "status": "passed"
});
formatter.match({
  "location": "GetWeatherDetail.validate_the_temperature_shown_at_ndtv_website_and_open_weather_api_is_same()"
});
formatter.result({
  "duration": 102600,
  "status": "passed"
});
formatter.after({
  "duration": 48378500,
  "status": "passed"
});
});