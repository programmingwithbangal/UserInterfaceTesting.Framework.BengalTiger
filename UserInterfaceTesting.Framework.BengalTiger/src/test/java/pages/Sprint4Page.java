package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sprint4Page extends BasePage
{
	private By firstNameField = By.id("f1");
	
	private By lastNameField = By.id("l1");
	
    private By submitButton = By.id("submit1");
    
    private By femaleGenderRadioButton = By.id("radio1-f");

    private By otherGenderRadioButton = By.id("radio1-0");

	private By firstNameEmergencyContactField = By.id("f2");
	
	private By lastNameEmergencyContactField = By.id("l2");
	
    private By submitEmergencyContactButton = By.id("submit2");
    
    private By femaleGenderEmergencyContactRadioButton = By.id("radio2-f");

    private By otherGenderEmergencyContactRadioButton = By.id("radio2-0");

    public Sprint4Page(WebDriver driver)
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

	public WebElement getFirstNameEmergencyContactField() 
	{
		return driver.findElement(firstNameEmergencyContactField);
	}

	public WebElement getLastNameEmergencyContactField() 
	{
		return driver.findElement(lastNameEmergencyContactField);
	}

	public WebElement getSubmitEmergencyContactButton() 
	{
		return driver.findElement(submitEmergencyContactButton);
	}

	public WebElement getFemaleGenderEmergencyContactRadioButton() 
	{
		return driver.findElement(femaleGenderEmergencyContactRadioButton);
	}

	public WebElement getOtherGenderEmergencyContactRadioButton() 
	{
		return driver.findElement(otherGenderEmergencyContactRadioButton);
	}
}