package base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
	public WebDriver drvier;
	protected JavascriptExecutor jse ; 
	public static Select select ; 
	public Actions action ; 
	public WebDriverWait wait;
	public Alert alert;
	
	
	public PageBase(WebDriver driver) 
	{
        this.drvier = driver ;
		PageFactory.initElements(driver, this);
	}
	
	public static void selectByVisibleText (WebDriver driver, By  dropList, String Option) 
	{
		WebElement element = driver.findElement(dropList);
		select = new Select(element); 
		select.selectByVisibleText(Option);
		
	
		
		
	}
	
	  public static boolean elementIsDisplayed (WebDriver driver, By assertElement) {
			
		WebElement element = driver.findElement(assertElement);
		if (element.isDisplayed()) {
			return true;
			
			}
		return false;
		}
	  
	
	public static void selectByIndex (WebDriver driver, By dropList, Integer index) 
	{
		WebElement element = driver.findElement(dropList);
		select = new Select(element); 
		select.selectByIndex(index);
		
		
	}
	
	public static void setTextElementText (WebDriver driver, By textElement , String value ) 
	{
		WebElement element = driver.findElement(textElement); 
	
		
		element.sendKeys(value);
		
		
	}
	
	public static void clickButton(WebDriver driver, By button) 
	{
		
	WebElement element = driver.findElement(button);
	element.click();
		
	
		
	}
	
	

}
