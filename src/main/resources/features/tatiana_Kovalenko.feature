@UItest
Feature: tatiana_Kovalenko
  @Test
  Scenario: Check changing language
    Given User has opened main page
    When User clicks select a region and a language button
    And choose Ukraine
    Then User see ukrainian main page
  @Test
  Scenario: Check learn more button
    Given User has opened main page
    When User clicks learn more button
    Then learn more page opens
  @Test
  Scenario: Check contact us button
    Given User has opened main page
    When User clicks contact us button
    Then contact us page opens
  @Test
  Scenario: Chek find your dream job button
    Given User has opened main page
    When User clicks find your dream job button
    Then find your dream job page opens
  @Test
  Scenario: Check mexico button
    Given User has opened main page
    When User clicks mexico button
    Then User sees mexico locations under blockchain our offices
  @Test
  Scenario: Check telescopeai button
    Given User has opened main page
    When User clicks telescopeai button
    Then telescopeai page opens
  @Test
  Scenario: Check searches blockchain
    Given User has opened main page
    Then User clicks search button
    And User writes something in search blockchain
    And User clicks find button
    Then User sees result
  @Test
  Scenario: Check insights button in menu blockchain
    Given User has opened main page
    Then User clicks menu button
    And User clicks insights button in menu blockchain
    Then insights page opens
