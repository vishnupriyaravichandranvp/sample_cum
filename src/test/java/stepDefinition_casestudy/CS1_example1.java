package stepDefinition_casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CS1_example1 {
	WebDriver driver;

	@Given("user launch chrome browser And enter TestMeApp URL")
	public void user_launch_chrome_browser_And_enter_TestMeApp_URL() {
		 System.out.println("user launch chrome and open the testMe app" );
		    System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		    driver = new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
		    driver.findElement(By.linkText("SignUp")).click();   
	}

	@When("user entered username in username field as {string}")
	public void user_entered_username_in_username_field_as(String string) {
		 System.out.println("Username entered is displayed" );
		 driver.findElement(By.name("userName")).sendKeys("Keerthana");
	}

	@When("user entered firstname in firstname field {string}")
	public void user_entered_firstname_in_firstname_field(String string) {
		driver.findElement(By.id("firstName")).sendKeys("Ravichan");
	   
	}

	@When("user entered Lastname in Lastname field {string}")
	public void user_entered_Lastname_in_Lastname_field(String string) {
		driver.findElement(By.id("lastName")).sendKeys("Chandran");
	}

	@When("user entered password in password field as {string}")
	public void user_entered_password_in_password_field_as(String string) {
		driver.findElement(By.id("password")).sendKeys("8220883885");
	}

	@When("user entered Confirm password in Confirm password field {string}")
	public void user_entered_Confirm_password_in_Confirm_password_field(String string) {
		driver.findElement(By.name("confirmPassword")).sendKeys("8220883885");
	}

	@When("user select Gender in Radio button as {string}")
	public void user_select_Gender_in_Radio_button_as(String string) {
		driver.findElement(By.cssSelector("input[value='Female'][type='radio']")).click();
	}

	@When("user entered email in email field as {string}")
	public void user_entered_email_in_email_field_as(String string) {
		driver.findElement(By.name("emailAddress")).sendKeys("ravi@gmail.com");
	}

	@When("user entered Mobile Number in Mobile Number field {string}")
	public void user_entered_Mobile_Number_in_Mobile_Number_field(String string) {
		driver.findElement(By.name("mobileNumber")).sendKeys("8220883885");
	}

	@When("user entered DOB in DOB field {string}")
	public void user_entered_DOB_in_DOB_field(String string) {
		driver.findElement(By.cssSelector("input[name='dob'][type='text']")).sendKeys("22/06/1998");
	}

	@When("user entered Address in Address field as {string}")
	public void user_entered_Address_in_Address_field_as(String string) {
		driver.findElement(By.name("address")).sendKeys("37, Chokkampudhur,Coimbatore");
	}

	@When("user select Security Question in Dropdown field as {string}")
	public void user_select_Security_Question_in_Dropdown_field_as(String string) {
		Select security = new Select(driver.findElement(By.id("securityQuestion")));
		security.selectByIndex(0);
	}

	@When("user entered Answer in Answer field as {string}")
	public void user_entered_Answer_in_Answer_field_as(String string) {
		driver.findElement(By.name("answer")).sendKeys("coimbatore");
	}

	@When("user clicks on Register Button")
	public void user_clicks_on_Register_Button() {
		driver.findElement(By.cssSelector("input[value='Register'][type='submit']")).click();
	}

	@Then("verify result")
	public void verify_result() {
	   
	}


}
