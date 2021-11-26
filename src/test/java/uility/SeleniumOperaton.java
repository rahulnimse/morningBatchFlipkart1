package uility;

import java.time.Duration;
import java.util.Hashtable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class SeleniumOperaton {
	
	public static WebDriver driver =null;
	
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	//brouserLaunch
	
	public static Hashtable<String, Object> browserLaunch(Object[]inputParameters)
	
	{
		try {
		String strBrowserName=(String) inputParameters[0];
		String webDriverExePath=(String) inputParameters[1];
		
		if(strBrowserName.equalsIgnoreCase("Chrome"))
		{ System.setProperty("webdriver.chrome.driver", webDriverExePath);
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		else if(strBrowserName.equalsIgnoreCase("FF"))
		{ System.setProperty("webdriver.gecko.driver", webDriverExePath);
		 driver=new FirefoxDriver();	
		}
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methodUsed:brouserLaunch,Input_Data :"+inputParameters[1].toString());	
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:brouserLaunch,Input_Data :"+inputParameters[1].toString());	
			
		}return outputParameters;}
	//openApllication	
		
		public static Hashtable<String, Object> openApplication(Object[]inputParameters)
		{try
		{driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String strUrl= (String)inputParameters[0];
		driver.get(strUrl);
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:openApplicaton,Input_Data :"+inputParameters[0].toString());	
		
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:openApplicaton,Input_Data :"+inputParameters[0].toString());	
			
		}return outputParameters;}
		//click on Element
		
		public static Hashtable<String, Object> clickOnElement(Object[]inputParameters)
		{try
			{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			String xpath= (String) inputParameters[0];
		driver.findElement(By.xpath(xpath)).click();
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:clickOnElement,Input_Data :"+inputParameters[0].toString());	
		}catch(Exception e)
			{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:clickOnElement,Input_Data :"+inputParameters[0].toString());	
			
			}return outputParameters;}
	//navigate to  login
	
	public static Hashtable<String, Object> navigateToLogin(Object[]inputParameters) 
	{try
		{driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String xpath= (String) inputParameters[0];
	
	Actions act=new Actions(driver);
	WebElement element= driver.findElement(By.xpath(xpath));
	act.moveToElement(element).build().perform();	
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "methodUsed:navigateToLogin,Input_Data :"+inputParameters[0].toString());	
	}catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		outputParameters.put("MESSAGE", "methodUsed:navigateToLogin,Input_Data :"+inputParameters[0].toString());	
		
	}return outputParameters;}
	//sendKeys
	
	public static Hashtable<String, Object> sendKey(Object[]inputParameters) 
	{try
		{driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String xpath= (String) inputParameters[0];
		String strvalue= (String)inputParameters[1];
		driver.findElement(By.xpath(xpath)).sendKeys(strvalue);
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:sendKey,Input_Data :"+inputParameters[1].toString());	
		
		}catch(Exception e)
	{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:sendKey,Input_Data :"+inputParameters[1].toString());	
			
	}return outputParameters;}
	//validation
public static Hashtable<String, Object> ValidatonLogin(Object[]inputParameters)
	
	{
		try {
		String givenText=(String) inputParameters[0];
		String xpath=(String) inputParameters[1];
		String text= driver.findElement(By.xpath(xpath)).getText();
		
		if(givenText.equalsIgnoreCase(text))
		{ 
			System.out.println("Test Case Pass");
		}
		else
		{	
			System.out.println("Test Case Fail");
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:ValidatonLogin,Input_Data :"+inputParameters[1].toString());	
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:ValidatonLogin,Input_Data :"+inputParameters[1].toString());	
			
		}return outputParameters;}
	
	

}