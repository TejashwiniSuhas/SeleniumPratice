package simplemaven.mavenproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
	     WebElement browse=driver.findElement(By.xpath("//input[@class='upload_txt']"));
//	     browse.click();
	     browse.sendKeys("C:\\Users\\Tejaswini\\Desktop\\git demo\\.project");
	     try {
			Thread.sleep(Duration.ofSeconds(3));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//	     browse.click();
	}

}
