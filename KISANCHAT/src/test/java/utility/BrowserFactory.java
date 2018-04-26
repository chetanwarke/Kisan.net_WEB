package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory{
	public static WebDriver driver;
	
	public void chromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "/home/chetan/eclipse-workspace/KISANCHAT/browser-drivers/chromedriver");
		driver = new ChromeDriver();
//		driver.get("http://net.kisan.co.in.s3-website.ap-south-1.amazonaws.com/#/select-language");
		driver.manage().window().maximize();
	
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public void firefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "/home/chetan/eclipse-workspace/KISANCHAT/browser-drivers/geckodriver");
		driver =  new FirefoxDriver();
		driver.get("http://net.kisan.co.in.s3-website.ap-south-1.amazonaws.com/#/select-language");
		
	}

}
