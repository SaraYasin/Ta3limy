package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.PageBase;

public class QuestionsPage extends PageBase{

	public QuestionsPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver; 
		action = new Actions(driver); 
	}
	
	
	//	By commonQuestionsTitle =By.xpath("(//*[text()='أسئلة شائعة'])[2]");
	    By commonQuestionsTitle=By.xpath("(//h1)[2]");
		
			
	
	public String  retriveCommonQuestionsTitle () 
	{
		 WebElement elementCommonQuestionsTitle = drvier.findElement(commonQuestionsTitle);		
		return elementCommonQuestionsTitle.getText();			
	}
	
	public void  openAnswer (String qNum)  
	{
		By dropListQuestion =By.xpath("(//i[@class='arrow down'])["+qNum+"]");	
		clickButton(drvier, dropListQuestion);
			
			
	}
	
	public String  retriveQuestions (String qNum ) 
	{
		
		By commonQuestions =By.xpath("(//*[@class='css-olkrgj e1n5lxyo0'])["+qNum+"]");
		 WebElement elementCommonQuestions = drvier.findElement(commonQuestions);
		return elementCommonQuestions.getText();		
			
	}
	
	public Integer  retriveQuestionsCount () 
	{
		
		By commonQuestions =By.xpath("//*[@class='css-olkrgj e1n5lxyo0']");
		List<WebElement> getAllQuestions= drvier.findElements(commonQuestions);
		return getAllQuestions.size();		
			
	}
	
	public String  retriveAnswers (String ansNum) 
	{

		By commonAnswers =By.xpath("(//*[@class='Collapsible__contentInner'])["+ansNum+"]");
		 WebElement elementCommonAnswers = drvier.findElement(commonAnswers);
		return elementCommonAnswers.getText();			
	}
		
	
}
