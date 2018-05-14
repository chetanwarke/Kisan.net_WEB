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
	
	By ALLchnlList = By.cssSelector("h4[class='mrgn-t-md']");
	
	//elements for channel profile opened
	By ProfilecloseBtn = By.cssSelector("a[class='closeBtn']");
	By ProfileFollowBtn = By.cssSelector("#showChannelProfileSideNav > app-show-channel-profile > div > div.profile_heading > div.plueCircle.pad-t-none.text-center.ng-star-inserted > a");
	By ProfileMoreBtn = By.cssSelector("#showChannelProfileSideNav > app-show-channel-profile > div > div.profile_heading > div:nth-child(1) > div.text-right > div > button > span > i");
	
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
	
	public void click_ChnlName(String name) {
		
	}
	
}