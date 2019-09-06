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
import junit.framework.Assert;

public class case_4 
{
WebDriver driver;
	@Given("user  in login page")
	public void user_in_login_page() 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Sandeep\\Drivers\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
		  driver.manage().window().maximize();
	}

	@When("user search prod {string}")
	public void user_search_prod(String string) 
	{
		 driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys(string);
	}

	@Then("user click search button")
	public void user_click_search_button()
	{
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("click add to cart")
	public void click_add_to_cart() 
	{
	  driver.findElement(By.linkText("Add to cart")).click();
	}

	@Then("login page should display")
	public void login_page_should_display()
	{
	    Assert.assertEquals(driver.getTitle(), "Login");
	  //  System.out.println("");
	}



}
