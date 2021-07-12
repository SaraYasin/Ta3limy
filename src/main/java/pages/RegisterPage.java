package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.PageBase;

public class RegisterPage extends PageBase{
	public RegisterPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver; 
		action = new Actions(driver); 
		wait = new WebDriverWait(driver,10000);
	}
	
	By firstNameTxtBox =By.id("firstName"); 
    By lastNameTxtBox =By.id("lastName"); 
	By mobileNumTxtBox = By.id("mobileNumber") ; 
	By passwordTxtBox  = By.id("password"); 
	By confirmPasswordTxtBox = By.id("passwordConfirmation") ;
	By parentAgreeBox = By.xpath("(//*[@class='css-ubxa2z e185xscr0'])[11]");
	By notRopotCeckBox = By.className("recaptcha-checkbox-border");
    By submitBtn = By.xpath("//*[@data-cy='submitButton']");
    By ageRangeSelect =By.id("ageRange"); 
    By verificationMsg = By.xpath("//*[@class='css-121zpm8 e5s9rrm0']");
    
	
	public void UserRegister ( String userType , String fName, String lName, String mobileNumber , String gender,String ageRange, String password) throws InterruptedException 
	{
		
		//wait.until(ExpectedConditions.visibilityOf(retriveUserType(userType)));
		Thread.sleep(1000);
		selectUserType(userType);
		setTextElementText(drvier, firstNameTxtBox, fName);
		setTextElementText(drvier, lastNameTxtBox, lName);
		setTextElementText(drvier, mobileNumTxtBox, mobileNumber);
		jse.executeScript("arguments[0].scrollIntoView();", (retriveGender(gender)));
		Thread.sleep(1000);
		selectGender(gender);
		selectAgeRange(ageRange);
		//jse.executeScript("arguments[0].scrollIntoView();", passwordTxtBox);
		setTextElementText(drvier, passwordTxtBox, password);
		setTextElementText(drvier, confirmPasswordTxtBox, password);
		WebElement parentAgreeBoxElement = drvier.findElement(parentAgreeBox);
		action.moveToElement(parentAgreeBoxElement, 25, 25).click().build().perform();
		//action.moveToElement(this.xecuteClientSession.FindElementsByAccessibilityId("GraphicView")[0], xPosition, yPosition).ContextClick().Build().Perform();
	
		//MoveToElement(FindElement(By.Id("ext-gen33"))).ContextClick().Build().Perform();
		
		//drvier.switchTo().window(parentPage); 
		//Thread.sleep(10000);
		//WebElement parentAgreeBoxElement = drvier.findElement(parentAgreeBox);
		
	//	clickButton(drvier, agreeBox);
		Thread.sleep(10000);
		//drvier.close();
		jse.executeScript("arguments[0].scrollIntoView();", notRopotCeckBox);
		clickButton(drvier, notRopotCeckBox);
		jse.executeScript("arguments[0].scrollIntoView();", submitBtn);
		clickButton(drvier, submitBtn);		
		
	}
	
	public void  selectUserType (String userType) 
	{		
		By type = By.xpath("//*[@for='"+userType+"']");
		clickButton(drvier, type);			
	}
	
	public WebElement  retriveUserType (String userType) 
	{		
		By type = By.xpath("//*[@for='"+userType+"']");
		WebElement typeElement = drvier.findElement(type);
		return typeElement;	
		
	}
	
	public void  selectAgeRange (String ageRange) 
	{		
		clickButton(drvier, ageRangeSelect);	
		WebElement element = drvier.findElement(ageRangeSelect);
		select = new Select(element); 
		select.selectByVisibleText(ageRange);
	}
	
	public void  selectGender (String gender)  
	{		
		By type = By.xpath("//*[@for='"+gender+"']");
		clickButton(drvier, type);			
	}
	
	public WebElement  retriveGender (String gender)  
	{		
		By type = By.xpath("//*[@for='"+gender+"']");
		WebElement element = drvier.findElement(type);
		return element;
				
	}
	
	public boolean  isSuccessfullRegister () throws InterruptedException  
	{		
		   Thread.sleep(1000);
			WebElement VerificationMsgElement = drvier.findElement(verificationMsg);
		
		if(!(VerificationMsgElement.isDisplayed()))
		{
			return false;
		}
		return true;
				
	}

}
