package learn_selenium.learn_selenium_maven;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Testing_grid {
	public static RemoteWebDriver driver;

	public static void main(String[] args) {
		

	
	

		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setPlatform(Platform.ANY);
		
		
			 try {
				driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
