package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sprint5Page2 extends BasePage
{
    private By crocodilesRadioButton = By.xpath("//input[@value='crocodiles']");

    private By bunniesRadioButton = By.xpath("//input[@value='bunnies']");

    private By submitButton = By.xpath("//*[@type='submit']");

    public Sprint5Page2(WebDriver driver)
    {
    	super(driver);
    }

	public WebElement getCrocodilesRadioButton() 
	{
		return driver.findElement(crocodilesRadioButton);
	}

	public WebElement getBunniesRadioButton() 
	{
		return driver.findElement(bunniesRadioButton);
	}

	public WebElement getSubmitButton() 
	{
		return driver.findElement(submitButton);
	}
}