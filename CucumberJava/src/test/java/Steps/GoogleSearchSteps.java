package Steps;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	WebDriver driver = null;
	
	
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside Step - browser is open");
//		
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is " + projectPath);
//		
//		System.setProperty("webDriver.chrome.driver", projectPath + "test/resources/drivers/chromedriver.exe");
//		
//		driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//	}
//	
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("Inside Step - user is on google search page");
//		
//		driver.navigate().to("https://google.com");
//	}
//	
//	@And("user rejects pop up")
//	public void user_rejects_pop_up() {
//		System.out.println("Inside Step - user rejects cookies"); 
//		
//		driver.findElement(By.id("W0wltc")).click();
//		
//	}
//
//	@When("user enters a text in search box")
//	public void user_enters_a_text_in_search_box() throws InterruptedException {
//		System.out.println("Inside Step - user enters a text in search box");
//		
//		driver.findElement(By.name("q")).sendKeys("Middlesbrough FC website");
//		
//		Thread.sleep(2000);
//	}
//
//	@And("hits enter")
//	public void hits_enter() throws InterruptedException {
//		System.out.println("Inside Step - hits enter");
//		
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//
//		Thread.sleep(2000);
//	}
//
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//		System.out.println("Inside Step - user is navigated to search results");
//		
//		driver.getPageSource().contains("News");
//		driver.close();
//		driver.quit();
//
//	}

}
