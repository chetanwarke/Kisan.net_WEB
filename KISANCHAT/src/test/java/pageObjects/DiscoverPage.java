package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.BaseClass;

public class DiscoverPage extends BaseClass {

	public DiscoverPage(WebDriver driver) {
		super(driver);
		
	}
	
	By ALLchnlList = By.cssSelector("mat-card[class='text-center channelList greenColor mat-pad-none overflow-inherit mat-card']");
}
