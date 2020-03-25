package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory 
{
	public static WebDriver GetChromeDriver() 
	{
		String path = System.getProperty("user.dir");
		System.out.println(path);

		//Invoke driver.exe
		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver80/chromedriver.exe");
		
		//Create Driver object
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}