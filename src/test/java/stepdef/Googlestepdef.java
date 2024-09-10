package stepdef;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.java.en.*;

public class Googlestepdef {
	public WebDriver driver;
	@Given("Open the google application")
	public void open_the_google_application() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	    	}

	@When("User capture current page title")
	public void user_capture_current_page_title() {
		String expT = "Google";
		String actT = driver.getTitle();
		if(actT.equals(expT)) {
			Reporter.log(actT,true);
		}
	    }

	@Then("Title should match")
	public void title_should_match() {
		
		
		{
	   
	}

	}
}
