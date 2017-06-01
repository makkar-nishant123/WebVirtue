package learn_selenium.learn_selenium_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Proxy_test {
	
	public static void main(String[] args) {
		
	/*	FirefoxProfile	profile = new FirefoxProfile();
				profile.setPreference("network.proxy.type", "1");
				profile.setPreference("network.proxy.http", "204.116.142.141");
				profile.setPreference("network.proxy.http_port", "46690");
				profile.setPreference("network.proxy.ssl", "46.102.106.59");
				profile.setPreference("network.proxy.ssl_port", "13228");
				
				System.setProperty("webdriver.gecko.driver", "d:\\s.w\\geckodriver.exe");
				
				WebDriver driver  = new FirefoxDriver();
				driver.get("https://music.wynk.in/music");
				*/
		
		String PROXY = "204.116.142.141:46690";

		org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
		proxy.setHttpProxy(PROXY)
		     .setFtpProxy(PROXY)
		     .setSslProxy(PROXY);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, proxy);
		System.setProperty("webdriver.chrome.driver", "d:\\s.w\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(cap);
		driver.get("https://music.wynk.in/music");
				
				 
	}

}
