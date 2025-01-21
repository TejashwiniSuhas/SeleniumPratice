package simplemaven.mavenproject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


public class Newwebsite {
    static String url="https://tutorialsninja.com/demo/";
    static WebDriver driver;
    
    @Test
	public static void page() {
		WebDriver driver =new ChromeDriver();
		driver.get(url);
		WebElement price=driver.findElement(By.xpath("(//p[@class='price'])[2]"));
		//TakeScreenShot
		TakesScreenshot tsh=(TakesScreenshot)driver;
		File src=tsh.getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\Tejaswini\\eclipse-workspace\\mavenproject\\target\\Output\\s1.jpeg";
		File destination=new File(path);
		try {
			FileHandler.copy(src, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(price.getText());
        
	}

}
