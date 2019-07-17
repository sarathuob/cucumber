 Feature: Log into account
 		USer should be able to log into account and import vendor bills to the ERP system 
 		and verify the uploaded information    
 
 
 @first            
 Scenario: Log into the account and verify login
 Given I want food in "AR51 1AA"
 When I search for restaurants
 Then I should see some restaurants in "AR51 1AA"
 
 @second 
 Scenario: Click the first restaurant to place order
 Given Restaurants lists are displayed
 When I click on the first restaurant title
 Then I should redirect to the menu page for that restaurant 
 
 @third
 Scenario: Verify the help page
 When user redirect to Help page
 Given help page is displayed  
 Then verify buttons displayed in the help file
 