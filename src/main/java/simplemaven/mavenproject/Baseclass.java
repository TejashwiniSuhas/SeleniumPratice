package simplemaven.mavenproject;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Baseclass {
	public static WebDriver driver;
	static String path="C:\\Users\\Tejaswini\\eclipse-workspace\\mavenproject\\src\\test\\java\\Resources\\Config.properties";
	
	@BeforeSuite
	public static void preProcess() {
	try { 
	     FileInputStream filePath=new FileInputStream(path);
	     Properties props=new Properties();
	     props.load(filePath);
	     driver=new ChromeDriver();
	     driver.get(props.getProperty("url"));
	     driver.manage().window().maximize();
	  
     }
     catch(Exception e) {
    	 e.printStackTrace();
     }
	}
}
