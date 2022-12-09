package PO;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2 {
	public WebDriver driver;
    public Login2(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//*[@id=\"useremail\"]")
    @CacheLookup
    WebElement useremail_login;
    
    @FindBy(xpath = "//*[@id=\"password\"]")
    @CacheLookup
    WebElement password_login;
    
    @FindBy(xpath = "//*[@id=\"LoginForm\"]/button")
    @CacheLookup
    WebElement login_button; 
    @FindBy(xpath = "//div[@class=\"page-title\"]//h1")
    @CacheLookup
    WebElement DashboardHeader;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/ul/li[2]/a")
    @CacheLookup
    WebElement location;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/ul/li[2]/ul/li[1]/a")
    @CacheLookup
    WebElement country;
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")
    @CacheLookup
    WebElement addcountry;
    @FindBy(xpath = "//*[@id=\"Country\"]")
    @CacheLookup
    WebElement Entercountry;
    @FindBy(xpath = "//*[@id=\"addCountry\"]/div/div[2]/div/div/button")
    @CacheLookup
    WebElement add;
    public void entermailpass(String str1, String str2)
    {
    	useremail_login.sendKeys(str1);
    	password_login.sendKeys(str2);
    	login_button.click();
    }
    public void login()
    {
    	
    	login_button.click();
    }
    public void location()
    {
    	
    	location.click();
    }
    public void country()
    {
    	
    	country.click();
    }
    public void clickaddcountry( ) {
    
			addcountry.click();
    }
    public void Entercountry(String str3 ) {
        
    	Entercountry.sendKeys(str3);
}
 public void add( ) {
        
    	add.click();
}
    
    
}
