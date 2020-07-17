package commonpack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class Commonpack {
	 public static Properties p = null;
	 public static WebDriver driver ;
	 
	 static Logger logger = Logger.getLogger(Commonpack.class);
	
	
public  Properties pack1() throws IOException  {
		
	    
		FileInputStream fs= new FileInputStream("config.properties");
		
		p = new Properties();
		
		p.load(fs);
		
		return p ;
				
	
	}

@BeforeSuite 
public void driverpack() throws IOException {
	PropertyConfigurator.configure("log4j.properties");
	pack1();
	String url=p.getProperty("url");
	String locator = p.getProperty("locator");
	System.setProperty("webdriver.gecko.driver",locator);
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
	driver.get(url);
 }

}
