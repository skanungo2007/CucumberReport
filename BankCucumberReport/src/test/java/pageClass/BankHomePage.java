package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BankBaseClass;

public class BankHomePage extends BankBaseClass {
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement userName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(css="input[name='btnLogin']")
	WebElement loginBtn;
	
	@FindBy(xpath="//h2")
	WebElement banner;
	
	
	public BankHomePage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void verifyPage() {
		
		try {
			
			System.out.println("Title of the page: " + driver.getTitle());
			System.out.println("URL: " + driver.getCurrentUrl());
			System.out.println("Banner Text: " + banner.getText());
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
			driver.close();
			
		}
	
		
	}
	
	
	public void loginWithCredentials(String uname, String pass) {
		
		try {
			
			userName.sendKeys(uname);
			password.sendKeys(pass);
			
			userName.click();
			
			loginBtn.click();
			
			Thread.sleep(1000);
			
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
			driver.close();
			
		}
		
	}
	

}
