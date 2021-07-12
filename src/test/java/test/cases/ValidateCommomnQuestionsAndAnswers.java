package test.cases;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.QuestionsPage;
import utilities.ExcelReader;

public class ValidateCommomnQuestionsAndAnswers extends TestBase{
	
	String url= userdata.getProperty("url");
	HomePage homeObject;
	QuestionsPage QuestionsObject;
	
	   @DataProvider(name="ExcelData")
	    public Object[][] ExcelData () throws InvalidFormatException, IOException 
	    {
	           Object[][] data = ExcelReader.fetchData(System.getProperty("user.dir")+"\\UsserData.xlsx", "ValidateTa3limyQuestions");
	        		   
	           return data;
	    }  

		@BeforeMethod
		public void OpenURL () 
		{
			 openBrowser(url);	
			  homeObject = new HomePage(driver); 
			  QuestionsObject= new QuestionsPage(driver);
			  assertTrue(homeObject.VerifyHomePage());
		}
		
		
		// (dataProvider= "ExcelData")
		
		// String QuestionsTitle, Integer QuestionsNumber,Long Q1,Long A1,Long Q2,Long A2,Long Q3,Long A3,Long Q4,Long A4,Long Q5,Long A5,Long Q6,Long A6,Long Q7,Long A7
		@Test 
		public void ValidateCommonRuestionAndAnswers () throws InterruptedException
		{
			
		  homeObject.openQuestionsPage();
		// assertEquals(QuestionsTitle, QuestionsObject.retriveCommonQuestionsTitle());
		  assertEquals("أسئلة شائعة", QuestionsObject.retriveCommonQuestionsTitle());
		  //assertEquals(QuestionsNumber, QuestionsObject.retriveQuestionsCount());
		 // assertEquals(Q1, QuestionsObject.retriveQuestions("1"));
		//  QuestionsObject.openAnswer("1");
	//	  assertEquals(A1, QuestionsObject.retriveAnswers("1"));
		  
	//	  assertEquals(Q2, QuestionsObject.retriveQuestions("2"));
		//  QuestionsObject.openAnswer("2");
		  //assertEquals(A2, QuestionsObject.retriveAnswers("2"));
		  
		//  assertEquals(Q3, QuestionsObject.retriveQuestions("3"));
		 // QuestionsObject.openAnswer("3");
		  //assertEquals(A3, QuestionsObject.retriveAnswers("3"));
		  
		//  assertEquals(Q4, QuestionsObject.retriveQuestions("4"));
		 // QuestionsObject.openAnswer("4");
		  //assertEquals(A4, QuestionsObject.retriveAnswers("4"));
		  
		  //assertEquals(Q5, QuestionsObject.retriveQuestions("5"));
		  //QuestionsObject.openAnswer("5");
		  //assertEquals(A5, QuestionsObject.retriveAnswers("5"));
		  
	//	  assertEquals(Q6, QuestionsObject.retriveQuestions("6"));
		//  QuestionsObject.openAnswer("6");
		 // assertEquals(A6, QuestionsObject.retriveAnswers("6"));
		  
		  //assertEquals(Q7, QuestionsObject.retriveQuestions("7"));
		  //QuestionsObject.openAnswer("7");
		  //assertEquals(A7, QuestionsObject.retriveAnswers("7"));
		  
		  
		  
			
		
		}
		
	
	   
}
