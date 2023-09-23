Feature: Homepage feature
  some text here to describe the feature

  Scenario: Navigate to the website and accept cookies consent
    Given I navigate to the "https://www.google.com/" website
    When I see the cookies consent popup
    Then I click the "Accept" button on the popup
    And I should no longer see the cookies consent popup

  Scenario: Verify google search
    Given I am on the home page
    When I enter text "codebox" in input
    And I click on Google Search button
    Then I should see the results page