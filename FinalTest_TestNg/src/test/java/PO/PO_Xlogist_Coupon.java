package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class PO_Xlogist_Coupon {
WebDriver driver ;
	
	public PO_Xlogist_Coupon(WebDriver driver)
	{
		this.driver=driver;
	}
 @FindBy(how=How.XPATH,using="//*[@id=\"useremail\"]")
 WebElement username;
 @FindBy(how=How.XPATH,using="//*[@id=\"password\"]")
 WebElement password;
 @FindBy(how=How.XPATH,using="//*[@id=\"LoginForm\"]/button")
 WebElement login;
 @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[1]/ul/li[8]/a")
 WebElement coupon;
 @FindBy(how=How.XPATH,using=" /html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")
 WebElement addcoupon;
 @FindBy(how=How.XPATH,using="//*[@id=\"coupon_name\"]")
 WebElement couponcode;
 @FindBy(how=How.XPATH,using="//*[@id=\"addcategory\"]/div/div[2]/div/div/button")
 WebElement add;

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
 public void clickcoupon()
 {
	 coupon.click();;

 }
 public void clickaddcoupon()
 {
	 addcoupon.click();;

 }
 public void EnterCouponCode(String code)
 {
	 couponcode.sendKeys(code); 
 }
 public void clickadd()
 {
	 add.click();;

 }
 public void login(String uname,String pass,String code)
 {try {
	 username(uname);
	
	 password(pass);
	
	 signup();
	 clickcoupon();
	 clickaddcoupon();
	 EnterCouponCode( code);
	 clickadd();
	 Thread.sleep(2000);
 }catch(Exception e)
 {
	e.printStackTrace(); 
}
 }
 
}
