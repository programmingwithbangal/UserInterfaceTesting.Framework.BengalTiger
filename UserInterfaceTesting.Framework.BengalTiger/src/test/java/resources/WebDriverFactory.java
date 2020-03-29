package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory 
{
	public static WebDriver GetChromeDriver() 
	{
		String path = System.getProperty("user.dir");
		System.out.println(path);

		//Invoke driver.exe
		System.setProperty("webdriver.chrome.driver", path + "/drivers/chromedriver80/chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless", "--window-size=1920,1200","--ignore-certificate-errors");

		//Create Driver object
		WebDriver driver = new ChromeDriver(chromeOptions);
		return driver;
	}
}