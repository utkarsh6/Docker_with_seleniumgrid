package Docker;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v117.browser.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerwithChrome {
	
	@Test
	public  void Firefoxtest() throws MalformedURLException {
	    	
//	    	 ChromeOptions options = new ChromeOptions();
//	         options.setCapability("browserName", "chrome");
			 FirefoxOptions options= new FirefoxOptions();
			 options.setCapability("browserName", "firefox");
		    
	    	WebDriver driver =new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
	    	driver.get("https://opensource-demo.orangehrmlive.com");
	    	System.out.println("title is :"+ driver.getTitle());
	    	driver.close();

//		DesiredCapabilities dc=  DesiredCapabilities.chrome();
//		URL url= new URL("http://localhost:4444/wd/hub");
//		RemoteWebDriver driver= new RemoteWebDriver(url,dc);
//		driver.get("https://opensource-demo.orangehrmlive.com");
//		System.out.println("title is :"+ driver.getTitle());
		
	}

}
