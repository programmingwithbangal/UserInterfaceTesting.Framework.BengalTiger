package pageactions;

import org.openqa.selenium.WebDriver;
import pages.Sprint1Page;

public class Sprint1PageActions 
{
	public Sprint1Page Sprint1Page;
	
    public Sprint1PageActions(WebDriver driver)
    {
    	Sprint1Page = new Sprint1Page(driver);
    }
    
    public void FillOutFormAndSubmit(String firstname)
    {
    	Sprint1Page.getFirstNameField().sendKeys(firstname);
        Sprint1Page.getSubmitButton().submit();
    }
}