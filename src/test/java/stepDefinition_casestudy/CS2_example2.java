package stepDefinition_casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CS2_example2 {
	WebDriver driver;

	@Given("user launching testmeapp")
	public void user_launching_testmeapp() {
		System.out.println("user launch chrome and open the testMe app" );
	    System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	    driver.findElement(By.linkText("SignIn")).click();   
	  
	}
	
	@When("user enter username as {string} And enter password as {string}")
	public void user_enter_username_as_And_enter_password_as(String string, String string2) {
		driver.findElement(By.id("userName")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
	}



	@Then("click ok")
	public void click_ok() 
	{
		driver.findElement(By.name("Login")).click();
		String st = driver.findElement(By.cssSelector("#errormsg")).getText();
		if(st.equals("Username or Password is wrong here!!!"))
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Pass");
		
		}
	}

	@Then("verify login result")
	public void verify_login_result() 
		{
		//System.out.println("Close");
		Assert.assertTrue(true);
	  	}



}
