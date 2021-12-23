package org.step2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	WebDriver driver ;

	@Given("User should in login page")
	public void user_should_in_login_page() {

		WebDriverManager.chromedriver().setup();
		
		 driver  = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		driver.manage().window().maximize();
	}

	@When("User enter valid {string} and valid {string}")
	public void user_enter_valid_and_valid(String username, String string2) {
		
		
		WebElement in = driver.findElement(By.xpath("class=\"EPjEi\""));
		
		driver.switchTo().frame(in);
	   
		WebElement name = driver.findElement(By.name("username"));
		
		name.sendKeys(username);
		
		WebElement pass = driver.findElement(By.name("password"));
		
		pass.sendKeys(string2);
	}

	@When("user click login button")
	public void user_click_login_button() {
	   
		WebElement loginBtn = driver.findElement(By.xpath("//div[text()='Log In']"));
		loginBtn.click();
	}

	@Then("Next page should be open")
	public void next_page_should_be_open() {
	   
		String url = driver.getCurrentUrl();
		
		if (url==url) {
			
			System.out.println("plaese nter a valid mail");
		}
		else {
			System.out.println("Successfully login..............");
		}
	}

}
