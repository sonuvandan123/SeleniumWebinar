package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckEmail {

	public static void main(String[] args)
	{
		// this step will find the firefox driver in the given path
		System.setProperty("webdriver.gecko.driver","D:\\firefoxdriver\\geckodriver.exe");
		// this will open firefox browser without any url
		WebDriver driver=new FirefoxDriver();
		//driver.navigate().to("http://automationpractice.com/index.php");
		//this will redirect into given url
		
		// maximizes the browser
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		/*
		 * tagName a
		attribute class 
				value="login"

//syntax of xpath
	("//tagName[@attribute='value']");
		 * */
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		// input email in text in textbox
		driver.findElement(By.id("email_create")).sendKeys("collegetoindustry@gmail.com");
		
		// tagName[attribute='value']
		// this will click on create account button
		driver.findElement(By.cssSelector("button[id='SubmitCreate']")).click();;
		//SubmitCreate
		
	}

}
