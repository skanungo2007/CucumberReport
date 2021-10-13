package pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BankBaseClass;

public class BankAccountPage extends BankBaseClass {
	
	@FindBy(name="cusid")
	WebElement custId;
	
	@FindBy(name="selaccount")
	WebElement accountType;
	
	@FindBy(name="inideposit")
	WebElement initialDeposit;
	
	@FindBy(css="input[type='submit']")
	WebElement subBtn;
	
	
	
	public BankAccountPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void showAccountDetails() {
		
		try {
			
			subBtn.click();
			
			Thread.sleep(1000);
			
			WebDriverWait expWait = new WebDriverWait(driver, 5);
			
			expWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='account']/tbody")));
			
			System.out.println();
			
			System.out.println(driver.findElement(By.xpath("//table[@id='account']/tbody")).getText());
			
			System.out.println();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
			driver.close();
		}
		
	}

}
