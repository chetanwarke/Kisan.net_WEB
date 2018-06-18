package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass extends BrowserFactory{
	//constructor
	public BaseClass(WebDriver driver) {
		this.driver = driver;
	}
	// set property of excel data file 
	public String excelSheetPath = prop.getProperty("excelDataFilePath");
	// read text input from excel sheet
	public String readTextInput(String sheetName, int RowNum, int ColNum)throws Exception {
		
		  File file = new File(System.getProperty("user.dir")+excelSheetPath);
	      FileInputStream fis = new FileInputStream(file);
	      XSSFWorkbook workbook = new XSSFWorkbook(fis);
	      XSSFSheet spreadsheet = workbook.getSheet(sheetName);
	      XSSFCell cell = spreadsheet.getRow(RowNum).getCell(ColNum);	
	      
	        DataFormatter dataFormatter = new DataFormatter();
	        String cellData = dataFormatter.formatCellValue(cell);
			return cellData;
	}
	//read number input from excel sheet
	public double readNumberInput(String sheetName, int RowNum, int ColNum)throws Exception {
		
		  File file = new File(System.getProperty("user.dir")+excelSheetPath);
	      FileInputStream fis = new FileInputStream(file);
	      
	      XSSFWorkbook workbook = new XSSFWorkbook(fis);
	      XSSFSheet spreadsheet = workbook.getSheet(sheetName);
	      XSSFCell cell = spreadsheet.getRow(RowNum).getCell(ColNum);
	      
	      if(cell == null)
	        {
	            System.out.println("finding cell in sheet is null ");
	        }
	        else if(cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
	        {
	            System.out.println("finding number is text ");
	        }  
	      
			double cellData = cell.getNumericCellValue();
			return cellData;
	}
	
	//remove/delete rows fron sheet
	public void removeSheet(String sheetName) throws Exception {
		File file = new File(System.getProperty("user.dir")+excelSheetPath);
	      FileInputStream fis = new FileInputStream(file);
	      
	      XSSFWorkbook workbook = new XSSFWorkbook(fis);
	      XSSFSheet spreadsheet = workbook.getSheet(sheetName);
	      
//	      int lastRowNum=spreadsheet.getLastRowNum();
	      
	      for(int i=workbook.getNumberOfSheets()-1;i>=0;i--){
	            XSSFSheet tmpSheet =workbook.getSheetAt(i);
	            if(!tmpSheet.getSheetName().equals(sheetName)){
	            	workbook.removeSheetAt(i);
	            }
	        }   
	}
	
	
	//write data in excel sheet
	public void writeToSheet_DiscoverList(String sheetName) throws Exception {
		File file = new File(System.getProperty("user.dir")+excelSheetPath);
	      FileInputStream fis = new FileInputStream(file);
	      
	      XSSFWorkbook workbook = new XSSFWorkbook(fis);
	      XSSFSheet spreadsheet = workbook.createSheet(sheetName);
//	      XSSFSheet spreadsheet = workbook.getSheet(sheetName);
	    
	      //Create row object
	      XSSFRow row;
	      
	    List <WebElement> chs = driver.findElements(By.cssSelector("h4[class='mrgn-t-md']"));
	    System.out.println("Total no of channels on Discover channel list : "+chs.size());
	
	}
	
	
	
	//wait for loader to close
	public WebDriverWait waitForLoaderClose(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement loader = driver.findElement(By.cssSelector("div[class='loadingoverlay']"));
		if(loader.isDisplayed()) {
			wait.until(ExpectedConditions.invisibilityOf(loader));
		}else
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		return wait;
	}
	
	// wait for element to appears
	public WebDriverWait waitTillElementPresent(By locator){
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return wait;
	}
	// wait for element to be clickable
	public WebDriverWait waitTillElementClickable(By locator){
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		return wait;
	}
	// submit/enter text in text field/text area
	public void setText(By locator, String text)
	{           
		driver.findElement(locator);
		Actions action = new Actions(driver);
		action.sendKeys(text).perform();
	}
	// submit/enter number in number field
	public void setNumber(By locator, double number)
	{           
		driver.findElement(locator);
		Actions action = new Actions(driver);
		action.sendKeys(String.valueOf(number)).perform();
	}
}
