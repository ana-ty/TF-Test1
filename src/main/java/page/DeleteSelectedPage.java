package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DeleteSelectedPage {

	
WebDriver driver;
	
	public DeleteSelectedPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using ="(//input[@type='checkbox'])[position()=2]") WebElement CHECK_BOX;

	@FindBy(how = How.NAME, using ="data") WebElement CHECK_BOX_LOCATOR;
	@FindBy(how = How.XPATH, using ="/html/body/div[4]/input[2]") WebElement ADD_NEW_CHECKBOX_BUTTON;
	@FindBy(how = How.NAME, using="allbox") WebElement TOGGLE_ALL_CHECKBOX;
	@FindBy(how = How.XPATH, using ="/html/body/div[3]/input[1]") WebElement DELETE_CHECKBOX_BUTTON;
    
	
	public void selectCheckBox() {
		CHECK_BOX.click();
		
	}
	
	public void verifyCheckBoxIsSelected() {
		
		if( CHECK_BOX.isSelected()) {
			
			System.out.println("CheckBox is selected");
		}
		else {
			 System.out.println("CheckBox is not selected");
		}
		
	}
	
	public void checkIfBoxIsThere() {
		
		String XX=CHECK_BOX.getText();
		
		if(XX=="ABC"){
			
			CHECK_BOX.click();
			
			System.out.println("CheckBox is selected");
		
		}
		else {
			CHECK_BOX_LOCATOR.sendKeys("ABC");	
			ADD_NEW_CHECKBOX_BUTTON.click();
			System.out.println("Created a new checkBox");
		}
	}
}
