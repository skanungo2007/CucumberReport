Feature: Bank Test Guru99

	@Smoke
	Scenario: Basic login check
		Given User open the browser and access the URL
		When User is on homepage and verifies the title
		Then User gives "mngr26593" and "1!" to login
		And Verifies that profile id is displayed
		Then Click logout
		
		
	@Smoke
	Scenario: Login check with Data Table
		Given User opens the browser
		When User verifies the bank page
		Then User inputs the credentials
		|	mngr359049	|	YnumYpy	 |
		And Checks that the profile ID is visible
		Then Decides to logout	
		
		
	@Smoke
	Scenario: Valid login check with Maps
		Given User is on bank login page
		When Title of the page matches
		Then User enters the username and password
		|	username	|	password	|
		|	mngr26593	|	1!			|
		And User checks the id for the profile is displayed
		Then Use decides to logout
		
		
		
	@Regression
	Scenario Outline: Create account
		Given User check the title and the URL of the page
		When User enters "<username>" and "<password>" and login
		Then User makes sure that the profile id is displayed
		Then User click on new customer
		And User fills up the customer details
		Then User navigates back to profile page
		Then User clicks on new account
		And User fills up the account details
		|	CustomerID	|	AccountType	|	Deposit	|
		|	45804		|	Savings		|	5000	|
		Then User again navigates back
		Then User decides to click Logout button
		
	
		Examples:
		|	username	|	password	|
		|	mngr359057	|	zyjAsyb		|
		
		