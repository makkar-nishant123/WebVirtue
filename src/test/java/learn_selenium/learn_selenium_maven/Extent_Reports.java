package learn_selenium.learn_selenium_maven;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Reports {
	public static ExtentReports extent;
	public static ExtentTest logger;
public Extent_Reports()
{		
	extent = new ExtentReports(System.getProperty("user.dir") + File.separator + "STMExtentReport.html", true);
	extent
    .addSystemInfo("Host Name", "SoftwareTestingMaterial")
    .addSystemInfo("Environment", "Automation Testing")
    .addSystemInfo("User Name", "Rajkumar SM");
    //loading the external xml file (i.e., extent-config.xml) which was placed under the base directory
    //You could find the xml file below. Create xml file in your project and copy past the code mentioned below
    extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	
}
	public static void main(String[] args) {
		Extent_Reports e = new Extent_Reports();
		logger = extent.startTest("First Test");

		System.setProperty("webdriver.chrome.driver", "D:\\s.w.\\chromedriver.exe");
		logger.log(LogStatus.INFO, "1st Case");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.snapdeal.com");

		System.out.println(driver.findElement(By.xpath(".//*[text()='All Offers']")).getSize().getWidth());
		System.out.println(driver.findElement(By.xpath(".//*[text()='All Offers']")).getSize().getHeight());

		Actions action = new Actions(driver);

		// action.moveToElement(driver.findElement(By.xpath(".//*[text()='All
		// Offers']"))).build().perform();
		/*
		 * action.contextClick().build().perform(); sleep();
		 * action.contextClick(driver.findElement(By.
		 * xpath(".//*[text()='All Offers']"))).build().perform();; sleep();
		 */

		action.moveByOffset(38, 135).build().perform();
		sleep();
		action.moveToElement(driver.findElement(By.xpath(".//*[text()='All Offers']"))).build().perform();
		sleep();
		action.moveToElement(driver.findElement(By.xpath(".//*[text()='All Offers']")), 38, 135).build().perform();
		// sleep();
		logger.log(LogStatus.PASS, "Test Case (failTest) Status is passed");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		extent.flush();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		extent.close();

	}

	public static void sleep() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
