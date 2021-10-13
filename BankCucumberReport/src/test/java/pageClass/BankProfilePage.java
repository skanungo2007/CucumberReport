package pageClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BankBaseClass;

public class BankProfilePage extends BankBaseClass {
	
	@FindBy(xpath="//*[contains(text(),'Manger Id : ')]")
	WebElement mID;
	
	@FindBy(linkText="Log out")
	WebElement logout;
	
	@FindBy(linkText="New Account")
	WebElement account;
	
	@FindBy(linkText="New Customer")
	WebElement customer;

	@FindBy(xpath="//ul[@class='menusubnav']//a[text()='Manager']")
	@CacheLookup
	WebElement managerPage;
	
	public BankProfilePage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void displayProfileId() {
		
		try {
			
			System.out.println(mID.getText());
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
			driver.close();
			
		}
		
		
	}
	
	
	public void logOut() {
		
		try {
			
			logout.click();
			
			Thread.sleep(1000);
			
			Alert alert = driver.switchTo().alert();
			
			System.out.println(alert.getText());
			
			alert.accept();
			
			Thread.sleep(2000);
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
			driver.close();
		}
	}
	
	
	public void clickAccount() {
		
		try {
			
			account.click();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
			driver.close();
			
		}
	}
	
	public void clickCustomer() {
		
		try {
			
			customer.click();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
			driver.close();
			
		}
	}
	
	
	public void navigateToManagerPage() {
		
		try {
			
			managerPage.click();
			
			Thread.sleep(1000);
			 
		} catch(Exception e) {
			
			e.printStackTrace();
			
			driver.close();
		}
	}
	
}
