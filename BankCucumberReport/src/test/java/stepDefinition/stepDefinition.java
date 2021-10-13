package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.util.Strings;

import baseClass.BankBaseClass;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageClass.BankAccountPage;
import pageClass.BankCustomerPage;
import pageClass.BankHomePage;
import pageClass.BankProfilePage;

public class stepDefinition extends BankBaseClass {

	//Scenario 1
	@Given("^User open the browser and access the URL$")
	public void user_open_the_browser_and_access_the_URL() throws Throwable {
	   
		BankBaseClass.setupBrowser();
	}

	@When("^User is on homepage and verifies the title$")
	public void user_is_on_homepage_and_verifies_the_title() throws Throwable {
	    
		BankHomePage home = new BankHomePage(driver);
		home.verifyPage();
		
		
	}

	@Then("^User gives \"(.*)\" and \"(.*)\" to login$")
	public void user_gives_and_to_login(String uname, String pass) throws Throwable {
	    
		BankHomePage home = new BankHomePage(driver);
		home.loginWithCredentials(uname, pass);
		
	}

	@And("^Verifies that profile id is displayed$")
	public void verifies_that_profile_id_is_displayed() throws Throwable {
	    
		BankProfilePage profile = new BankProfilePage(driver);
		profile.displayProfileId();
		
	}

	@Then("^Click logout$")
	public void click_logout() throws Throwable {
	   
		BankProfilePage profile = new BankProfilePage(driver);
		profile.logOut();
		
		BankBaseClass.closeBrowser();
		
	}
	
	//*********************************************************************************//
	
	
	//Scenario 2
	@Given("^User opens the browser$")
	public void user_opens_the_browser() throws Throwable {
	   
		BankBaseClass.setupBrowser();
	}

	@When("^User verifies the bank page$")
	public void user_verifies_the_bank_page() throws Throwable {
		
		BankHomePage home = new BankHomePage(driver);
		home.verifyPage();

	}

	@Then("^User inputs the credentials$")
	public void user_inputs_the_credentials(DataTable credentials) throws Throwable {
	    
		BankHomePage home = new BankHomePage(driver);
		
		List<List<String>> data = credentials.raw();
		
		home.loginWithCredentials(data.get(0).get(0), data.get(0).get(1));

		
	}

	@Then("^Checks that the profile ID is visible$")
	public void checks_that_the_profile_ID_is_visible() throws Throwable {
	   
		BankProfilePage profile = new BankProfilePage(driver);
		profile.displayProfileId();
		
	}

	@Then("^Decides to logout$")
	public void decides_to_logout() throws Throwable {
	   
		
		BankProfilePage profile = new BankProfilePage(driver);
		profile.logOut();
		
		BankBaseClass.closeBrowser();
		
	}
	


	//*********************************************************************************//
	
	
	//Scenario 3
	@Given("^User is on bank login page$")
	public void user_is_on_bank_login_page() throws Throwable {
	    
		BankBaseClass.setupBrowser();
		
	}

	@When("^Title of the page matches$")
	public void title_of_the_page_matches() throws Throwable {
	    
		BankHomePage home = new BankHomePage(driver);
		home.verifyPage();
		
	}

	@Then("^User enters the username and password$")
	public void user_enters_the_username_and_password(DataTable credentials) throws Throwable {
		
		BankHomePage home = new BankHomePage(driver);
	
		for(Map<String, String> data : credentials.asMaps(String.class, String.class)) {
			
			home.loginWithCredentials(data.get("username"), data.get("password"));
			
			
		}
	    
	}

	@Then("^User checks the id for the profile is displayed$")
	public void user_checks_the_id_for_the_profile_is_displayed() throws Throwable {
	   
		BankProfilePage profile = new BankProfilePage(driver);
		
		profile.displayProfileId();
		
	}

	@Then("^Use decides to logout$")
	public void use_decides_to_logout() throws Throwable {
	    
		BankProfilePage profile = new BankProfilePage(driver);
		profile.logOut();
		
		BankBaseClass.closeBrowser();
	}


	
	//*********************************************************************************//
	
	//Scenario 4
	
	@Before("@Regression")
	public void callSetup() throws IOException {
		
		BankBaseClass.setupBrowser();
	}
	
	
	@Given("^User check the title and the URL of the page$")
	public void user_check_the_title_and_the_URL_of_the_page() throws Throwable {
	    
		BankHomePage home = new BankHomePage(driver);
		home.verifyPage();
		
	}

	@When("^User enters \"(.*)\" and \"(.*)\" and login$")
	public void user_enters_and_and_login(String uname, String pass) throws Throwable {
	    
		BankHomePage home = new BankHomePage(driver);
		
		home.loginWithCredentials(uname, pass);
		
	}

	@Then("^User makes sure that the profile id is displayed$")
	public void user_makes_sure_that_the_profile_id_is_displayed() throws Throwable {
	    
		BankProfilePage profile = new BankProfilePage(driver);
		
		profile.displayProfileId();
	}

	@Then("^User click on new customer$")
	public void user_click_on_new_customer() throws Throwable {
	   
		BankProfilePage profile = new BankProfilePage(driver);
		
		profile.clickCustomer();
		
	}

	@Then("^User fills up the customer details$")
	public void user_fills_up_the_customer_details() throws Throwable {
	   
		BankCustomerPage customer = new BankCustomerPage(driver);
		
		customer.fillCustomerDetails();
		
		
	}

	@Then("^User navigates back to profile page$")
	public void user_navigates_back_to_profile_page() throws Throwable {
	   
		BankProfilePage profile = new BankProfilePage(driver);
		
		profile.navigateToManagerPage();
		
	}

	@Then("^User clicks on new account$")
	public void user_clicks_on_new_account() throws Throwable {
	    
		BankProfilePage profile = new BankProfilePage(driver);
		
		profile.clickAccount();
		
	}

	@Then("^User fills up the account details$")
	public void user_fills_up_the_account_details(DataTable values) throws Throwable {
	   
		BankAccountPage account = new BankAccountPage(driver);
		
		BankProfilePage profile = new BankProfilePage(driver);
		
		WebElement custId = driver.findElement(By.name("cusid"));
		WebElement acntType = driver.findElement(By.name("selaccount"));
		WebElement deposit = driver.findElement(By.name("inideposit"));
		
		
		Select dropdown = new Select(acntType);
		
		for(Map<String, String> data: values.asMaps(String.class, String.class)) {
			
			custId.sendKeys(data.get("CustomerID"));
			
			String type = data.get("AccountType");
			
			if(type.equalsIgnoreCase("Savings")) {
				
				dropdown.selectByVisibleText("Savings");
				
			} else {
				
				dropdown.selectByVisibleText("Current");
				
			}
			
			deposit.sendKeys(data.get("Deposit"));
			
			account.showAccountDetails();
			
			Thread.sleep(1000);
		}
		
		
		
	}

	@Then("^User again navigates back$")
	public void user_again_navigates_back() throws Throwable {
	    
		BankProfilePage profile = new BankProfilePage(driver);
		
		profile.navigateToManagerPage();
	}

	@Then("^User decides to click Logout button$")
	public void user_decides_to_click_Logout_button() throws Throwable {
	   
		BankProfilePage profile = new BankProfilePage(driver);
		profile.logOut();
		
	}


	@After("@Regression")
	public void callClose() {
		
		BankBaseClass.closeBrowser();
		
		
	}
}
