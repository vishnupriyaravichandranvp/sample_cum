package stepDefinition_casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
public class CS3_example3 
{	
 WebDriver driver;
@Given("user launch chrome for online shopping app")
public void user_launch_chrome_for_online_shopping_app() 
{
	System.out.println("user launch chrome and open the testMe app" );
    System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://10.232.237.143:443/TestMeApp/");
    driver.findElement(By.linkText("SignIn")).click();   
}

@When("user enter usrname in USERNAME field")
public void user_enter_usrname_in_USERNAME_field() 
{
	driver.findElement(By.id("userName")).sendKeys("Lalitha");
}

@When("user entered pwd in PASSWORD field")
public void user_entered_pwd_in_PASSWORD_field() 
{
	driver.findElement(By.id("password")).sendKeys("password123");
	driver.findElement(By.name("Login")).click();
}

@When("user entered productname in search_functionality as {string}")
public void user_entered_productname_in_search_functionality_as(String string) 
{
	driver.findElement(By.cssSelector("input[name='products'][type='text']")).sendKeys("Head");
}

@When("user clicks on FIND_DETAILS Button")
public void user_clicks_on_FIND_DETAILS_Button() 
{
    driver.findElement(By.cssSelector("input[value='FIND DETAILS'][type='submit']")).click();

}
}


