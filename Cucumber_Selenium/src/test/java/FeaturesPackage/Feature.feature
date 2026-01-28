
@tag
  Feature: cucumber.io documentation page testing
  Background: 
  Given The user must be in chrome browser
@tag1
  Scenario: Verify the Documentation
    Given The user is in cucumber.io homepage
    When The user clicks on Documentation link
    Then The user can view the page content with What is Cucumber?
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
