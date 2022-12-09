package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PO.Login2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

;

public class Step_Defination_Login2 {
	WebDriver driver;
	public Login2 obj1;
	@Given("Chrome browser") 
	public void chrome_browser() {
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		obj1 = new Login2(driver);

	}
	@When("User opens URL {string}")
	public void user_opens_url(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.get(string);

	}

	@When("User enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String string, String string2) {
		 obj1.entermailpass(string, string2);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("Click on Login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
		obj1.login();
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User Click on country")
	public void user_click_on_country() {
		 obj1.location();
		  obj1.country();
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}

	@When("User Click on add country")
	public void user_click_on_add_country() {
		  obj1.clickaddcountry();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("Enter the country name as {string}")
	public void enter_the_country_name_as(String string) {
		 obj1.Entercountry(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("user click on add")
	public void user_click_on_add() {
		 obj1.add();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("Close Browser")
	public void close_browser() {
		  driver.close();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	


}
