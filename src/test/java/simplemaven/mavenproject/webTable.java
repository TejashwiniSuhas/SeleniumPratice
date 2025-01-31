package simplemaven.mavenproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webTable {


    	static WebDriver driver;
    	static String url="https://www.letskodeit.com/practice";
    
    	@Test
	public static void process() {
		// TODO Auto-generated method stub
    		driver=new ChromeDriver();
		driver.get(url);
    	driver.manage().window().maximize();
        WebElement table= driver.findElement(By.id("product"));
        List<WebElement> rows=driver.findElements(By.tagName("tr"));
        List<WebElement> coulmns=driver.findElements(By.tagName("td"));
        WebElement heading=rows.get(0);
        String s=rows.get(1).findElements(By.tagName("td")).get(2).getText();//to find the value that is present in particular row and particular coulmn
        System.out.println(s);
        //to check if the value is present in webtable
        for(WebElement row:rows) {
        	List<WebElement> cells=row.findElements(By.tagName("td"));
        	for(WebElement cell:cells) {
        		if(cell.getText().equals("25")) {
        			System.out.println("value found");
        			break;
        		}
        	}
        }
	}

}
