#
#Author: your.email@your.domain.com
#
# Author: your.email@your.domain.com
#
#@signup
#Feature: Signup Page Validation
#
  #Background:
    #Given The user is using a Chrome browser
    #And The user is on the BooksWagon signup page
#
  #@name-validation
  #Scenario: Validate the Name field with various inputs
    #When The user enters a name from Excel into the Name field
    #And The user enters a valid phone number from Excel
    #And The user checks the captcha checkbox
    #And The user clicks on the Continue button
    #Then The user should see the expected Name field validation message
#
  #@phone-validation
  #Scenario: Validate the Phone Number field with various inputs
    #When The user enters a valid name from Excel
    #And The user enters a phone number from Excel into the Phone Number field
    #And The user checks the captcha checkbox
    #And The user clicks on the Continue button
    #Then The user should see the expected Phone Number validation message
#
  #@empty-phone
  #Scenario: Empty Phone Number field
    #When The user enters a valid name
    #And The user leaves the Phone Number field empty
    #And The user checks the captcha checkbox
    #And The user clicks the Continue button
    #Then The user should see "Please enter Mobile"
#
  #@empty-name
  #Scenario: Empty Name field
    #When The user leaves the Name field empty
    #And The user enters a valid phone number
    #And The user checks the captcha checkbox
    #And The user clicks the Continue button
    #Then The user should see "Please enter Name"
    
@tag
Feature: Signup and Login
    
Background:
	Given: The user must be in chrome Broswer
	

  @tag1
  Scenario: Login Validation
    Given the user is in signup page
    And User has entered the resgriration feilds
    And user checks captcha
    And user clicks on continue
    Then user sees otp mobile