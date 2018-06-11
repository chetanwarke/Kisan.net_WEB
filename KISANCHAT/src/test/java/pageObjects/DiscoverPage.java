package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.BaseClass;

public class DiscoverPage extends BaseClass {

	public DiscoverPage(WebDriver driver) {
		super(driver);	
	}
	
	By closeBtn = By.cssSelector("#lightergrayColorBody > app-root > app-discover-channels > mat-sidenav-container > mat-sidenav-content > div > div > mat-list > mat-list-item:nth-child(1) > div > a");
	By filterBtn = By.cssSelector("#lightergrayColorBody > app-root > app-discover-channels > mat-sidenav-container > mat-sidenav-content > div > div > mat-list > mat-list-item.searchFilter.mat-list-item > div > div.widthfull > div:nth-child(2) > div > img");
	By searchBtn = By.cssSelector("#lightergrayColorBody > app-root > app-discover-channels > mat-sidenav-container > mat-sidenav-content > div > div > mat-list > mat-list-item.searchFilter.mat-list-item > div > div.widthfull > div:nth-child(1) > div > input");
	By searchInput = By.cssSelector("#lightergrayColorBody > app-root > app-discover-channels > mat-sidenav-container > mat-sidenav-content > div > div > mat-list > mat-list-item.searchFilter.mat-list-item > div > div.widthfull > div:nth-child(1) > div > div > input");
	By gotItBtn = By.xpath("//span[text()='Got It']");
	
	By ALLchnlList = By.cssSelector("h4[class='mrgn-t-md']");
	
	//list of all channels
	public void discoverList() throws Exception {
		Thread.sleep(2000);
		List <WebElement> chs = driver.findElements(By.cssSelector("h4[class='mrgn-t-md']"));
		System.out.println("Total no of channels on Discover channel list : "+chs.size());
		int i=1;
		for(WebElement we : chs)
		{
			System.out.println(i+" : "+we.getText());	
			i++;
		}
	}
	
	//click on ok got it messagee btn
	public void click_gotItBtn() {
		waitTillElementPresent(gotItBtn);
		driver.findElement(gotItBtn).click();
	}
	
	public void click_ChnlName(String name) {
		List <WebElement> chs = driver.findElements(By.cssSelector("h4[class='mrgn-t-md']"));
		for(WebElement we : chs)
		{
			String channel = we.getText();
			if(name.equals(channel)) {
				By chnlName = By.xpath("//h4[text()="+name+"]");
				waitTillElementPresent(chnlName);
				driver.findElement(chnlName).click();
			}
				
		}
	}
	
	public void click_closeBtn() {
		waitTillElementPresent(closeBtn);
		driver.findElement(closeBtn).click();
	}
}
