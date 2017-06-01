package learn_selenium.learn_selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_Events {
	
	@Test
	public void testing_mouse_actions()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\WS\\learn_selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.snapdeal.com");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath(".//*[text()='All Offers']")).getSize().getWidth());
		System.out.println(driver.findElement(By.xpath(".//*[text()='All Offers']")).getSize().getHeight());

		Actions action = new Actions(driver);
		
		
		//action.moveToElement(driver.findElement(By.xpath(".//*[text()='All Offers']"))).build().perform();
		/*action.contextClick().build().perform();
		sleep();
		action.contextClick(driver.findElement(By.xpath(".//*[text()='All Offers']"))).build().perform();;
		sleep();*/
		
		action.moveByOffset(38,135).build().perform();
		sleep();
		action.moveToElement(driver.findElement(By.xpath(".//*[text()='All Offers']"))).build().perform();
		sleep();
		action.moveToElement(driver.findElement(By.xpath(".//*[text()='All Offers']")), 38,135).build().perform();
		//sleep();
		
	
		
	}
	
	public void sleep()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
