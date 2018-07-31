package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;
	String title;
	@Given("^Login application should be available$")
	public void login_application_should_be_available() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver =new FirefoxDriver();
		driver.navigate().to("http://ec2-18-212-55-248.compute-1.amazonaws.com:8090/TestWebapp/");
		
	    throw new PendingException();
	}

	@When("^Validate login application$")
	public void validate_login_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		    title=driver.getTitle();
			System.out.println(title);
		   
		
		
	    throw new PendingException();
	}

	@Then("^Login should be successful$")
	public void login_should_be_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Login successful");
	    throw new PendingException();
	}


}
