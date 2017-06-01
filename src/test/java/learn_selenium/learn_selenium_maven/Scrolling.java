package learn_selenium.learn_selenium_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Scrolling {
	
	@Test
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\WS\\learn_selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Nishant/Desktop/testing.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("IF2");
		 WebElement test = driver.findElement(By.xpath(".//*[@role='presentation']"));

		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		    jse.executeScript("window.scrollBy(0,250)", "");	
			sleep();
		Actions action  = new Actions(driver);
		action.moveToElement(test).build().perform();
		sleep();
		((JavascriptExecutor) driver)
        .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		sleep();
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", test);
		
		
	sleep();
	driver.quit();
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
