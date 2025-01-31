package simplemaven.mavenproject;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import mavenproject.src.test.java.pages.Loginpage;

public class Baseclass {
	static WebDriver driver;
	static String path="C:\\Users\\Tejaswini\\eclipse-workspace\\mavenproject\\src\\test\\java\\Resources\\Config.properties";
	Loginpage login;
	
	public static void preProcess() {
	try { 
	     FileInputStream filePath=new FileInputStream(path);
	     Properties props=new Properties();
	     props.load(filePath);
	     driver=new ChromeDriver();
	     driver.get(props.getProperty("url"));
	     driver.manage().window().maximize();
	     login=new Loginpage(driver);
	  
     }
     catch(Exception e) {
    	 e.printStackTrace();
     }
	}
}
