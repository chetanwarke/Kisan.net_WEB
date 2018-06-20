package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.BaseClass;

public class UserProfileDrawer extends BaseClass{

	public UserProfileDrawer(WebDriver driver) {
		super(driver);
	}

	By closeBtn = By.xpath("//a[@class='closeBtn']");
	By profileImg = By.xpath("//img[@alt='profile_pic']");
	By userName = By.xpath("//div/h4[@class='mrgn-t-lg mrgn-b-xs font-bold-three ng-star-inserted']");
	By editProfileBtn = By.cssSelector("#showUserProfileSideNav > app-show-user-profile > div > div.profile_heading > div.plueCircle.pad-t-none.text-center > a > span > i");
	By chnlList = By.cssSelector("");
	By viewAll = By.cssSelector("");
	
	public void get_userName() {
		waitTillElementPresent(userName);
		String name = driver.findElement(userName).getText();
	}
	
	public void click_closeBtn() {
		waitTillElementPresent(closeBtn);
		driver.findElement(closeBtn).click();
	}
	
	public void click_editProfileBtn() {
		waitTillElementPresent(editProfileBtn);
		driver.findElement(editProfileBtn).click();
	}
}
