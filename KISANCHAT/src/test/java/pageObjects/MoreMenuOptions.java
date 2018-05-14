package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.BaseClass;

public class MoreMenuOptions extends BaseClass{

	public MoreMenuOptions(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//attachment options
		By OptionCamera = By.xpath("//a[text()=' Camera']");
		By OptionImage = By.xpath("//a[text()=' Image ']");
		By OptionVideo = By.xpath("//a[text()=' Video']");
		By OptionAudio = By.xpath("//a[text()=' Audio']");
		By OptionLocation = By.cssSelector("i[class='zmdi zmdi-pin']");
		By imageInput = By.xpath("//*[@id='file-input']");
		
	//elements in more options
		By OptionChannelProfile = By.xpath("//a[text()=' Channel Profile']");
		By OptionEdit_Profile = By.xpath("//a[text()='Edit Profile']");
		By OptionInvite = By.xpath("//a[text()='Invite']");
		By OptionBlocked_Followers = By.xpath("//a[text()='Blocked Followers']");
		By OptionMute = By.xpath("//a[text()='Mute']");
		By OptionDelete_Channel = By.xpath("//a[text()='Delete Channel']");
		By OptionLeave_Channel = By.xpath("//a[text()='Leave Channel']");
		
	//clicks of attachment options
		public void click_OptionImage() {
			waitTillElementPresent(OptionImage);
			driver.findElement(OptionImage).click();
		}
		
		public void click_OptionCamera() {
			waitTillElementPresent(OptionCamera);
			driver.findElement(OptionCamera).click();
		}
		

		public void click_OptionVideo() {
			waitTillElementPresent(OptionVideo);
			driver.findElement(OptionVideo).click();
		}
		

		public void click_OptionAudio() {
			waitTillElementPresent(OptionAudio);
			driver.findElement(OptionAudio).click();
		}
		

		public void click_OptionLocation() {
			waitTillElementPresent(OptionLocation);
			driver.findElement(OptionLocation).click();
		}
		

		public void click_OptionChannelProfile() {
			waitTillElementPresent(OptionChannelProfile);
			driver.findElement(OptionChannelProfile).click();
		}
		

		public void click_OptionEdit_Profile() {
			waitTillElementPresent(OptionEdit_Profile);
			driver.findElement(OptionEdit_Profile).click();
		}
		

		public void click_OptionInvite() {
			waitTillElementPresent(OptionInvite);
			driver.findElement(OptionInvite).click();
		}
		
		

		public void click_OptionBlocked_Followers() {
			waitTillElementPresent(OptionBlocked_Followers);
			driver.findElement(OptionBlocked_Followers).click();
		}
		

		public void click_OptionMute() {
			waitTillElementPresent(OptionMute);
			driver.findElement(OptionMute).click();
		}
		

		public void click_OptionDelete_Channel() {
			waitTillElementPresent(OptionDelete_Channel);
			driver.findElement(OptionDelete_Channel).click();
		}
		
		public void click_OptionLeave_Channel() {
			waitTillElementPresent(OptionLeave_Channel);
			driver.findElement(OptionLeave_Channel).click();
		}
		

		
	//capturing image from camera
		public void takeCameraImage() {
			waitTillElementPresent(OptionCamera);
			driver.findElement(OptionCamera).click();
			
			
		}
}
