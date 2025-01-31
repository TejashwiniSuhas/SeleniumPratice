package simplemaven.mavenproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class hiddenElement {
	
	static WebDriver driver;
	
    @Test
	public static void hidden() {
		// TODO Auto-generated method stub
          driver=new ChromeDriver();
          driver.get("https://www.letskodeit.com/practice");
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         WebElement hide= driver.findElement(By.id("hide-textbox"));
         hide.click();
         WebElement textbox=driver.findElement(By.id("displayed-text"));
         JavascriptExecutor js=(JavascriptExecutor)driver;
         js.executeScript("arguments[0].style.display='block';", textbox);//enable hidden textbox
         js.executeScript("arguments[0].value='Tejashwini'", textbox);
         String s=(String)js.executeScript("return arguments[0].value",textbox);
         //document.getElementById('displayed-text')
         System.out.println(s);
         driver.close();
	}

}
