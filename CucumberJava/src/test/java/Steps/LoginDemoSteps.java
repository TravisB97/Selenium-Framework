package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginDemoSteps {
	
	WebDriver driver = null;
	
	@Given("brower is open")
	public void brower_is_open() {
		System.out.println("Inside Step - browser is open");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is " + projectPath);
		
		System.setProperty("webDriver.chrome.driver", projectPath + "test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}

	@And("user is on login page")
	public void user_is_on_login_page() {

		driver.navigate().to("https://login.mfc.co.uk/auth/login");
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		driver.findElement(By.id("Email")).sendKeys("borofield97@hotmail.co.uk");
		driver.findElement(By.id("Password")).sendKeys("Boro1986");
		
		Thread.sleep(2000);
	}

	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		
		driver.findElement(By.id("submitForm")).click();
		
		Thread.sleep(3000);
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		
		driver.findElement(By.id("signIn-a")).isDisplayed();
		
		driver.close();
		driver.quit();
	}

	
}
