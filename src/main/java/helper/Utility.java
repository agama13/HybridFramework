package helper;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.BrowserFactory;

public class Utility 
{

	public static String captureScreenshot()
	{
		
		WebDriver driver=BrowserFactory.getDriver();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		String str=ts.getScreenshotAs(OutputType.BASE64);
		
		return str;
		
	}
	
}
