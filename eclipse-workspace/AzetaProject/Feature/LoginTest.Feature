Feature: WIW Login Page

Scenario: Correct Page Title is Displayed
	Given User is on Login Page
	When User Navigates to Login Page
	Then Title of Page is Displayed Successfully
	
Scenario: Successful Login with Valid Credentials
	Given User is on Login Page
	When User Navigates to Login Page
	And User enters Username and Password
	Then Assert Successful Login
	
Scenario: Successful Logout with Faulty Credentials
	Given User is on Dashboard Page
	When User Navigates to Logout Button
	And User clicks Logout button
	Then Assert Successful Logout
	
Scenario: View My Schedule Page
	Given User is on Dashboard Page
	When User Navigates to Logout Button
	And User clicks Logout button
	Then Assert Successful Logout