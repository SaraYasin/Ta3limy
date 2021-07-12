package test.cases;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.RegisterPage;

public class Registeration extends TestBase {
	
String url= userdata.getProperty("url");
	
	HomePage homeObject;
	RegisterPage registerObject;
	String userType = userdata.getProperty("userType");
	String fName = userdata.getProperty("fName");
	String lName = userdata.getProperty("lName");
	String mobileNum = userdata.getProperty("mobileNum");
	String gender = userdata.getProperty("gender");
	String ageRange = userdata.getProperty("ageRange");
	String password = userdata.getProperty("password");
	
	@BeforeMethod
	public void OpenURL () 
	{
		 openBrowser(url);	
		  homeObject = new HomePage(driver); 
		  registerObject= new RegisterPage(driver);
		  assertTrue(homeObject.VerifyHomePage());
	}
	
  @Test
  public void RegisterAsParent() throws InterruptedException  
  {
	  
	  homeObject.openReqisterPage();
	  registerObject.UserRegister(userType, fName, lName, mobileNum, gender,ageRange, password);
	   assertTrue(registerObject.isSuccessfullRegister());
	  
  }

}
