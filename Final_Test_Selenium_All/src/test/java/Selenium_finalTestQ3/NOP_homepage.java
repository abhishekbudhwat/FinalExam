package Selenium_finalTestQ3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NOP_homepage {
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
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
