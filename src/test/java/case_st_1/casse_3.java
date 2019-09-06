package case_st_1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casse_3
{
	WebDriver driver;
	@Given("user is in login page")
	public void user_is_in_login_page() 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Sandeep\\Drivers\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
		  driver.manage().window().maximize();
	}

	@When("user clicks signin key")
	public void user_clicks_signin_key()
	{
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enter un {string}")
	public void user_enter_un(String string)
	{
		 driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(string);
	}

	@When("user enter ps {string}")
	public void user_enter_ps(String string)
	{
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string);
	}

	@When("user clicks login page")
	public void user_clicks_login_page() 
	{
		driver.findElement(By.name("Login")).click();
	}

	@When("user search product {string}")
	public void user_search_product(String string)
	{
	  driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys(string);
	
	}

	@Then("click search button")
	public void click_search_button()
	{
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	}


	
	
}
