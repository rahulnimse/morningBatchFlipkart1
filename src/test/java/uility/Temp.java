package uility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Temp {
	
	public static void main (String[]args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//openApp
		driver.get("https://www.flipkart.com/");
		//click on cancel
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		//navigate to  login
		Actions act=new Actions(driver);
	WebElement more=driver.findElement(By.xpath("//*[@class='_28p97w']"));
	act.moveToElement(more).build().perform();
	Thread.sleep(3000);
	//click on My Profile
	WebElement to1=driver.findElement(By.xpath("//*[text()='My Profile']"));
	act.click(to1).build().perform();
	Thread.sleep(3000);
	//enter username
	driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("9767895722");
	//enter password
	driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("rahul@5551");
//click on login
	driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
	}

	
	
	

}
