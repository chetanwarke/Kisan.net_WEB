package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.BaseClass;

public class CategoriesPage extends BaseClass{

	public CategoriesPage(WebDriver driver) {
		super(driver);
	}

	By agriculture = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/agriculture.jpg']");
    By horticulture = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/horticulture.jpg']");
	By irrigation = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/irrigation.jpg']");
	By animalHusbandry = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/animal_husbandry.jpg']");
	By farmAlliedActivities = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/farm_allied_activities.jpg']");
	By machineandTools = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/machine_and_tools.jpg']");
	By postHarvest = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/post_harvest.jpg']");
	By agriTrading = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/agri_trading.jpg']");
	By bioTechnology = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/bio_technology.jpg']");
	By organicFarming = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/organic_farming.jpg']");
	By agroChemicals = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/argo_chemicals.jpg']");
	By agriBusiness = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/agri_business.jpg']");
    By farmServices = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/farm_services.jpg']");
	By agriFinanceAndInsurance = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/agri_finance_and_insurance.jpg']");
	By alternateEnergy = By.cssSelector("img[src='https://s3.ap-south-1.amazonaws.com/kisan-common/oauth-categories/alternate_energy.jpg']");
	By nextBtn = By.cssSelector("#topLinkGreen > div > mat-list > mat-list-item:nth-child(2) > div > a");
	By backBtn = By.cssSelector("i[class='zmdi zmdi-arrow-left']");
	
	public void select_agriculture(){
		waitTillElementPresent(agriculture);
		driver.findElement(agriculture).click();
	}
	
	public void select_horticulture(){
		waitTillElementPresent(horticulture);
		driver.findElement(horticulture).click();
	}
	
	public void select_irrigation(){
		waitTillElementPresent(irrigation);
		driver.findElement(irrigation).click();
	}
	
	public void select_animalHusbandry(){
		waitTillElementPresent(animalHusbandry);
		driver.findElement(animalHusbandry).click();
	}
	
	public void select_farmAlliedActivities(){
		waitTillElementPresent(farmAlliedActivities);
		driver.findElement(farmAlliedActivities).click();
	}
	
	public void select_machineandTools(){
		waitTillElementPresent(machineandTools);
		driver.findElement(machineandTools).click();
	}
	
	public void select_postHarvest(){
		waitTillElementPresent(postHarvest);
		driver.findElement(postHarvest).click();
	}
	
	public void select_agriTrading(){
		waitTillElementPresent(agriTrading);
		driver.findElement(agriTrading).click();
	}
	
	public void select_bioTechnology(){
		waitTillElementPresent(bioTechnology);
		driver.findElement(bioTechnology).click();
	}
	
	public void select_organicFarming(){
		waitTillElementPresent(organicFarming);
		driver.findElement(organicFarming).click();
	}
	
	public void select_agroChemicals(){
		waitTillElementPresent(agroChemicals);
		driver.findElement(agroChemicals).click();
	}
	
	public void select_agriBusiness(){
		waitTillElementPresent(agriBusiness);
		driver.findElement(agriBusiness).click();
	}
	
	public void select_agriFinanceAndInsurance(){
		waitTillElementPresent(agriFinanceAndInsurance);
		driver.findElement(agriFinanceAndInsurance).click();
	}
	
	public void select_farmServices(){
		waitTillElementPresent(farmServices);
		driver.findElement(farmServices).click();
	}
	
	public void select_alternateEnergy(){
		waitTillElementPresent(alternateEnergy);
		driver.findElement(alternateEnergy).click();
	}
	
	public void click_nextBtn(){
		waitTillElementPresent(nextBtn);
		driver.findElement(nextBtn).click();
	}
	
	public void click_backBtn(){
		waitTillElementPresent(backBtn);
		driver.findElement(backBtn).click();
	}
}
