package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.Loginpage;
import pages.Signuppage;
import simplemaven.mavenproject.Baseclass;

public class Signuptest extends Baseclass{

//		WebDriver driver;
        Loginpage login;
//        String url="https://www.browserstack.com/users/sign_in";
    
//        @BeforeSuite
//        public void signUpSetUp() {
//        	driver=new ChromeDriver();
//        	driver.manage().window().maximize();
//        	driver.get(url);
//        }  
        
        @Test(enabled=false)
        public void signUp() {
        	Signuppage signUp=new Signuppage(driver);
        	signUp.signIn("Tejashwini", "tejashwinikrishna08@gmail.com", "123456789");
        }
        
        @Test
        public void login() {
        	
        	login=new Loginpage(driver);
        	login.logIn("tejashwinikrishna08@gmail.com", "123456789");
        	System.out.println(driver.getTitle());
        	String actualTitle=driver.getTitle();
        	String expectedTitle="BrowserStack Login | Sign Into The Best Mobile & Browser Testing Tool";
        	Assert.assertEquals(actualTitle, expectedTitle);
        	//Assert.assertTrue(false);
        }
        
        @AfterSuite
        public void closeBrowser() {
        	driver.quit();
        }
        
}
