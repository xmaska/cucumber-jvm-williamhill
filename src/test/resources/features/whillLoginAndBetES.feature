Feature: Access WilliamHill Spanish website
  Use selenium java with cucumber-jvm and navigate to website

  @WhillES
  Scenario Outline: Opening Spanish website, place random football bet
    Given I open WilliamHill website in Spanish
    When I validate title and URL of WilliamHill Spanish site
    And I take a screenshot
    And I sign in to WilliamHill Spanish site
    And I go to <sport> page
    And I take a screenshot
    And I place bet on random selection with stake value <stakeValue>
    Then I validate bet placement <isSuccessful>

    Examples:
      | sport    | stakeValue | isSuccessful |
      | Football | 2          | false         |
      | Tennis   | 1.05       | false         |
