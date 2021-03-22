package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import page.CheckBoxPage;
import page.DeleteSelectedPage;
import utill.BrowserFactory;

public class DeleteSelectedBox {

	WebDriver driver;
	PageFactory checkBoxPage;
	PageFactory deleteSelectedPage;
	
	
	
	@Test
	public void shouldBeAbleToDeleteBox() throws Throwable {
		
		driver = BrowserFactory.init();
		
		 DeleteSelectedPage  deleteSelectedPage = PageFactory.initElements(driver, DeleteSelectedPage.class);
		 
		 
		CheckBoxPage checkBoxPage = PageFactory.initElements(driver, CheckBoxPage.class);
		
		// deleteSelectedPage.selectCheckBox(); 
		  
		deleteSelectedPage.checkIfBoxIsThere();
		
		 Thread.sleep(2000);
		 
		 deleteSelectedPage.verifyCheckBoxIsSelected();
		 
		 checkBoxPage.clickOnDeleteButton();
			 
		 }
		 
	}

