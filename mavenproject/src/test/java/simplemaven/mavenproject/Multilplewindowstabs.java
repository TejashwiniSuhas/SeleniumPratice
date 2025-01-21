package simplemaven.mavenproject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Multilplewindowstabs {
	static String url="https://demo.automationtesting.in/Windows.html";
    static WebDriver driver;
    
    @Test
	public static void windows() throws InterruptedException {
		// TODO Auto-generated method stub
       driver=new ChromeDriver();
       driver.get(url);
       driver.manage().window().maximize();
       String Parenttile=driver.getTitle();
       System.out.println(Parenttile);
		Thread.sleep(Duration.ofSeconds(2));
	   WebElement newTab=driver.findElement(By.xpath("//a[text()='Open New Tabbed Windows ']"));
	   newTab.click();
	   String parent=driver.getWindowHandle();
	   System.out.println(parent);
	   WebElement click=driver.findElement(By.xpath("//button[text()='    click   ']"));
	   click.click();
	   Set<String> hd=driver.getWindowHandles();
	   Iterator<String> ihd=hd.iterator();
	   while(ihd.hasNext()) {
		   String child=ihd.next();
		   if(!parent.equals(child)) {
			   driver.switchTo().window(child);
			   String newtabTitle=driver.getTitle();
			   System.out.println(newtabTitle);
			   WebElement subtitle=driver.findElement(By.xpath("//h4[text()='Selenium WebDriver']"));
			   Actions ac=new Actions(driver);
			   WebElement readmoreElement=driver.findElement(By.xpath("//a[@class='selenium-button selenium-webdriver text-uppercase fw-bold']"));		     			   
			   WebElement browserStack=driver.findElement(By.xpath("//img[@title='BrowserStack']"));
			   ac.moveToElement(browserStack).perform();
			   ac.moveToElement(readmoreElement).perform();
//			   Boolean enable=readmoreElement.isEnabled();
//			   System.out.println(enable);			   
//			   browserStack.click();
			   readmoreElement.click();
			   driver.close();
		   }
	   }
	   driver.switchTo().window(parent);
       driver.quit();
	}

}
