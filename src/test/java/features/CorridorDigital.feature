@Test1
Feature:Verify the season 1 page

  Scenario:Verify Sort By option Newest
    Given User is on the Season1 page of corridor digital
    When User selects Newest option in Sort By menu
    Then User should be able to sort the episodes from newest to oldest