package learn_selenium.learn_selenium_maven;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshots_test {
	
	@Test
	public void test_screen_capture() throws IOException
	{
System.setProperty("webdriver.chrome.driver", "D:\\WS\\learn_selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.snapdeal.com");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "caputure.png"));
		
	}
	
	@Test
	public void test_screen_capture_div()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\WS\\learn_selenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.snapdeal.com");
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	try {
		FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "caputure.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		
	}
	
	@Test
	public void test_screen_capture_crop() throws IOException
	{
System.setProperty("webdriver.chrome.driver", "D:\\WS\\learn_selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.snapdeal.com");
		WebElement ele = driver.findElement(By.xpath(".//*[text()='All Offers']"));

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "capture.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		BufferedImage  fullImg = ImageIO.read(src);

		// Get the location of element on the page
		Point point = ele.getLocation();

		// Get width and height of the element
		int eleWidth = ele.getSize().getWidth();
		int eleHeight = ele.getSize().getHeight();

		// Crop the entire page screenshot to get only element screenshot
		BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(),
		    eleWidth, eleHeight);
		ImageIO.write(eleScreenshot, "png", src);

		// Copy the element screenshot to disk
		FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "caputure_cropped.png" ));
		
	}
	
	
	@Test
	public void test_screen_capture_section()
	{
		
		
	}
	
	

}
