package simplemaven.mavenproject;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Register {
	static String url="https://demo.automationtesting.in/Windows.html";
    static WebDriver driver;
    
    @Test(groups = {"Regression"})
	public static void Register() throws Exception {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
	       driver.get(url);
	       driver.manage().window().maximize();
	       driver.navigate().refresh();
	       JavascriptExecutor js=(JavascriptExecutor)driver;
	       WebElement newWindow=driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']"));
	       //newWindow.click();
	       js.executeScript("arguments[0].click();", newWindow);
	       String parent=driver.getWindowHandle();
	       WebElement click=driver.findElement(By.xpath("//button[@onclick='multiwindow()']"));
		   click.click();
		   Set<String> hd=driver.getWindowHandles();//it gives all the windows unique id along with parent also
		   Iterator<String> ihd=hd.iterator();
		   while(ihd.hasNext()) {
			   String child=ihd.next();
			   driver.switchTo().window(child);
			   if(driver.getTitle().equalsIgnoreCase("Index")) {				   
				   System.out.println(driver.getTitle());
				   WebElement forward=driver.findElement(By.xpath("//img[@id='enterimg']"));
				   forward.click();
				   Thread.sleep(Duration.ofSeconds(3));
				 WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
				 firstName.sendKeys("Tejashwini");
				 WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
				 lastName.sendKeys("Krishna");
				 WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
				email.sendKeys("tejashwinikrishna08@gmail.com");
				WebElement phno=driver.findElement(By.xpath("//input[@type='tel']"));
				phno.sendKeys("8296295860");
				 WebElement Gender=driver.findElement(By.xpath("//input[@value='FeMale']"));
				  Gender.click();
				 WebElement hobbies=driver.findElement(By.xpath("//input[@id='checkbox1']"));
				 hobbies.click();
				 WebElement lang=driver.findElement(By.xpath("//div[@id='msdd']"));	
				List<WebElement> l1=driver.findElements(By.xpath("//div[@id='msdd']/following::div//ul//li//a"));
				for(WebElement l2:l1) {
					if(l2.equals("Arabic"))
					{
						l2.click();
					}
				}
				 WebElement skills=driver.findElement(By.xpath("//select[@id='Skills']"));
				Select s=new Select(skills);
				  s.selectByVisibleText("Java");
				  WebElement interaction=driver.findElement(By.xpath("//a[text()='Interactions ']"));
				   interaction.click();
				   WebElement dragdrop=driver.findElement(By.xpath("//a[text()='Drag and Drop ']"));
				   dragdrop.click();
				   WebElement staticdrag=driver.findElement(By.xpath("//a[text()='Static ']"));
				   staticdrag.click();
				   WebElement srcdrag=driver.findElement(By.xpath("//img[@id='mongo']"));
				   WebElement srcdrop=driver.findElement(By.xpath("//div[@id='droparea']"));
				   Actions ac=new Actions(driver);
				   ac.dragAndDrop(srcdrag, srcdrop).perform();
				   Thread.sleep(Duration.ofSeconds(4));
				   WebElement switchTo=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
				   switchTo.click();
				   WebElement alerts=driver.findElement(By.xpath("//a[text()='Alerts']"));
				   alerts.click();
				   WebElement alert1=driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
				   if(alert1.isEnabled()) {
					   
					   WebElement alert01=driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]"));
					   alert01.click();
					   Thread.sleep(Duration.ofSeconds(4));
					   driver.switchTo().alert().accept();				   
				   }
				   WebElement alert2=driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
				   alert2.click();
				   WebElement prompt=driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
				   prompt.click();
				   Alert a=driver.switchTo().alert();
				   a.sendKeys("Tejashwini");
				   Thread.sleep(Duration.ofSeconds(6));
				   a.accept();
				   driver.close(); 
			   }
		   }
		   
		   driver.switchTo().window(parent);
		   driver.quit();
	}

}
