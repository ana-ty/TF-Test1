package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckBoxPage extends BasePage{
	
	WebDriver driver;
	
	public CheckBoxPage(WebDriver driver) {
		this.driver = driver;
	}

	

	
	@FindBy(how = How.NAME, using ="data") WebElement CHECK_BOX_LOCATOR;
	@FindBy(how = How.XPATH, using ="/html/body/div[4]/input[2]") WebElement ADD_NEW_CHECKBOX_BUTTON;
	@FindBy(how = How.NAME, using="allbox") WebElement TOGGLE_ALL_CHECKBOX;
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/input[1]") WebElement DELETE_CHECKBOX_BUTTON;
    



 public void enterCheckBoxName(String name) {
	 
   CHECK_BOX_LOCATOR.sendKeys(name);
	 
 }
 
 public void clickOnAddButton() {
	 
	 ADD_NEW_CHECKBOX_BUTTON.click();
 }
 
 public void togglecheckAll() {
	 TOGGLE_ALL_CHECKBOX.click(); 
	 
	 
 }
	 
	public void deleteAllCheckBoxes() {
		List<WebElement> checkedBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println("NO of Checkboxes are present= " + checkedBoxes.size());
		   
		for( int i = 0 ; i<checkedBoxes.size(); i++) {
		    	checkedBoxes.get(i);
		    	if(checkedBoxes.get(i).isSelected()) {
		    		DELETE_CHECKBOX_BUTTON.click();
		    		System.out.println("All selected checkboxes are deleted");
		    		
		    	}
		    	
		        }
		
		
	}
		
	 
	 
 public void verifycheckedboxesareSelected(){
	  
	
	List<WebElement> checkedBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	System.out.println("NO of Checkboxes are present= " + checkedBoxes.size());
	   
	for( int i = 1 ; i<checkedBoxes.size(); i++) {
	    	checkedBoxes.get(i);
	    	if(checkedBoxes.get(i).isSelected()) {
	    		
	    		System.out.println(i + " Checkboxes are selected");
	    	}
	    	else {
	    		System.out.println("Checkboxes are not selected");
	    	}
	    	
	    	
	    }
	    }
	
 
 public void toggleIsChecked() {
	 TOGGLE_ALL_CHECKBOX.isSelected();
	 
	 System.out.println("Toggle all box is checked");
 }	

 
 public void clickOnDeleteButton() {
	 DELETE_CHECKBOX_BUTTON.click();
	 
 }
 
 
}
 
