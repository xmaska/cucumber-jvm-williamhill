Feature: Access WilliamHill English website
  Use selenium java with cucumber-jvm and navigate to website

  @WhillEnLogin
  Scenario: Opening English website, checking title and url and login
    Given I open whill website
    When I take a screenshot
    And I validate title and URL of whill site
    Then I sign in to Whill