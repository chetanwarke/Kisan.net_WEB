package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.LeftDrawer;
import pageObjects.WelcomeDashboardPage;
import utility.BrowserFactory;

public class LIST_CHANNELS extends BrowserFactory {

	@Test
	public void channelList() throws Exception {
		WelcomeDashboardPage wd = new WelcomeDashboardPage(driver);
		wd.click_leftDrawerBtn();
		LeftDrawer ld = new LeftDrawer(driver);
		ld.click_closeBtn();
		Thread.sleep(3000);
		wd.listChannels();
		
//		wd.click_startDiscoveringLink();
	}

}
