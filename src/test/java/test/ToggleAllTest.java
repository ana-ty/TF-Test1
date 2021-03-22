package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.CheckBoxPage;
import utill.BrowserFactory;

public class ToggleAllTest {
	
WebDriver driver;
PageFactory checkBoxPage;
	
	
	
	@Test
	public void toggleAllTest() throws Throwable {
		driver = BrowserFactory.init();
		
		CheckBoxPage checkBoxPage = PageFactory.initElements(driver,CheckBoxPage.class );
        
		checkBoxPage.togglecheckAll();
		 Thread.sleep(1000);
		
		checkBoxPage.deleteAllCheckBoxes();
		Thread.sleep(1000);

}
	/*@After
	public void teardown() {
		
		driver.close();
		driver.quit();
	}*/
}