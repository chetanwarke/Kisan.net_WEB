package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.BaseClass;

public class ChannelDashboard extends BaseClass{

	public ChannelDashboard(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//page visible elements
	By leftDrawerBtn = By.cssSelector("#header > button:nth-child(1)");
	By chnlName = By.cssSelector("#header > button:nth-child(2) > a");
	By broadcastHereBtn = By.cssSelector("#greenColorBody > app-root > app-channel-dashboard > div > div > mat-sidenav-container > mat-sidenav-content > nav > div.one-on-one-icon > a > span > img");
	By chnlImageOnHead = By.cssSelector("#dashTopHeader1 > div > a > img");
	By broadcastOnHead = By.cssSelector("#dashTopHeader1 > div > a > span");
	By attachmentBtn = By.cssSelector("#dashTopHeader > div.topRight > mat-icon:nth-child(2) > button > span > i");
	By moreBtn = By.cssSelector("#dashTopHeader > div.topRight > mat-icon:nth-child(3) > button > span > i");
	By typeAmessage = By.cssSelector("textarea[placeholder='Type a message']");
	By send = By.cssSelector("i[class=\"zmdi zmdi-mail-send\"]");
	//attachment options
	By cameraOption = By.xpath("//a[text()=' Camera']");
	By imageOption = By.cssSelector("#cdk-overlay-3 > div > div > button:nth-child(2)");
	By videoOption = By.xpath("//a[text()=' Video']");
	By audioOption = By.xpath("//a[text()=' Audio']");
	By locationOption = By.cssSelector("#cdk-overlay-4 > div > div > button:nth-child(5)");
	By imageInput = By.xpath("//*[@id='file-input']");
	//more menu options
	By moreChannelProfileOption = By.xpath("//a[text()=' Channel Profile']");
	By moreInviteOption = By.xpath("//a[text()='Invite']");
	By moreMuteOPtion = By.xpath("//a[text()='Mute']");
	
	public void click_leftDrawerBtn() {
		waitTillElementPresent(leftDrawerBtn);
		driver.findElement(leftDrawerBtn).click();
	}
	
	public void click_chnlName() {
		waitTillElementPresent(chnlName);
		driver.findElement(chnlName).click();
	}
	
	public void click_broadcastHereBtn() {
		waitTillElementPresent(broadcastHereBtn);
		driver.findElement(broadcastHereBtn).click();
	}
	
	public void click_chnlImageOnHead() {
		waitTillElementPresent(chnlImageOnHead);
		driver.findElement(chnlImageOnHead).click();
	}
	
	public void click_broadcastOnHead() {
		waitTillElementPresent(broadcastOnHead);
		driver.findElement(broadcastOnHead).click();
	}
	
	public void click_attachmentBtn() {
		waitTillElementPresent(attachmentBtn);
		driver.findElement(attachmentBtn).click();
	}
	
	public void click_moreBtn() {
		waitTillElementPresent(moreBtn);
		driver.findElement(moreBtn).click();
	}
	//inputting text in text field 
	public void click_typeAmessage() {
		waitTillElementPresent(typeAmessage);
		driver.findElement(typeAmessage).click();
	}
	//send the text
	public void click_send() {
		waitTillElementPresent(send);
		driver.findElement(send).click();
	}
	//capturing image from camera
	public void takeCameraImage() {
		waitTillElementPresent(cameraOption);
		driver.findElement(cameraOption).click();
		
		
	}
	//sending image from local storage
	public void sendLocalImage() {
		
	}
}
