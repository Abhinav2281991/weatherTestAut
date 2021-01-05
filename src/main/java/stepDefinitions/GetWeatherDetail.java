package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class GetWeatherDetail extends DriverFactory {

	@When("^user redirected to ndtv website$")
	public void user_redirected_to_ndtv_website() throws Throwable {
		weather.openNdtvWebsitetoCheck();
		weather.clickOnThreeDots();
	}

	@When("^user clicks on weather$")
	public void user_clicks_on_weather() throws Throwable {
      weather.clickOnWeather();
	}

	@When("^user enter \"([^\"]*)\" name$")
	public void user_enter_name(String city) throws Throwable {
     weather.enterCityToSearch(city);
	}

	@When("^user check the check box for same city and get temperature of the city$")
	public void user_check_the_check_box_for_same_city_and_get_temperature_of_the_city() throws Throwable {
		weather.clickOnCheckBoxOfCity();
		weather.getTemperatureOfCity();
	}

//	@When("^user call get request and get the temperature of chandigarh$")
//	public void user_call_get_request_and_get_the_temperature_of_chandigarh() throws Throwable {
//	  weather.CallOpenweatherAPI();
//	}

	
	@When("^user call get request and get the temperature of \"([^\"]*)\" with \"([^\"]*)\" from open weather$")
	public void user_call_get_request_and_get_the_temperature_of_with_from_open_weather(String cityname, String appid) throws Throwable {
		 weather.callOpenweatherAPI(cityname, appid);
	}

	@Then("^validate the temperature shown at ndtv website and open weather api is same$")
	public void validate_the_temperature_shown_at_ndtv_website_and_open_weather_api_is_same() throws Throwable {
     weather.compareTemp();
	}

}
