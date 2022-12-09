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

import PO.PO_Ecommerce;
import PO.PO_Xlogist_Coupon;
import Utility.BrowserManager;

public class TestCase_Ecommerce {
	WebDriver driver;
	JSONObject obj1;

	@BeforeClass
	public void beforeClass()
	{
	InputStream details=null;	
		
		try {
			String FileName="data/ecommerce.json";
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
	public void Valid()
	{
	
		String uname=obj1.getJSONObject("Valid").getString("Uname");
		String pass=obj1.getJSONObject("Valid").getString("Pass");
		String name=obj1.getJSONObject("Valid").getString("Name");
		String image=obj1.getJSONObject("Valid").getString("Image1");
		PO_Ecommerce obj=PageFactory.initElements(driver,PO_Ecommerce.class);
		obj.login(uname, pass,name,image);
		System.out.print("pass");
}

	@Test(description="Testing add Coupon",priority=2)
	public void Maxchar()
	{
	
		String uname=obj1.getJSONObject("Maxchar").getString("Uname");
		String pass=obj1.getJSONObject("Maxchar").getString("Pass");
		String name=obj1.getJSONObject("Maxchar").getString("Name");
		String image=obj1.getJSONObject("Maxchar").getString("Image1");
		PO_Ecommerce obj=PageFactory.initElements(driver,PO_Ecommerce.class);
		obj.login(uname, pass,name,image);
		System.out.print("pass");
}

	@Test(description="Testing add Coupon",priority=3)
	public void numbers()
	{
	
		String uname=obj1.getJSONObject("numbers").getString("Uname");
		String pass=obj1.getJSONObject("numbers").getString("Pass");
		String name=obj1.getJSONObject("numbers").getString("Name");
		String image=obj1.getJSONObject("numbers").getString("Image1");
		PO_Ecommerce obj=PageFactory.initElements(driver,PO_Ecommerce.class);
		obj.login(uname, pass,name,image);
		System.out.print("pass");
}
	@Test(description="Testing add Coupon",priority=4)
	public void specialchar()
	{
	
		String uname=obj1.getJSONObject("numbers").getString("Uname");
		String pass=obj1.getJSONObject("numbers").getString("Pass");
		String name=obj1.getJSONObject("numbers").getString("Name");
		String image=obj1.getJSONObject("numbers").getString("Image1");
		PO_Ecommerce obj=PageFactory.initElements(driver,PO_Ecommerce.class);
		obj.login(uname, pass,name,image);
		System.out.print("pass");
}
	@Test(description="Testing add Coupon",priority=5)
	public void blank()
	{
	
		String uname=obj1.getJSONObject("blank").getString("Uname");
		String pass=obj1.getJSONObject("blank").getString("Pass");
		String name=obj1.getJSONObject("blank").getString("Name");
		String image=obj1.getJSONObject("blank").getString("Image1");
		PO_Ecommerce obj=PageFactory.initElements(driver,PO_Ecommerce.class);
		obj.login(uname, pass,name,image);
		System.out.print("pass");
}
	@Test(description="Testing add Coupon",priority=6)
	public void alphanumeric()
	{
	
		String uname=obj1.getJSONObject("alphanumeric").getString("Uname");
		String pass=obj1.getJSONObject("alphanumeric").getString("Pass");
		String name=obj1.getJSONObject("alphanumeric").getString("Name");
		String image=obj1.getJSONObject("alphanumeric").getString("Image1");
		PO_Ecommerce obj=PageFactory.initElements(driver,PO_Ecommerce.class);
		obj.login(uname, pass,name,image);
		System.out.print("pass");
}
	
	@Test(description="Testing add Coupon",priority=7)
	public void blankimage()
	{
	
		String uname=obj1.getJSONObject("blankimage").getString("Uname");
		String pass=obj1.getJSONObject("blankimage").getString("Pass");
		String name=obj1.getJSONObject("blankimage").getString("Name");
		String image=obj1.getJSONObject("blankimage").getString("Image1");
		PO_Ecommerce obj=PageFactory.initElements(driver,PO_Ecommerce.class);
		obj.login(uname, pass,name,image);
		System.out.print("pass");
}





	@AfterMethod
	public void tearDown() {
		driver.close();
		
	}}