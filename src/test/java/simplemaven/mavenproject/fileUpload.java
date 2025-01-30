package simplemaven.mavenproject;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class fileUpload {
	static String url="https://demo.guru99.com/test/upload/";
    static WebDriver driver;
    
    @Test
	public static void fileupload() {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
	       driver.get(url);
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait it will apply wait for all the elements
	     WebElement browse=driver.findElement(By.xpath("//input[@class='upload_txt']"));
//	     browse.click();
	     browse.sendKeys("C:\\Users\\Tejaswini\\Desktop\\git demo\\.project");
	     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));//explicit wait it will apply for only for particular element at a time
	     wait.until(ExpectedConditions.visibilityOf(browse));
	     //fluent wait
	     Wait fluent=new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	       fluent.until(ExpectedConditions.visibilityOf(browse));
	     try {
			Thread.sleep(Duration.ofSeconds(3));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//	     browse.click();
	}

}
