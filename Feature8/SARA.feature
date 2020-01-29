Feature: Login Action
Scenario Outline: Successful Login with Valid Credentials
	Given User is on HOme Page
	When User Navigate to Login Page
	And User enters "<username>" and "<password>"
	Then Message displayed Login Successfully
Examples:
	|username| |password|
	|admin| |password456|
	|lalitha| |password123|