package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signuppage {

      static WebDriver driver;
      //static By signIn=By.xpath("//span[text()='Sign in']");
      //static By signUp=By.xpath("(//a[text()='Sign up'])[1]");
      static By fullName=By.xpath("//input[@id='user_full_name']");
      static By emailId=By.xpath("//input[@id='user_email_login']");
      static By password=By.xpath("//input[@id='user_password']");
      static By checkBox=By.xpath("//input[@id='tnc_checkbox']");
      static By submit=By.xpath("//input[@id='user_submit']");
      
	public Signuppage(WebDriver driver){
		this.driver=driver;
	}
	
	public static void signIn(String name,String emailAddress,String passKey){		
//		https://www.browserstack.com/
		//driver.findElement(signIn).click();
		//driver.findElement(signUp).click();
		driver.findElement(fullName).sendKeys(name);
		driver.findElement(emailId).sendKeys(emailAddress);
		driver.findElement(password).sendKeys(passKey);
		driver.findElement(checkBox).click();
		driver.findElement(submit).click();
	}
}
