package learn_selenium.learn_selenium_maven;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Testing_grid {
	
	static String browser_type = "firefox";
	public static void main(String[] args) {
		try {
		System.setProperty("webdriver.gecko.driver", "c:\\galen-bin-2.3.2\\geckodriver.exe");

		DesiredCapabilities dr = new DesiredCapabilities();
		
		dr=DesiredCapabilities.firefox();
		
		dr.setBrowserName(browser_type);
		dr.setPlatform(Platform.WINDOWS);
		
		
		
			RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:1234/wd/hub"), dr);
			driver.navigate().to("http://gmail.com");
			
			//driver.findElement(By.id("user")).sendKeys("testuser@gmail.com");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
