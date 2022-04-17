Feature: Britz motorhome booking search

  Scenario: Search for Britzz Website in Google
    Given User navigates to Chrome Browser
    When User enter Google Search NZ
    And In Google search for Britz
    Then Britz website is displayed in results

  Scenario: New Zeland rental booking search
    Given User navigates to Britz homepage
    When User Select destination as New Zealand
    And User Perform Rental booking search with Pickup location in Auckland
    And Drop of Location in Christchurch with 2 Audults for New Zealand Drivers License
    Then User can view number of records for search
