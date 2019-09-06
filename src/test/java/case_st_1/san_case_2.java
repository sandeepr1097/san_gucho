package case_st_1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class san_case_2
{

	WebDriver driver;
	
	@Given("user in the login page")
	public void user_in_the_login_page() 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Sandeep\\Drivers\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
		  driver.manage().window().maximize();
	}

	@When("user clicks signin button")
	public void user_clicks_signin_button() 
	{
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enters usernam {string}")
	public void user_enters_usernam(String string)
	{
		 driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(string);
	}

	@When("user enters passwor {string}")
	public void user_enters_passwor(String string)
	{
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string);
	}

	@Then("click login button")
	public void click_login_button()
	{
		driver.findElement(By.name("Login")).click();
	}

	
	

}
