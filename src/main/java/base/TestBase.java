package base;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


//import utilities.LoadProperties;



public class TestBase {
	
 
	public static WebDriver driver ; 
	public static Logger logger = Logger.getLogger(TestBase.class);
	public static Properties userdata=  loadProperties (System.getProperty("user.dir")+"\\userdata.properties");

	private static Properties loadProperties(String path)
	{

        Properties pro= new Properties();
        FileInputStream stream;
		try {
			stream = new FileInputStream(path);
			  pro.load(stream);
		} catch (FileNotFoundException e) {
			System.out.println("Error occurred :  " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Error occurred :  " + e.getMessage());
		}
		catch (NullPointerException e) {
			System.out.println("Error occurred :  " + e.getMessage());
		} 
		return pro;
      
        
		
	}


	public static void openBrowser(String URL) 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/driver/chromedriver.exe");
		driver = new ChromeDriver();
		 ChromeOptions opt = new ChromeOptions();      
	     opt.addArguments("−−lang=ar");     
	     
	    
	    //   opt.setCapability("build", "[Java] Locale Testing with Chrome & Windows on LambdaTest Selenium Grid");
	      // opt.setCapability("name", "[Java] Locale Testing with Chrome & Windows on LambdaTest Selenium Grid");
	       opt.setCapability("platform", "Windows 10");
	       opt.setCapability("browserName", "Chrome");
	       opt.setCapability("version","80.0");
	       opt.setCapability("tunnel",false);
	       opt.setCapability("network",true);
	       opt.setCapability("console",true);
	       opt.setCapability("visual",true);
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		}

}
