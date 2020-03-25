package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sprint3Page extends BasePage
{
	private By firstNameField = By.xpath("//*[@name='firstname']");
	
	private By lastNameField = By.xpath("//*[@name='lastname']");
	
    private By submitButton = By.xpath("//*[@type='submit']");
    
    private By femaleGenderRadioButton = By.xpath("//input[@value='female']");

    private By otherGenderRadioButton = By.xpath("//input[@value='other']");

    public Sprint3Page(WebDriver driver)
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

	public WebElement getFemaleGenderRadioButton() 
	{
		return driver.findElement(femaleGenderRadioButton);
	}

	public WebElement getOtherGenderRadioButton() 
	{
		return driver.findElement(otherGenderRadioButton);
	}
}