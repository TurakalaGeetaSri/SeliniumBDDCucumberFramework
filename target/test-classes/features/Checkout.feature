Feature: E-commerce Site Scenarios
	
Background:
When  User landed on application and navigates to Login button

@tcid:C337754
 Scenario Outline: Verify edit cart
 When user enters <username> and <password>
 Then I search for the item
 And item PDP is opened and add product to cart 
 Then go to cart
And edit item <quantity> 
 
  Examples:
 |username|password|quantity|
 |pleaseenterusername|pleaseenterpassword|4|
 
 @tcid:337751
 Scenario Outline: Verify checkout 
 When user enters <username> and <password>
 Then I search for the item
 And item PDP is opened and add product to cart
 When users proceed to checkout 
 Then user enters '<country>','<fullname>','<mobileno>','<pincode>','<flatno>','<streetadd>','<landmark>','<city>','<state>'

  Examples:
 |username             |password|country|fullname|mobileno|pincode|flatno|streetadd|landmark|city|state|
 |pleaseenterusername|pleaseenterpassword| India     |  jenny       |    9186321909     |  533002   | 59-12-3    | Jagannaickpur      |       |   Kakinada    |  ANDHRA PRADESH      |
 