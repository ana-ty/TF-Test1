package test;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.CheckBoxPage;
import utill.BrowserFactory;




public class CheckBoxTest {
	
	WebDriver driver;
	
	@Test
	public void shouldBeAbleToAddCheckBox() throws Throwable{

		driver = BrowserFactory.init();
		
		
		CheckBoxPage checkBoxPage = PageFactory.initElements(driver,CheckBoxPage.class );
        
		//Test 1
		
		checkBoxPage.enterCheckBoxName("ABC");	
		checkBoxPage.clickOnAddButton();
		Thread.sleep(1000);
		checkBoxPage.enterCheckBoxName("XYZ");	
		checkBoxPage.clickOnAddButton();
		Thread.sleep(1000);
		checkBoxPage.togglecheckAll();	
		Thread.sleep(1000);
		checkBoxPage.verifycheckedboxesareSelected();
		Thread.sleep(1000);
		}
	
	/*@After
	public void teardown() {
		
		driver.close();
		driver.quit();
	}*/
		}
