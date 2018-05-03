package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.BaseClass;

public class CommunityInfoPage extends BaseClass{

	public CommunityInfoPage(WebDriver driver) {
		super(driver);
	}
	
	By backArrowBtn = By.cssSelector("a[href='#/create-community']");
	By nextBtn = By.xpath("//a[text()='Next']");
	By nextBtN = By.cssSelector("#header > div > mat-list > mat-list-item:nth-child(2) > div > a");
	By infoTextEdit = By.cssSelector("textarea[placeholder=\"Max 144 characters\"]");
	By privateBtn = By.cssSelector("#mat-radio-3 > label > div.mat-radio-label-content");
	By publicBtn = By.cssSelector("#mat-radio-2 > label > div.mat-radio-label-content");
	
	public void click_backArrowBtn() {
		waitTillElementPresent(backArrowBtn);
		driver.findElement(backArrowBtn).click();
	}
	
	public void click_nextBtn() {
        	waitTillElementPresent(nextBtn);
    		driver.findElement(nextBtn).click();
	}
	
	public void set_infoTextEdit() throws Exception {
		waitTillElementPresent(infoTextEdit);
		driver.findElement(infoTextEdit).click();
		String chnlInfo = readTextInput("Channel", 1, 2);
		setText(infoTextEdit, chnlInfo);
	}
	public void click_privateBtn() {
		waitTillElementPresent(privateBtn);
		driver.findElement(privateBtn).click();
	}
	public void click_publicBtn() {
		waitTillElementPresent(publicBtn);
		driver.findElement(publicBtn).click();
	}
}
