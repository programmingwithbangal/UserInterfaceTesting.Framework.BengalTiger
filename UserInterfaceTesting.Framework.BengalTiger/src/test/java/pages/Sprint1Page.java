package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sprint1Page extends BasePage
{	
	private By firstNameField = By.xpath("//*[@name='firstname']");
    
    private By submitButton = By.xpath("//*[@type='submit']");

    public Sprint1Page(WebDriver driver)
    {
    	super(driver);
    }

    public WebElement getFirstNameField() 
    {
		return driver.findElement(firstNameField);
	}

	public WebElement getSubmitButton() 
	{
		return driver.findElement(submitButton);
	}
}