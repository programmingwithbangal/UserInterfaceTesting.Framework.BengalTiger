package stepDefinitions;

import org.openqa.selenium.WebDriver;
import constants.UserConstants;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import resources.User;
import resources.WebDriverFactory;

public class BaseSteps 
{
    WebDriver Driver;
        
    @Before
    public void SetupBeforeEveryTest()
    {
    	GetDriver();
    }	
    
    @After
    public void SetupAfterEveryTest()
    {
		Driver.close();
		Driver.quit();		
    }
    
    public WebDriver GetDriver() 
    {
    	if(Driver == null)
    	{
        	Driver = WebDriverFactory.GetChromeDriver();    		
    	}
    	
    	return Driver;
    }
    
    public User GetUser() 
    {
    	User user = new User(UserConstants.DefaultFirstName, UserConstants.DefaultLastName);    	
    	return user;
    }
}