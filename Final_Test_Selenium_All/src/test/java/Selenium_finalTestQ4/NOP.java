package Selenium_finalTestQ4;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class NOP {
	public static void main(String[]args)
	{try{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.nopcommerce.com/en");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement usericon =driver.findElement(By.xpath("((//ul[@class = 'navigation-top-menu navigation-top-menu-user-actions'])/li)[3]"));
	WebElement registerlink=driver.findElement(By.xpath("((//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]"));
	Actions action=new Actions(driver);
	action.moveToElement(usericon);
	action.click(registerlink).build().perform();
	Thread.sleep(3000);
	WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
	WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
	WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
	WebElement Cemail = driver.findElement(By.xpath("//input[@Id='ConfirmEmail']"));
	WebElement time = driver.findElement(By.xpath("//select[@id='TimeZoneId']"));
	WebElement userName = driver.findElement(By.xpath("//input[@id='Username']"));
	Select dropDown = new Select(driver.findElement(By.xpath("(//select[@name='CountryId'])[1]")));  
	Select timeDrop = new Select(time);
	WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
	WebElement Cpassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));	
	Select dropDown1 = new Select(driver.findElement(By.xpath("//select[@id='Details_CompanyIndustryId']")));
	Select dropDown2 = new Select(driver.findElement(By.xpath("//select[@id='Details_CompanyRoleId']")));
	Select dropDown3 = new Select(driver.findElement(By.xpath("//select[@id='Details_WebsitesDevelopmentPeriodId']")));
	Select DropDown4 = new Select(driver.findElement(By.xpath("//select[@id='Details_CompanySizeId']")));
	WebElement radioBNo = driver.findElement(By.xpath("((//div[@class='custom-control custom-radio custom-control-inline'])[2]/label)[1]"));
	WebElement radioBYes = driver.findElement(By.xpath("((//div[@class='custom-control custom-radio custom-control-inline'])[1]/label)[1]"));
	WebElement inputText = driver.findElement(By.xpath("//input[@id='Details_CompanyWebsiteUrl']"));
	WebElement register = driver.findElement(By.name("register-button"));
	firstName.sendKeys("Abhishel");
	lastName.sendKeys("Budhwat");
	email.sendKeys("abhishel1111q1@gmail.com");
	Cemail.sendKeys("abhishel1111q1@gmail.com");
	userName.sendKeys("Abhhisss1234");
	password.sendKeys("Pass@123456");
	Cpassword.sendKeys("Pass@123456");
	dropDown.selectByVisibleText("India");
	timeDrop.selectByVisibleText("(UTC-10:00) Hawaii");
	dropDown1.selectByIndex(1);
	dropDown2.selectByIndex(2);
	dropDown3.selectByVisibleText("We are going to start");
	DropDown4.selectByIndex(2);
	radioBYes.click();
	radioBNo.click();
	Thread.sleep(2000);
	inputText.sendKeys("www.google.com");
	register.click();
	File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(screenShotFile, new File(".//Screenshots/screen.png"));
	driver.quit();
	}catch(Exception e){
		e.printStackTrace();
	}
	
}
	}
