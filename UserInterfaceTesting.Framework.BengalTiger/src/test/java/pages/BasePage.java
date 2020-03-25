package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class BasePage 
{
	
	protected WebDriver driver;

	protected BasePage(WebDriver driver)
    {
        this.driver = driver;
    }

	public void goTo(String url) 
	{
		driver.get(url);	
	}
	
	public boolean IsLoaded(String expected)
	{
	    try
	    {
	        return driver.getTitle().contains(expected);
	    }
	    catch (NoSuchElementException ex)
	    {
	        return false;
	    }
	}
}