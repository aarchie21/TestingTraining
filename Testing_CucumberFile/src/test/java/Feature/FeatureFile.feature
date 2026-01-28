#Author: your.email@your.domain.com

@tag
Feature: cucumber.io documentation page testing
 
@tag1
  Scenario: Verify the Documentation
    Given The user is in cucumber.io homepage
    When The user clicks on Documentation link
    Then The user can view the page content with What is Cucumber?

    @tag2
    Scenario Outline: Login Form Validation
    Given The user is in Login Form
    When The user enters "<Username>" in username field
    And The user enters "<Password>" in password field
    * The user clicks on Login button
    Then The user get the status message as "<Status>" in alert
    
    Examples:
    | Username   | Password | Status |
    | admin      | admin    | pass   |
    | fontoffice | pass234  | fail   |
    | admin123   | pass2312 | pass   |
