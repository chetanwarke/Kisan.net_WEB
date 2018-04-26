package utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory{
	public static WebDriver driver;
	public static Properties prop = new Properties();
	
    public static void SetProperties() throws Exception {
		
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"/Property File/config.properties");
		prop.load(fis);		
	}
	
	public void chromeBrowser(){
		String path = prop.getProperty("chromedriverPath");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+prop.getProperty("chromedriverPath"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public void firefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/browser-drivers/geckodriver");
		driver =  new FirefoxDriver();
		driver.get("http://net.kisan.co.in.s3-website.ap-south-1.amazonaws.com/#/select-language");
		
	}

}
