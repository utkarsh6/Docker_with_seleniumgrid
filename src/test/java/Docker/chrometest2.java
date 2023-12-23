package Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class chrometest2 {
	@Test
	public void test2() throws MalformedURLException {
		 ChromeOptions options = new ChromeOptions();
		 options.setCapability("browserName", "chrome");
	
	    
    	WebDriver driver =new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
    	driver.get("https://filpkart.com");
    	System.out.println("title is :"+ driver.getTitle());
    	driver.close();
	}

}
