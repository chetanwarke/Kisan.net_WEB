package utility;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory{
	public static WebDriver driver;
	public static Properties prop = new Properties();
	
    public static void SetProperties() throws Exception {
		
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"/Property File/config.properties");
		prop.load(fis);		
	}
	
	public void chromeBrowser(){
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+prop.getProperty("chromedriverPath"));
		String chromeProfilePath = prop.getProperty("chromeProfilePath");
//		ChromeOptions chromeProfile = new ChromeOptions();
//		chromeProfile.addArguments("chrome.switches", "--disable-extensions");
//		chromeProfile.addArguments("user-data-dir=" + chromeProfilePath);
//		driver = new ChromeDriver(chromeProfile);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ArrayList<String> switches = new ArrayList<String>();
		switches.add("--user-data-dir=" + chromeProfilePath);
		capabilities.setCapability("chrome.switches", switches);
		driver = new ChromeDriver(capabilities);
	
		
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public void firefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/browser-drivers/geckodriver");
		driver =  new FirefoxDriver();
	}

}
