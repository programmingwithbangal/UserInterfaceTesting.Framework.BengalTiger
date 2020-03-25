package pageactions;

import org.openqa.selenium.WebDriver;
import pages.Sprint3Page;
import resources.User;

public class Sprint3PageActions 
{
	public Sprint3Page Sprint3Page;
	
    public Sprint3PageActions(WebDriver driver)
    {
    	Sprint3Page = new Sprint3Page(driver);
    }
    
    public void FillOutFormWithRadioButtonAndSubmit(User user) throws Exception
    {
    	SetGender(user);
    	Sprint3Page.getFirstNameField().sendKeys(user.getFirstName());
    	Sprint3Page.getLastNameField().sendKeys(user.getLastName());
        Sprint3Page.getSubmitButton().submit();
    }
    
    private void SetGender(User user) throws Exception
    {
        switch (user.getGenderType())
        {
            case Male:
                break;
            case Female:
                Sprint3Page.getFemaleGenderRadioButton().click();
                break;
            case Other:
            	Sprint3Page.getOtherGenderRadioButton().click();
                break;
            case None:
                throw new Exception("Request type: None is invalid.");
            default:
                throw new UnsupportedOperationException("Request type is not supported.");
        }
    }
}