Feature: E-commerce Site Scenarios
	
Background:
When  User landed on application and navigates to Login button

 @tcid:C33775
 Scenario Outline: Verify add to cart
 When user enters <username> and <password>
 Then I search for the item
 And item PDP is opened and add product to cart 
 
 Examples:
 |username|password|
 |pleaseenterusername|pleaseenterpassword|
 
 @tcid:C337753
 Scenario Outline: Verify remove from cart
 When user enters <username> and <password>
 Then I search for the item
 And item PDP is opened and add product to cart 
Then go to cart
 And remove item from cart
 
  Examples:
 |username|password|
 |pleaseenterusername|pleaseenterpassword|
 