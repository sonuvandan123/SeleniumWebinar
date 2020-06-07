package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	
	public static void main(String[] args)
	{
	
		//System.setProperty("webdriver.chrome.driver","path");
		System.setProperty("webdriver.gecko.driver","D:\\firefoxdriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://github.com/mozilla/geckodriver/releases");
		//https://github.com/mozilla/geckodriver/releases
		
	}

}
