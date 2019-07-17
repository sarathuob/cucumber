 Feature: Log into account
 		USer should be able to log into account and import vendor bills to the ERP system 
 		and verify the uploaded information    
 
 
 @first            
 Scenario: Log into the account and verify login
 Given log in page is loaded 
 When Log in button is present 
 Then goto enter email address page
 Then goto enter password field
 Then click sign in button
 
 @second 
 Scenario: verify vendor billing jobs page
 Given Vendor billing page is displayed 
 Then verify the title and tabs in the vendor billing page
 Then verify the table with past import jobs
  
 
 @third
 Scenario: create new vendor billing job
 When user is on the vendor billing page
 Given create new vendor billing job button is present  
 Then click the create new vendor billing job button
 Then user redirect to the create new vendor billing job page
 
 @fourth
 Scenario: upload a new vendor file and save it 
 When user is on the create new vendor billing job
 When Vendor name text box and vendor file upload text box is displayed
 Then user select the file to upload
 Then user click the upload button
 
 @fifth
 Scenario: verify the data uploaded from the file
 When uploaded data from the file is displayed as table data
 Then verify all invoice numbers format
 Then verify PO numbers contains only alpha numeric numbers
 Then verify invoice amount only have positive numbers
 
 