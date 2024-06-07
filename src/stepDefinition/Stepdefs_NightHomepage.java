package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefs_NightHomepage {
	
	
	WebDriver driver=null;
	
	@Given("^I launch Chrome browser$")
	public void i_launch_Chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\254223\\eclipse-workspace\\Test1\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		throw new PendingException();
	}

	@When("^I open ESPNCricinfo Homepage$")
	public void i_open_ESPNCricinfo_Homepage() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.espncricinfo.com/");
		throw new PendingException();

	}

	@Then("^I verify that the ESPNCricinfo homepage displays$")
	public void i_verify_that_the_ESPNCricinfo_homepage_displays() {
	    // Write code here that turns the phrase above into concrete actions
		String pageTitle=driver.getTitle();
		String ExpectedTitle="Today's Cricket Match | Cricket Update | Cricket News | ESPNcricinfo";
		Assert.assertEquals(ExpectedTitle, pageTitle);

		throw new PendingException();
	}

	@When("^I click on Night mode$")
	public void i_click_on_Night_mode() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement darkMode=driver.findElement(By.xpath("//i[@class='icon-dark_mode-filled ds-text-icon-inverse']"));
		darkMode.click();
		throw new PendingException();
	}

	@Then("^I verfiy that ESPNCricinfo homepage displays in Night mode$")
	public void i_verfiy_that_ESPNCricinfo_homepage_displays_in_Night_mode() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement dayMode=driver.findElement(By.xpath("//i[@class='icon-wb_sunny-filled ds-text-icon-inverse']"));
		Boolean dayModeCheck=dayMode.isDisplayed();
		//assertTrue(dayModeCheck);
		throw new PendingException();
	}


	
}
