package simplemaven.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Frames {
	static String url="https://ui.vision/demo/webtest/frames/";
	static WebDriver driver;
	
	@Test
	public static void frame() {
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
       WebElement ele=driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
       //WebElement radioButton=driver.findElement(By.xpath("(//div[@class='rseUEf nQOrEb'])[1]"));
       WebElement radioButton=driver.findElement(By.xpath("(//label[@class='docssharedWizToggleLabeledContainer ajBQVb' and @for='i6']//div/following::span)[1]"));
       driver.switchTo().frame(2);
       driver.switchTo().frame(0);
       WebElement heading=driver.findElement(By.xpath("(//div[@dir='auto'])[1]"));
       String head=heading.getText();
       System.out.println(head);
       Actions ac=new Actions(driver);
       ac.moveToElement(radioButton).perform();
       System.out.println(radioButton.isDisplayed());
       System.out.println(radioButton.getText());
       
       //(//span[@class='M7eMe']/following::div[@class='rseUEf nQOrEb'])[1]
		driver.quit();	
	}

}
