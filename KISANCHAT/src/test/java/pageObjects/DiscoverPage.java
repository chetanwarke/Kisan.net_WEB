package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	
	//elements in more options
	By optionEdit_Profile = By.xpath("//a[text()='Edit Profile']");
	By optionInvite = By.xpath("//a[text()='Invite']");
	By optionBlocked_Followers = By.xpath("//a[text()='Blocked Followers']");
	By optionMute = By.xpath("//a[text()='Mute']");
	By optionDelete_Channel = By.xpath("//a[text()='Delete Channel']");
	By optionLeave_Channel = By.xpath("//a[text()='Leave Channel']");
}
