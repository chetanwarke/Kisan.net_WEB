package testCases;

import org.testng.annotations.Test;

import pageObjects.LeftDrawer;
import pageObjects.WelcomeDashboardPage;
import utility.BrowserFactory;

public class LIST_CHANNELS extends BrowserFactory {

	@Test
	public void channelList() throws Exception {
		WelcomeDashboardPage wd = new WelcomeDashboardPage(driver);
		LeftDrawer ld = new LeftDrawer(driver);
			
		wd.click_leftDrawerBtn();
		ld.click_closeBtn();
		Thread.sleep(3000);
		wd.listChannels();		
//		wd.click_startDiscoveringLink();
	}

}
