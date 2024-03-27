package com.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utilities.log;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMApplicationMethods {
	
	public static WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";	
	

	
@Given("^User should open Chrome Browser in the System$")
public void user_should_open_Chrome_Browser_in_the_System()  {
	System.setProperty("webdriver.chrome.driver", "./BrowserDriver_Files/chromedriver.exe");
	driver = new ChromeDriver();
	log.info("***** Chrome Browser Launched Successfully ************ ");
}

@When("^User should enter the OrangeHRM Application Url Address$")
public void user_should_enter_the_OrangeHRM_Application_Url_Address()  {
	driver.get(applicationUrlAddress);
log.info("Successfully Navigated to the OrangeHRM Application");	
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@Then("^User should be navigated to OrangeHRM Application LogIn WebPage$")
public void user_should_be_navigated_to_OrangeHRM_Application_LogIn_WebPage()  {
	// id="logInPanelHeading"
	String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
	System.out.println(" The expected OrangeHRM Application LogIn Page Text is :- "+expected_OrangeHRMApplicationLogInPageText);

	By logInPageTextProperty=By.id("logInPanelHeading");
	WebElement logInPageText=driver.findElement(logInPageTextProperty);

	String actual_OrangeHRMApplicationLogInPageText=logInPageText.getText();
	// System.out.println(" The actual OrangeHRM Application LogIn Page Text is :- "+actual_OrangeHRMApplicationLogInPageText);

log.info(" The actual OrangeHRM Application LogIn Page Text is :- "+actual_OrangeHRMApplicationLogInPageText);


	if(actual_OrangeHRMApplicationLogInPageText.equals(expected_OrangeHRMApplicationLogInPageText))
	{
	//System.out.println(" Successfully Navigated to OrangeHRM Application LogIN Page - PASS ");
log.info(" Successfully Navigated to OrangeHRM Application LogIN Page - PASS ");

	}
	else
	{
	//System.out.println(" Failed to Navigate to OrangeHRM Application LogIN Page - FAIL ");
log.info("Failed to Navigate to OrangeHRM Application LogIN Page - FAIL ");
	}
	}




@Then("^User should close the Chrome Browser along with OrangeHRM Application$")
public void user_should_close_the_Chrome_Browser_along_with_OrangeHRM_Application()  {
	driver.close();
	//System.out.println(" ********** Successfully Closed OrangeHRM Application **********");
log.info(" ********** Successfully Closed OrangeHRM Application **********");

}


	
}
