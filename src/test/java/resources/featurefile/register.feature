@regression
Feature: Register Page Functionality
  As a User I want to register my account from casino borgataonline page

  Background: I am on homepage
    And I click on close button of advertisement

  Scenario Outline: Verify that I can do registration
    When I click on register button
    Then I am on register page
    And I enter the email address "<email>"
    And I enter password "<password>"
    And I click on continue button
    Then I select gender "<gender>"
    And I enter firstName "<fname>"
    And I enter lastName "<lname>"
    And I enter SSN number "<ssnNumber>"
    And I select month "<month>"
    And I select day "<day>"
    And I select year "<year>"
    Then I click on continue button
    And I click on Enter address manually
    And I enter street address "<address>"
    And I enter city "<city>"
    And I select state "<state>"
    And I enter zipcode "<zipcode>"
    And I enter Mobile number "<mobile>"
    And I select age verification box
    And I select I acknowledge box
    And I select agreement box
    And I click on create my account button
    Then verify message "<message>"



    Examples:
      | email       | password  | gender | fname  | lname | ssnNumber | month | day | year | address   | city    | state  | zipcode | mobile     | message                                                                                                                                                                                                        |
      | v@gmail.com | v123456@A | Ms.    | vishwa | patel | 1234      | Jan   | 11  | 1996 | 56 asking | windsor | Alaska | 12345   | 1234567899 | Important message - We are now closed in your country of residence and no longer accepting new players, deposits, bets or game play. If you have a real money account, your balance is accessible to withdraw. |

