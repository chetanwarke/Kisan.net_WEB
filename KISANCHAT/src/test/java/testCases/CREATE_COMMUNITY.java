package testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CategoriesPage;
import pageObjects.ChannelDashboard;
import pageObjects.CommunityInfoPage;
import pageObjects.CreateCommunityPage;
import pageObjects.LeftDrawer;
import pageObjects.WelcomeDashboardPage;
import utility.BrowserFactory;

public class CREATE_COMMUNITY extends BrowserFactory {
	@BeforeTest
	public void onMychat() throws Exception {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(prop.getProperty("welcome-dashboardPath"));
		Thread.sleep(8000);
		WelcomeDashboardPage wd = new WelcomeDashboardPage(driver);
		wd.click_leftDrawerBtn();
	}
	
	@Test
	public void createChnl() throws Exception {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		LeftDrawer ld = new LeftDrawer(driver);
		CreateCommunityPage ccp = new CreateCommunityPage(driver);
		CommunityInfoPage cip = new CommunityInfoPage(driver);
		CategoriesPage cp = new CategoriesPage(driver);
		Thread.sleep(2000);
		ld.click_startYourChannel();
		ccp.set_channelName();
		ccp.click_colorBucket();
		ccp.set_colorBucketHexCode();
		ccp.click_colorBucketOkBtn();
		Thread.sleep(3000);
		ccp.click_nextBtn();
		cip.set_infoTextEdit();
		cip.click_publicBtn();
		cip.click_nextBtn();
		Thread.sleep(2000);
		cp.select_agriculture();
		cp.click_nextBtn();
	}
	
	@AfterTest
	public void naviagteTOWelcomeDashboard() throws Exception {
		Thread.sleep(3000);
		ChannelDashboard cd = new ChannelDashboard(driver);
		cd.click_leftDrawerBtn();
		LeftDrawer ld = new LeftDrawer(driver);
		ld.click_myChats();
		Thread.sleep(2000);
	}

}
