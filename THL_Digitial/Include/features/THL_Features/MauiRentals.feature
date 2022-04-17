Feature: Maui motorhome booking search

  Scenario: Search for Maui Rentals Website in Google
    Given User navigates to Browser
    When User enter NZ Google Search
    And In Google search for Maui
    Then Maui rental website is displayed in results

  Scenario: New Zeland rental booking search
    Given User navigates to Maui Rentals homepage
    When User select destination as New Zealand
    And User Perform a rental booking search with Pickup location in Auckland
    And Drop of location in Christchurch with 2 Audults for New Zealand Drivers License
    Then User can view number of records
