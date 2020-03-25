package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sprint2Page extends BasePage
{
	private By firstNameField = By.xpath("//*[@name='firstname']");
	
	private By lastNameField = By.xpath("//*[@name='lastname']");
	
    private By submitButton = By.xpath("//*[@type='submit']");
	
    public Sprint2Page(WebDriver driver)
    {
    	super(driver);
    }

	public WebElement getFirstNameField() 
	{
		return driver.findElement(firstNameField);
	}

	public WebElement getLastNameField() 
	{
		return driver.findElement(lastNameField);
	}

	public WebElement getSubmitButton() 
	{
		return driver.findElement(submitButton);
	}
}