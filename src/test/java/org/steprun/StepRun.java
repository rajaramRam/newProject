package org.steprun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepRun {

	WebDriver driver;

	@Given("User in login page")
	public void user_in_login_page() {

		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();
	}

	@When("User should enter valid {string} and invalid {string}")
	public void user_should_enter_valid_and_invalid(String string, String string2) {

		WebElement mailTxt = driver.findElement(By.id("email"));
		mailTxt.sendKeys(string);

		WebElement passTxt = driver.findElement(By.id("pass"));
		passTxt.sendKeys(string2);

	}

	@When("User sholud click login button")
	public void user_sholud_click_login_button() {

		WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Log In']"));
		loginBtn.click();

	}

	
	@Then("Verify Error message should be displayed")
	public void verify_Error_message_should_be_displayed() {

		String url = driver.getCurrentUrl();
		
		if (url.contains("privacy_mutation_token")) {
			
			System.out.println("Password is invalid");
		}
		else {
			System.err.println("The function is not properly working");
		}

	

	}
}
