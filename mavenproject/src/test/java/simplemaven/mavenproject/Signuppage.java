package simplemaven.mavenproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Signuppage {
	static WebDriver driver;
	static String url="https://www.saucedemo.com/";
	static String user="standard_user";
    static String password="secret_sauce";
  //button[@id='add-to-cart-sauce-labs-backpack']
  //span[@class="shopping_cart_badge"]
  //a[@class="shopping_cart_link"]
  //button[@id='react-burger-menu-btn']
  //a[@id='about_sidebar_link']
    // (//span[text()='Products'])[1]
    // (//span[text()='Sauce Cross-Browser'])[1]
    @Test
	public void setup() {
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys(user);
		WebElement passwordele=driver.findElement(By.xpath("//input[@id='password']"));
		passwordele.sendKeys(password);
		WebElement loginButton=driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		loginButton.click();
	}
    
    
    @Test
    public void testproductdetails() {
    	WebElement addToCart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
    	addToCart.click();
    	WebElement cartButton=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
    	cartButton.click();
    	WebElement noOfItems=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
    	String countItems=noOfItems.getText();
    	System.out.println(countItems);
    }
    
    @Test
    public void utilisedetails() throws InterruptedException {
    	WebElement hamBurger=driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
    	hamBurger.click();
    	WebElement about=driver.findElement(By.xpath("//a[@id='about_sidebar_link']"));
    	Thread.sleep(Duration.ofSeconds(2));
    	about.click();
    	WebElement products=driver.findElement(By.xpath("(//span[text()='Products'])[1]"));
    	products.click();
    	WebElement crossBrowser=driver.findElement(By.xpath("(//span[text()='Sauce Cross-Browser'])[1]"));
    	crossBrowser.click();
    }
    
    @AfterClass
    public void close() {
    	driver.quit();
    }
   

}
