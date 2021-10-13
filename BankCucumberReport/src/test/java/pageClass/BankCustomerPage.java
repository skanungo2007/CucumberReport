package pageClass;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BankBaseClass;
import utility.BankReadProperty;

public class BankCustomerPage extends BankBaseClass {
	
	@FindBy(name="name")
	WebElement cname;
	
	@FindBy(css="input[value='f']")
	WebElement female;
	
	@FindBy(css="input[value='m']")
	WebElement male;
	
	@FindBy(id="dob")
	WebElement dob;
	
	@FindBy(name="addr")
	WebElement address;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="pinno")
	WebElement pin;
	
	@FindBy(name="telephoneno")
	WebElement mobile;
	
	@FindBy(name="emailid")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="sub")
	WebElement subBtn;
	

	
	public BankCustomerPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void fillCustomerDetails() throws IOException {
		
		try {
			
			cname.sendKeys(BankReadProperty.readProperty("name"));
			
			String gen = BankReadProperty.readProperty("gender");
			
			if(gen.equalsIgnoreCase("female")) {
				
				female.click();
			}
			
			dob.sendKeys(BankReadProperty.readProperty("date"));
			
			address.sendKeys(BankReadProperty.readProperty("address"));
			
			city.sendKeys(BankReadProperty.readProperty("city"));
			
			state.sendKeys(BankReadProperty.readProperty("state"));
			
			pin.sendKeys(BankReadProperty.readProperty("pin"));
			
			mobile.sendKeys(BankReadProperty.readProperty("number"));
			
			email.sendKeys(BankReadProperty.readProperty("email"));
			
			password.sendKeys(BankReadProperty.readProperty("password"));
			
			
			subBtn.click();
			
			Thread.sleep(1000);
			
			
			
			
					
			System.out.println();
						
			System.out.println(driver.findElement(By.xpath("//table[@id='customer']/tbody")).getText());
						
					
					
				
	
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
			driver.close();
			
		}
		
		
	}
	
	

}
