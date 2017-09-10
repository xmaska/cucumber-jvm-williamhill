$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/whillLoginAndBetES.feature");
formatter.feature({
  "line": 1,
  "name": "Access WilliamHill Spanish website",
  "description": "Use selenium java with cucumber-jvm and navigate to website",
  "id": "access-williamhill-spanish-website",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Opening Spanish website, place random football bet",
  "description": "",
  "id": "access-williamhill-spanish-website;opening-spanish-website,-place-random-football-bet",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@WhillES"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I open WilliamHill website in Spanish",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I validate title and URL of WilliamHill Spanish site",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I take a screenshot",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I sign in to WilliamHill Spanish site",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I go to \u003csport\u003e page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I take a screenshot",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I place bet on random selection with stake value \u003cstakeValue\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I validate bet placement \u003cisSuccessful\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "access-williamhill-spanish-website;opening-spanish-website,-place-random-football-bet;",
  "rows": [
    {
      "cells": [
        "sport",
        "stakeValue",
        "isSuccessful"
      ],
      "line": 16,
      "id": "access-williamhill-spanish-website;opening-spanish-website,-place-random-football-bet;;1"
    },
    {
      "cells": [
        "Football",
        "2",
        "false"
      ],
      "line": 17,
      "id": "access-williamhill-spanish-website;opening-spanish-website,-place-random-football-bet;;2"
    },
    {
      "cells": [
        "Tennis",
        "1.05",
        "false"
      ],
      "line": 18,
      "id": "access-williamhill-spanish-website;opening-spanish-website,-place-random-football-bet;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 26814259769,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Opening Spanish website, place random football bet",
  "description": "",
  "id": "access-williamhill-spanish-website;opening-spanish-website,-place-random-football-bet;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@WhillES"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I open WilliamHill website in Spanish",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I validate title and URL of WilliamHill Spanish site",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I take a screenshot",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I sign in to WilliamHill Spanish site",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I go to Football page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I take a screenshot",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I place bet on random selection with stake value 2",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I validate bet placement false",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "WhillStepsES.i_open_WilliamHill_website_in_Spanish()"
});
formatter.result({
  "duration": 11285633190,
  "status": "passed"
});
formatter.match({
  "location": "WhillStepsES.i_validate_title_and_URL_of_WilliamHill_Spanish_site()"
});
formatter.result({
  "duration": 137389897,
  "status": "passed"
});
formatter.match({
  "location": "TestFrame.takeScreenshot()"
});
formatter.write("Screenshot Taken to show this step!");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 1177963602,
  "status": "passed"
});
formatter.match({
  "location": "WhillStepsES.i_sign_in_to_WilliamHill_Spanish_site()"
});
formatter.result({
  "duration": 15051665502,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Football",
      "offset": 8
    }
  ],
  "location": "WhillStepsES.I_go_to_given_sport_page(String)"
});
formatter.result({
  "duration": 3049567475,
  "status": "passed"
});
formatter.match({
  "location": "TestFrame.takeScreenshot()"
});
formatter.write("Screenshot Taken to show this step!");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "duration": 814002084,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 49
    }
  ],
  "location": "WhillStepsES.I_place_bet_on_random_selection_with_stake_value(double)"
});
formatter.result({
  "duration": 9252673366,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "false",
      "offset": 25
    }
  ],
  "location": "WhillStepsES.I_validate_bet_placement(String)"
});
formatter.result({
  "duration": 1724799794,
  "status": "passed"
});
formatter.write("Passed test scenario");
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 12709712459,
  "status": "passed"
});
formatter.before({
  "duration": 34983064462,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Opening Spanish website, place random football bet",
  "description": "",
  "id": "access-williamhill-spanish-website;opening-spanish-website,-place-random-football-bet;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@WhillES"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I open WilliamHill website in Spanish",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I validate title and URL of WilliamHill Spanish site",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I take a screenshot",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I sign in to WilliamHill Spanish site",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I go to Tennis page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I take a screenshot",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I place bet on random selection with stake value 1.05",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I validate bet placement false",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "WhillStepsES.i_open_WilliamHill_website_in_Spanish()"
});
formatter.result({
  "duration": 6564709017,
  "status": "passed"
});
formatter.match({
  "location": "WhillStepsES.i_validate_title_and_URL_of_WilliamHill_Spanish_site()"
});
formatter.result({
  "duration": 167010137,
  "status": "passed"
});
formatter.match({
  "location": "TestFrame.takeScreenshot()"
});
formatter.write("Screenshot Taken to show this step!");
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "duration": 720571974,
  "status": "passed"
});
formatter.match({
  "location": "WhillStepsES.i_sign_in_to_WilliamHill_Spanish_site()"
});
formatter.result({
  "duration": 8709920855,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tennis",
      "offset": 8
    }
  ],
  "location": "WhillStepsES.I_go_to_given_sport_page(String)"
});
formatter.result({
  "duration": 3796598867,
  "status": "passed"
});
formatter.match({
  "location": "TestFrame.takeScreenshot()"
});
formatter.write("Screenshot Taken to show this step!");
formatter.embedding("image/png", "embedded4.png");
formatter.result({
  "duration": 607859934,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1.05",
      "offset": 49
    }
  ],
  "location": "WhillStepsES.I_place_bet_on_random_selection_with_stake_value(double)"
});
formatter.result({
  "duration": 5586619128,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "false",
      "offset": 25
    }
  ],
  "location": "WhillStepsES.I_validate_bet_placement(String)"
});
formatter.result({
  "duration": 722728060,
  "status": "passed"
});
formatter.write("Passed test scenario");
formatter.embedding("image/png", "embedded5.png");
formatter.after({
  "duration": 2411453377,
  "status": "passed"
});
formatter.uri("features/whillLoginEN.feature");
formatter.feature({
  "line": 1,
  "name": "Access WilliamHill English website",
  "description": "Use selenium java with cucumber-jvm and navigate to website",
  "id": "access-williamhill-english-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9207866793,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Opening English website, checking title and url and login",
  "description": "",
  "id": "access-williamhill-english-website;opening-english-website,-checking-title-and-url-and-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@WhillEnLogin"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I open whill website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I take a screenshot",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I validate title and URL of whill site",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I sign in to Whill",
  "keyword": "Then "
});
formatter.match({
  "location": "WhillStepsEN.i_open_whill_website()"
});
formatter.result({
  "duration": 3301405718,
  "status": "passed"
});
formatter.match({
  "location": "TestFrame.takeScreenshot()"
});
formatter.write("Screenshot Taken to show this step!");
formatter.embedding("image/png", "embedded6.png");
formatter.result({
  "duration": 420735831,
  "status": "passed"
});
formatter.match({
  "location": "WhillStepsEN.i_print_title_and_URL_of_whill()"
});
formatter.result({
  "duration": 1041163407,
  "status": "passed"
});
formatter.match({
  "location": "WhillStepsEN.i_sign_intoWhillEn()"
});
formatter.result({
  "duration": 38663893800,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to no longer be visible: By.xpath: //div[@class\u003d\"modal__spinner\"] (tried for 30 second(s) with 500 MILLISECONDS interval)\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027vera-Latitude-E5500\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027i386\u0027, os.version: \u00274.4.0-93-generic\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{moz:profile\u003d/tmp/rust_mozprofile.EhO1u5nM4nbq, rotatable\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, pageLoadStrategy\u003dnormal, platform\u003dLINUX, specificationLevel\u003d0, moz:accessibilityChecks\u003dfalse, acceptInsecureCerts\u003dtrue, browserVersion\u003d55.0.2, platformVersion\u003d4.4.0-93-generic, moz:processID\u003d15446, browserName\u003dfirefox, javascriptEnabled\u003dtrue, platformName\u003dLINUX}]\nSession ID: 639b643e-cf1d-4417-90f6-3c280446ddb9\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:232)\n\tat modules.WHSignInActionEn.Execute(WHSignInActionEn.java:31)\n\tat step_definitions.WhillStepsEN.i_sign_intoWhillEn(WhillStepsEN.java:60)\n\tat ✽.Then I sign in to Whill(features/whillLoginEN.feature:9)\n",
  "status": "failed"
});
formatter.write("Failed Case - Current Page URL is http://sports.williamhill.com/betting/en-gb");
formatter.embedding("image/png", "embedded7.png");
formatter.after({
  "duration": 942613625,
  "status": "passed"
});
});