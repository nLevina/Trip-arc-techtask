Feature: Google.Search

  As a user of Google
  I want to find result of searching on a special resource
  So that I can get the necessary information

  Scenario Outline: Google.Search.Country
  As a user of Google
  I want to find result of searching a country on Wikipedia
  So that I can get the necessary information
    Given User opens the Google website
    When User enter "<country>" in the search bar and press Enter
    Then Verify that link to the Wikipedia page for "<country>" with the URL "<url>" is visible
    And User makes a screenshot
    Examples:
      | country  | url                                    |
      | Zanzibar | https://en.wikipedia.org/wiki/Zanzibar |
