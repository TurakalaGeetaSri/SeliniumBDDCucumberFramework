Feature: E-commerce Site Scenarios
	
Background:
When  User landed on application and navigates to Login button

@tcid:337750
Scenario Outline: Verify sign/in success Events
When user enters <username> and <password>
#And User clicks on login button should be taken to successful login page

 Examples:
 |username|password|
 |pleaseenterusername|pleaseenterpassword|
 
  @tcid:C337755
 Scenario Outline: Verify logout
 When user enters <username> and <password>
 Then user logout and leave site
 
  Examples:
 |username|password|
 |pleaseenterusername|pleaseenterpassword|