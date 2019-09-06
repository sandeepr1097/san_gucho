package case_st_1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class san_case 
{
    WebDriver driver;
	
	@Given("I want to register in TestMeApp")
    public void i_want_to_register_in_TestMeApp()
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\Sandeep\\Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp/");
	  driver.manage().window().maximize();
	}
	
	@Given("user clicks signup page")
	public void user_clicks_signup_page() 
	{
		driver.findElement(By.linkText("SignUp")).click();
	}

	@When("user enters username {string}")
	public void user_enters_username(String string) 
	{
	 driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(string);
		
	}

	@When("user enters firstname {string}")
	public void user_enters_firstname(String string)
	{
	 driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(string);   
	}

	@When("user enters lastname {string}")
	public void user_enters_lastname(String string)
	{
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(string);
	}

	@When("user enters password {string}")
	public void user_enters_password(String string)
	{
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string);
	}

	@When("user enters confirm password {string}")
	public void user_enters_confirm_password(String string) 
	{
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(string);
	}

	@When("user clicks gender male")
	public void user_clicks_gender_male() 
	{
		driver.findElement(By.xpath("//input[@value='Male']")).click();    
	}

	@When("user enters email {string}")
	public void user_enters_email(String string)
	{
		driver.findElement(By.name("emailAddress")).sendKeys(string);  
	}

	@When("user enters mobile number {string}")
	public void user_enters_mobile_number(String string)
	{
		driver.findElement(By.name("mobileNumber")).sendKeys(string);
	}

	@When("user enters DOB {string}")
	public void user_enters_DOB(String string) 
	{
		 driver.findElement(By.xpath("//img[@alt='Ch']")).click();
		 WebElement month = driver.findElement(By.xpath("// select[@data-handler='selectMonth']"));
		  Select actmonth= new Select(month);
		  actmonth.selectByValue("10");
		  
		  WebElement year = driver.findElement(By.xpath("// select[@data-handler='selectYear']"));
		  Select actyear = new Select(year);
		  actyear.selectByValue("1997");
		  
		  WebElement cal =driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
		  cal.findElement(By.linkText("9")).click();
	}

	@When("user enters address {string}")
	public void user_enters_address(String string)
	{
		 driver.findElement(By.name("address")).sendKeys(string);  
	}

	@When("user chooses security question")
	public void user_chooses_security_question() 
	{
		WebElement seques = driver.findElement(By.xpath("//select[@id='securityQuestion']"));
		  Select seq= new Select(seques);
		  seq.selectByVisibleText("What is your Nick Name?");
	}

	@When("user enters answer {string}")
	public void user_enters_answer(String string)
	{
		 driver.findElement(By.name("answer")).sendKeys(string); 
	}

	@Then("user clicks the register button")
	public void user_clicks_the_register_button()
	{
		driver.findElement(By.name("Submit")).click(); 
	    
	}



}
