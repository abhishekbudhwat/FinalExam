package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Ecommerce {
WebDriver driver ;
	
	public PO_Ecommerce(WebDriver driver)
	{
		this.driver=driver;
	}
 @FindBy(how=How.XPATH,using="//*[@id=\"useremail\"]")
 WebElement username;
 @FindBy(how=How.XPATH,using="//*[@id=\"password\"]")
 WebElement password;
 @FindBy(how=How.XPATH,using="//*[@id=\"LoginForm\"]/button")
 WebElement login;
 @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[1]/ul/li[3]/ul/li[1]/a")
 WebElement category;
 @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[1]/ul/li[3]/a")
 WebElement product;
 @FindBy(how=How.XPATH,using="//*[@id=\"bootstrap-data-table-export\"]/tbody/tr[1]/td[6]/a[1]")
 WebElement changename;
 @FindBy(how=How.XPATH,using="//*[@id=\"category_name\"]")
 WebElement entername;
 @FindBy(how=How.XPATH,using="//*[@id=\"editCategory\"]/div[2]/div/button")
 WebElement update;


 @FindBy(how=How.XPATH,using="//*[@id=\"bootstrap-data-table-export\"]/tbody/tr[1]/td[6]/a[2]")
 WebElement changimage;
 @FindBy(how=How.XPATH,using="//input[@id='inputFile-2']")
 WebElement updateimage;
 @FindBy(how=How.XPATH,using="//*[@id=\"addSubcategory\"]/div/div[2]/div/div/button")
 WebElement clickupdateimage;


 public void username(String uname)
 {
	 username.sendKeys(uname);
	
 }
 public void password(String pass)
 {
	 password.sendKeys(pass); 
 }
 public void signup()
 {
	login.click();;

 }
 public void product()
 {
	 product.click();;

 }
 public void category()
 {
	 category.click();;

 }
 
 
 public void changename()
 {
	 changename.click();;

 }
 public void entername(String name)
 {
	 entername.clear();
	 entername.sendKeys(name); 
 }
 public void update()
 {
	 update.click();;

 }
 
 public void changimage()
 {
	 changimage.click();;

 }
 public void updateimage(String image)
 {
	 updateimage.sendKeys(image);;;

 }
 public void clickupdateimage()
 {
	 clickupdateimage.click();
 }



 
 
 public void login(String uname,String pass,String name,String image)
 {try {
	 username(uname);
	
	 password(pass);
	
	 signup();
	 product();
	 category();
	 changename();
	 entername(name);
	 Thread.sleep(1000);
	 update();
	 Thread.sleep(1000);
	 changimage();
	 Thread.sleep(3000);
	 updateimage(image);
	 Thread.sleep(3000);
	 clickupdateimage();
	 Thread.sleep(3000);
 }catch(Exception e)
 {
	e.printStackTrace(); 
}
}
}
