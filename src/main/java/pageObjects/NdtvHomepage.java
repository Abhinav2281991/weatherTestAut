package pageObjects;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import utils.Constant;

public class NdtvHomepage extends BasePage {
	
	
	public String tempFromNdtv;
	public static Response response;
	public String temperatureFromOpenWeather;

	public NdtvHomepage() throws IOException{
		// TODO Auto-generated constructor stub
		super();
	} 
   public @FindBy (id= "h_sub_menu") WebElement threeDots;
   public @FindBy (xpath="//a[contains(text(),'WEATHER')]") WebElement weatherText;
   public @FindBy (id="searchBox") WebElement searchCity;
   public @FindBy (id="Chandigarh") WebElement selectCheckBoxOfCity;
   public @FindBy (xpath="//div[@title='Chandigarh']//span[@class='tempWhiteText']") WebElement getTemp;
   public @FindBy (className="notnow") WebElement closePop;
   


public NdtvHomepage openNdtvWebsitetoCheck() throws IOException, InterruptedException, AWTException {
	   
	   getDriver().get(Constant.WebUrl);
	   Thread.sleep(3000);
	  waitAndClickElement(closePop);
       
	   captureScreenshot();
		copyLatestExtentReport();
		
		Thread.sleep(1000);
	   return new NdtvHomepage();
	   
}

public NdtvHomepage clickOnThreeDots() throws IOException, InterruptedException {
//	WebElement res=driver.findElement(By.xpath("//label[contains(text(),'"+response+"')]"));
	waitAndClickElement(threeDots);
	 captureScreenshot();
		copyLatestExtentReport();
		Thread.sleep(1000);
	
	return new NdtvHomepage();
}

public NdtvHomepage clickOnWeather() throws IOException, InterruptedException {
//	WebElement res=driver.findElement(By.xpath("//label[contains(text(),'"+response+"')]"));
	waitAndClickElement(weatherText);
	 captureScreenshot();
		copyLatestExtentReport();
		Thread.sleep(1000);
	
	return new NdtvHomepage();
}

public NdtvHomepage enterCityToSearch(String city) throws Exception {
//	WebElement res=driver.findElement(By.xpath("//label[contains(text(),'"+response+"')]"));
	sendKeysToWebElement(searchCity, city);
	 captureScreenshot();
		copyLatestExtentReport();
		Thread.sleep(1000);
	
	return new NdtvHomepage();
}

public NdtvHomepage clickOnCheckBoxOfCity() throws Exception {
//	WebElement res=driver.findElement(By.xpath("//label[contains(text(),'"+response+"')]"));
	waitAndClickElement(selectCheckBoxOfCity);
	 captureScreenshot();
		copyLatestExtentReport();
		Thread.sleep(1000);
	
	return new NdtvHomepage();
}



public NdtvHomepage getTemperatureOfCity() throws Exception {

      tempFromNdtv=getTemp.getText();
      
      
      System.out.println(tempFromNdtv);
	 captureScreenshot();
		copyLatestExtentReport();
		Thread.sleep(1000);
	driver.close();
	return new NdtvHomepage();
}


public NdtvHomepage callOpenweatherAPI(String cityname, String appid) throws IOException {

	
	RestAssured.baseURI =Constant.apiUrl;
	RequestSpecification request = RestAssured.given();
	
	response = request.queryParam("q", cityname) 
            .queryParam("appid", appid) 
            .when().get("/weather").
		
	 then().
     contentType(ContentType.JSON).  
     extract().response(); 

      temperatureFromOpenWeather=getjsonpath(response, "main.temp" );
	 System.out.println(temperatureFromOpenWeather);
 
	
	
    return new NdtvHomepage();
}


public NdtvHomepage compareTemp() throws IOException {
//	assertEquals(tempfromNdtv, temperatureFromOpenWeather);
	if(tempFromNdtv==temperatureFromOpenWeather) {
		System.out.println("Test Case Passed");
	}else {
		System.out.println("Test Case Failed");
	}
	
	
	return new NdtvHomepage();
}






}