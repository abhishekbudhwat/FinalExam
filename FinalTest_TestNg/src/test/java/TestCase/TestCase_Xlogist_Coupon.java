package TestCase;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PO.PO_Xlogist_Coupon;
import Utility.BrowserManager;

public class TestCase_Xlogist_Coupon {
	WebDriver driver;
	JSONObject obj1;

	@BeforeClass
	public void beforeClass()
	{
	InputStream details=null;	
		
		try {
			String FileName="data/coupon.json";
			details=getClass().getClassLoader().getResourceAsStream(FileName);
			JSONTokener tokener=new JSONTokener(details);
			obj1=new JSONObject(tokener);
			System.out.println("data"+obj1.toString());
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
		@BeforeMethod 
		@Parameters({"browser","url"})
		public void setup(String browser, String url) throws InterruptedException {
			driver = BrowserManager.getDriver(browser); 
			Thread.sleep(3000);
			driver.get(url);
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			Thread.sleep(3000);
			
			
			
			
		}
	
	@Test(description="Testing add Coupon",priority=1)
	public void WithBlank()
	{
	
		String uname=obj1.getJSONObject("Blank").getString("Uname");
		String pass=obj1.getJSONObject("Blank").getString("Pass");
		String code=obj1.getJSONObject("Blank").getString("Code");
		PO_Xlogist_Coupon obj=PageFactory.initElements(driver,PO_Xlogist_Coupon.class);
		obj.login(uname, pass,code);
		System.out.print("pass");
}
	@Test(description="Testing add Coupon",priority=2)
	public void WithNumbers()
	{
	
		String uname=obj1.getJSONObject("Numbers").getString("Uname");
		String pass=obj1.getJSONObject("Numbers").getString("Pass");
		String code=obj1.getJSONObject("Numbers").getString("Code");
		PO_Xlogist_Coupon obj=PageFactory.initElements(driver,PO_Xlogist_Coupon.class);
		obj.login(uname, pass,code);
		System.out.print("pass");
}@Test(description="Testing add Coupon",priority=3)
public void Withalphabates()
{

	String uname=obj1.getJSONObject("alphabates").getString("Uname");
	String pass=obj1.getJSONObject("alphabates").getString("Pass");
	String code=obj1.getJSONObject("alphabates").getString("Code");
	PO_Xlogist_Coupon obj=PageFactory.initElements(driver,PO_Xlogist_Coupon.class);
	obj.login(uname, pass,code);
	System.out.print("pass");
}@Test(description="Testing add Coupon",priority=4)
public void Withspecialchar()
{

	String uname=obj1.getJSONObject("specialchar").getString("Uname");
	String pass=obj1.getJSONObject("specialchar").getString("Pass");
	String code=obj1.getJSONObject("specialchar").getString("Code");
	PO_Xlogist_Coupon obj=PageFactory.initElements(driver,PO_Xlogist_Coupon.class);
	obj.login(uname, pass,code);
	System.out.print("pass");
}@Test(description="Testing add Coupon",priority=5)
public void WithAlphanumeric()
{

	String uname=obj1.getJSONObject("Alphanumeric").getString("Uname");
	String pass=obj1.getJSONObject("Alphanumeric").getString("Pass");
	String code=obj1.getJSONObject("Alphanumeric").getString("Code");
	PO_Xlogist_Coupon obj=PageFactory.initElements(driver,PO_Xlogist_Coupon.class);
	obj.login(uname, pass,code);
	System.out.print("pass");
}
@Test(description="Testing add Coupon",priority=6)
public void Withspace()
{

	String uname=obj1.getJSONObject("space").getString("Uname");
	String pass=obj1.getJSONObject("space").getString("Pass");
	String code=obj1.getJSONObject("space").getString("Code");
	PO_Xlogist_Coupon obj=PageFactory.initElements(driver,PO_Xlogist_Coupon.class);
	obj.login(uname, pass,code);
	System.out.print("pass");
}@Test(description="Testing add Coupon",priority=7)
public void space()
{

	String uname=obj1.getJSONObject("space").getString("Uname");
	String pass=obj1.getJSONObject("space").getString("Pass");
	String code=obj1.getJSONObject("space").getString("Code");
	PO_Xlogist_Coupon obj=PageFactory.initElements(driver,PO_Xlogist_Coupon.class);
	obj.login(uname, pass,code);
	System.out.print("pass");
}
		@Test(description="Testing add Coupon",priority=8)
public void Max()
{

	String uname=obj1.getJSONObject("Max").getString("Uname");
	String pass=obj1.getJSONObject("Max").getString("Pass");
	String code=obj1.getJSONObject("Max").getString("Code");
	PO_Xlogist_Coupon obj=PageFactory.initElements(driver,PO_Xlogist_Coupon.class);
	obj.login(uname, pass,code);
	System.out.print("pass");
}
@AfterMethod
public void tearDown() {
	driver.close();
	
}

}
