Feature: Validate the temperature of city shown at ndtv website and open weather API
@regression
Scenario Outline:  Validate the temperature of same city getting from open weather api and ndtv website

When user redirected to ndtv website
And user clicks on weather
And user enter "<city>" name 
And user check the check box for same city and get temperature of the city
When user call get request and get the temperature of "<cityname>" with "<appid>" from open weather 
Then validate the temperature shown at ndtv website and open weather api is same

Examples:
|city|   |cityname|   |appid|
|Chand|  |Chandigarh| |7fe67bf08c80ded756e598d6f8fedaea|

