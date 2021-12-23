Feature: Validating the facebook page

Scenario Outline: Validate the login functionality with username and password

	Given User in login page
	When User should enter valid "<username>" and invalid "<password>"
	And User sholud click login button
	Then Verify Error message should be displayed



Examples:
		|username|password|
		|ramkumar|hello@123|