package stepDefinition_casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cs4 {
	WebDriver driver;
	@Given("Alex enter the URL and launch the Application")
	public void alex_enter_the_URL_and_launch_the_Application() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	    driver.findElement(By.linkText("SignIn")).click();   
	    driver.findElement(By.id("userName")).sendKeys("Lalitha");
		driver.findElement(By.id("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
	}

	@When("user moves to cart without adding the product")
	public void user_moves_to_cart_without_adding_the_product() {
		driver.findElement(By.cssSelector("input[name='products'][type='text']")).sendKeys("Head");
		driver.findElement(By.cssSelector("input[value='FIND DETAILS'][type='submit']")).click();
		
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")).click();
	}

	@When("user moves to cart with product and payment")
	public void user_moves_to_cart_with_product_and_payment() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/");
	    driver.findElement(By.linkText("SignIn")).click();   
	    driver.findElement(By.id("userName")).sendKeys("Lalitha");
		driver.findElement(By.id("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
		
		driver.findElement(By.cssSelector("input[name='products'][type='text']")).sendKeys("Head");
		driver.findElement(By.cssSelector("input[value='FIND DETAILS'][type='submit']")).click();
		
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[2]/center/a")).click();
		
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a")).click();
		driver.findElement(By.cssSelector("input[value='Proceed to Pay'][type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'HDFC')]")).click();
		 driver.findElement(By.xpath("//*[@id='btn']")).click();
		 driver.findElement(By.cssSelector("input[name='username'][type='text']")).sendKeys("Lalitha");
		 driver.findElement(By.cssSelector("input[name='password'][type='password']")).sendKeys("password123");
		 driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
	}

	@Then("verify")
	public void verify() {
	   System.out.println("close");
	}

}