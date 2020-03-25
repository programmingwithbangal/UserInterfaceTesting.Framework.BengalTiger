package pageactions;

import org.openqa.selenium.WebDriver;
import pages.Sprint2Page;

public class Sprint2PageActions 
{
	public Sprint2Page Sprint2Page;
	
    public Sprint2PageActions(WebDriver driver)
    {
    	Sprint2Page = new Sprint2Page(driver);
    }
    
    public void FillOutFormAndSubmit(String firstname, String lastname)
    {
    	Sprint2Page.getFirstNameField().sendKeys(firstname);
    	Sprint2Page.getLastNameField().sendKeys(lastname);
        Sprint2Page.getSubmitButton().submit();
    }
}
