package simplemaven.mavenproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
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
    @Test(dataProvider = "Tejashwini")
    public void loginData(String username,String passwordofUser) {
    	driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement dp=driver.findElement(By.xpath("//input[@id='user-name']"));
		dp.sendKeys(username);
		WebElement passwordele=driver.findElement(By.xpath("//input[@id='password']"));
		passwordele.sendKeys(passwordofUser);
		WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		    }
    
    @DataProvider(name="Tejashwini")
     public Object[][] testData() {
    	Object[][] ob= new Object[2][2];
    	ob[0][0]="standard_user";
    	ob[0][1]="secret_sauce";
    	ob[1][0]="locked_out_user";
    	ob[1][1]="secret_sauce";
    	return ob;
     }
    
    @Test(groups = {"Regression"})
	public void setup() {
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement usernamedp=driver.findElement(By.xpath("//input[@id='user-name']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;//js directly interact with dom (documnet object model)
		js.executeScript("arguments[0].value='standard_user';", usernamedp);
		//usernamedp.sendKeys(user);
		WebElement passwordele=driver.findElement(By.xpath("//input[@id='password']"));
		passwordele.sendKeys(password);
		WebElement loginButton=driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		loginButton.click();
	}
//    
//    
//    //@Test(dependsOnMethods = {"setup"})//creating dependency
//    //@Test(priority=1)//priortizing -2,-1,-3,0,1,2,3
//    //@Test(invocationCount = 3)//no of times test to execute
//    @Test(groups = {"Regression"})
//    public void testproductdetails() {
//    	WebElement addToCart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
//    	addToCart.click();
//    	WebElement cartButton=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
//    	cartButton.click();
//    	WebElement noOfItems=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
//    	String countItems=noOfItems.getText();
//    	System.out.println(countItems);
//    }
//    
//    @Test(groups = {"Sanity"})
//    public void utilisedetails() throws InterruptedException {
//    	WebElement hamBurger=driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
//    	hamBurger.click();
//    	WebElement about=driver.findElement(By.xpath("//a[@id='about_sidebar_link']"));
//    	Thread.sleep(Duration.ofSeconds(2));
//    	about.click();
//    	WebElement products=driver.findElement(By.xpath("(//span[text()='Products'])[1]"));
//    	products.click();
//    	WebElement crossBrowser=driver.findElement(By.xpath("(//span[text()='Sauce Cross-Browser'])[1]"));
//    	crossBrowser.click();
//    }
    
    @AfterClass
    public void close() {
    	driver.quit();
    }
   

}
