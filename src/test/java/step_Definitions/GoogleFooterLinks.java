package step_Definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleFooterLinks {

	@Given("^I go to Google Home Page$")
	public void i_go_to_Google_Home_Page() throws Throwable {
		System.setProperty("webdriver.driver.chrome", "C:/Users/Mosarrof Hossain/Utilities/chromedriver.exe");

		//WebDriver driver = new ChromeDriver();
		
		/*GoogleFooterLinks obj = new GoogleFooterLinks();
		obj.homePage();
		obj.privacy();
		obj.privacyPage();
		obj.terms();
		obj.termsPage();
		obj.settings();
		obj.settingsPage();*/

		//driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@When("^I click on the Privacy Link$")
	public void i_click_on_the_Privacy_Link() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.linkText("Privacy")).click();
		driver.close();

	}

	@Then("^I see the Privacy Page$")
	public void i_see_the_Privacy_Page() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.linkText("Privacy")).click();
		if(driver.getPageSource().contains("Privacy"))
			System.out.println("The Privacy link test passed");
		else
			System.out.println("The privacy link test failed");
		Assert.assertEquals(true, driver.getPageSource().contains("Privacy"));
		driver.close();
	}
	@When("^I click on the Terms Link$")
	public void i_click_on_the_Terms_Link() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.linkText("Terms")).click();
		driver.close();

	}

	@Then("^I see the Terms Page$")
	public void i_see_the_Terms_Page() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.linkText("Terms")).click();
		if(driver.getPageSource().contains("Terms"))
			System.out.println("The Terms link test passed");
		else
			System.out.println("The terms link test failed");
		Assert.assertEquals(true, driver.getPageSource().contains("Terms"));
		driver.close();
	}
	@When("^I click on the Settings Link$")
	public void i_click_on_the_Settings_Link() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.linkText("Settings")).click();
		driver.close();

	}

	@Then("^I see the Settings Page$")
	public void i_see_the_Settings_Page() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.linkText("Settings")).click();
		if(driver.getPageSource().contains("Settings"))
			System.out.println("The settings link test passed");
		else
			System.out.println("The setting link test failed");
		Assert.assertEquals(true, driver.getPageSource().contains("Settings"));
		driver.close();
	}
}
