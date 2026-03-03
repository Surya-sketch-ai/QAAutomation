Feature: Login Functionality

Scenario: Verify login with valid credentials
	Given User should access application url as "https://www.saucedemo.com/"
	When  User should enter username as "standard_user" and password as "secret_sauce"
	Then  User should clcick on login button
	And   User should verify homepage title as "Swag Labs"
	
	
Scenario Outline: Verify login with invalid credentials
	Given User should access application url as "https://www.saucedemo.com/"
	When  User should enter username as "<username>" and password as "<password>"
	Then  User should clcick on login button
	And   User should verify errormessage as "Epic sadface: Username and password do not match any user in this service"
	
	
	Examples:
			|username  		|password  		| errormessage  															|
			|standard_user1	|secret_sauce1  | Epic sadface: Username and password do not match any user in this service	|
			