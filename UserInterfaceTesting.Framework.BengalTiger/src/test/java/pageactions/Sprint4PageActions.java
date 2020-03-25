package pageactions;

import org.openqa.selenium.WebDriver;
import pages.Sprint4Page;
import resources.User;

public class Sprint4PageActions 
{
	public Sprint4Page Sprint4Page;
	
    public Sprint4PageActions(WebDriver driver)
    {
    	Sprint4Page = new Sprint4Page(driver);
    }
    
    public void FillOutPrimaryContactForm(User user) throws Exception
    {
    	SetPrimaryContactGender(user);
    	Sprint4Page.getFirstNameField().sendKeys(user.getFirstName());
    	Sprint4Page.getLastNameField().sendKeys(user.getLastName());
    }
    
    public void FillOutEmergencyContactFormAndSubmit(User emergencyContactUser) throws Exception
    {
    	SetEmergencyContactGender(emergencyContactUser);
    	Sprint4Page.getFirstNameEmergencyContactField().sendKeys(emergencyContactUser.getFirstName());
    	Sprint4Page.getLastNameEmergencyContactField().sendKeys(emergencyContactUser.getLastName());
        Sprint4Page.getSubmitButton().submit();
    }

    
    private void SetPrimaryContactGender(User user) throws Exception
    {
        switch (user.getGenderType())
        {
            case Male:
                break;
            case Female:
                Sprint4Page.getFemaleGenderRadioButton().click();
                break;
            case Other:
            	Sprint4Page.getOtherGenderRadioButton().click();
                break;
            case None:
                throw new Exception("Request type: None is invalid.");
            default:
                throw new UnsupportedOperationException("Request type is not supported.");
        }
    }
    
    private void SetEmergencyContactGender(User emergencyContactUser) throws Exception
    {
        switch (emergencyContactUser.getGenderType())
        {
            case Male:
                break;
            case Female:
                Sprint4Page.getFemaleGenderEmergencyContactRadioButton().click();
                break;
            case Other:
            	Sprint4Page.getOtherGenderEmergencyContactRadioButton().click();
                break;
            case None:
                throw new Exception("Request type: None is invalid.");
            default:
                throw new UnsupportedOperationException("Request type is not supported.");
        }
    }
}