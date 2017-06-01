package reports_TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners({org.uncommons.reportng.HTMLReporter.class , org.uncommons.reportng.JUnitXMLReporter.class})
public class Testing_validations_testng {
	
	@Test
	public void test_report_assert1() throws IOException
	{
		 System.setProperty("org.uncommons.reportng.escape-output", "false");

		
		System.setProperty("webdriver.chrome.driver", "D:\\WS\\learn_selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://rediff.com");
		String dest_file = System.getProperty("user.dir") + "file.png";
		//String failureImageFileName = System.getProperty("user.dir") + "file.png";
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File (dest_file));
		reportLogScreenshot(new File (dest_file));
          
	}

	protected void reportLogScreenshot(File file) {
	      System.setProperty("org.uncommons.reportng.escape-output", "false");
	  
	      String absolute = file.getAbsolutePath();
	      int beginIndex = absolute.indexOf(".");
	      String relative = absolute.substring(beginIndex).replace(".\\","");
	      String screenShot = relative.replace('\\','/');
	  
	  String s = "<a href=" + "D:\\WS\\learn_seleniumfile.png" + "><img src=" + "D:\\WS\\learn_seleniumfile.png" + "></a>";
	  System.out.println(s);
	//Reporter.log("<a href=\"" + screenShot + "\"><p align=\"left\">Error screenshot at " + new Date()+ "</p>");
	Reporter.log(s); 
	}
	

}
