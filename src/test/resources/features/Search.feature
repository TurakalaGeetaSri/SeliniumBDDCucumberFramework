Feature: E-commerce Site Scenarios
	
Background:
When  User landed on application and navigates to Login button

@tcid:C337758
 Scenario Outline: Verify Search item
 When user enters <username> and <password>
 Then I search for the item
 Examples:
 |username|password|
 |pleaseenterusername|pleaseenterpassword|
 