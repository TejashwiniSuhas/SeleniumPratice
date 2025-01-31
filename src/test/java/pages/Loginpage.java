package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	static WebDriver driver;
	static By emailId=By.xpath("//input[@id='user_email_login']");
    static By password=By.xpath("//input[@id='user_password']");
    static By signIn=By.xpath("//input[@id='user_submit']");
    
    public Loginpage(WebDriver driver) {
    	this.driver=driver;
    }
    
    public void logIn(String emailAddress,String passKey) {
    	driver.findElement(emailId).sendKeys(emailAddress);
    	driver.findElement(password).sendKeys(passKey);
    	driver.findElement(signIn).click();
    }
}
