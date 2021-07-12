package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.PageBase;


public class HomePage extends PageBase {
	
	public HomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver; 
		action = new Actions(driver); 
		 wait= new WebDriverWait(driver, 20);
		//wait = new WebDriverWait(driver, 60);
	}
	
	
	
	By svgList= By.xpath("//*[@id='help-menu']");	
	By questionsTab = By.xpath("//a[@href='/faq']");
	By registerTab =  By.xpath("(//*[@href='/register'])[1]");
	By manasaTa3limyVerification =  By.xpath("//h2[text()='منصة تعليمي']");
	
	
		 
		 public void openQuestionsPage ()
		 {
			 clickButton(drvier, svgList);
			 clickButton(drvier, questionsTab);
			 
			 
		 }
		 
		 public void openReqisterPage ()
		 {
			 clickButton(drvier, registerTab);
						 
			 
		 }
		 
		 public boolean VerifyHomePage ()
		 {
			 WebElement elementmanasaTa3limy = drvier.findElement(manasaTa3limyVerification);
			 if(!elementmanasaTa3limy.isDisplayed())	
			 {
				 return false;
			 }
			 return true;
		 }
		
		
		
}
