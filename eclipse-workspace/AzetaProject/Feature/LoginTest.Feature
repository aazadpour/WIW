Feature: WIW Login Page

Scenario: Correct Page Title is Displayed
	Given User is on Login Page
	When User is attempting to Login
	Then Title of Page is Displayed Successfully
	
Scenario: Successful Login with Valid Credentials
	Given User is on Login Page
	When User is attempting to Login with Valid Credentials
	And User enters correct Username
	And User enters correct Password
	Then User will land on Dashboard
	
Scenario: Successful Logout with Faulty Credentials
	Given User is on Login Page
	When User is attempting to Login with Faulty Credentials
	And User enters correct Username in Username Box
	But User inputs incorrect Password In Password Box
	Then Error appears that User Entered Faulty Credentials
	
Scenario: View My Schedule Page
	Given User is on Login Page
	When User logs in successfully and goes to My Schedule
	And User clicks on my schedule link
	Then User can see their current schedule