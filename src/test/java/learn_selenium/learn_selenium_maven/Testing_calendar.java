package learn_selenium.learn_selenium_maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentTest;

public class Testing_calendar {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\WS\\learn_selenium\\Drivers\\chromedriver.exe");

	
		WebDriver driver = new ChromeDriver();
		
	driver.get("http://demo.guru99.com/selenium/");
		
		driver.findElement(By.name("bdaytime")).sendKeys("090517");
		
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
driver.findElement(By.xpath(".//*[text()='Next']")).click();		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for (WebElement selected_dates : dates)
			{System.out.println(selected_dates.getText());
		if (selected_dates.getText().equals("28"))
			selected_dates.click();
			}
		
	}

}
