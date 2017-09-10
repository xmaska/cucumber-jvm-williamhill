$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/whillLoginEN.feature");
formatter.feature({
  "line": 1,
  "name": "Access WilliamHill English website",
  "description": "Use selenium java with cucumber-jvm and navigate to website",
  "id": "access-williamhill-english-website",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14423746857,
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
  "duration": 4132434760,
  "status": "passed"
});
formatter.match({
  "location": "TestFrame.takeScreenshot()"
});
formatter.write("Screenshot Taken to show this step!");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 764445039,
  "status": "passed"
});
formatter.match({
  "location": "WhillStepsEN.i_print_title_and_URL_of_whill()"
});
formatter.result({
  "duration": 298369915,
  "status": "passed"
});
formatter.match({
  "location": "WhillStepsEN.i_sign_intoWhillEn()"
});
formatter.result({
  "duration": 37933434117,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to no longer be visible: By.xpath: //div[@class\u003d\"modal__spinner\"] (tried for 30 second(s) with 500 MILLISECONDS interval)\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027vera-Latitude-E5500\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027i386\u0027, os.version: \u00274.4.0-93-generic\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{moz:profile\u003d/tmp/rust_mozprofile.R1pIGnARpcA4, rotatable\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, pageLoadStrategy\u003dnormal, platform\u003dLINUX, specificationLevel\u003d0, moz:accessibilityChecks\u003dfalse, acceptInsecureCerts\u003dtrue, browserVersion\u003d55.0.2, platformVersion\u003d4.4.0-93-generic, moz:processID\u003d15910, browserName\u003dfirefox, javascriptEnabled\u003dtrue, platformName\u003dLINUX}]\nSession ID: 80837064-4320-4f9e-a6fd-861e96345a85\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:80)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:232)\n\tat modules.WHSignInActionEn.Execute(WHSignInActionEn.java:31)\n\tat step_definitions.WhillStepsEN.i_sign_intoWhillEn(WhillStepsEN.java:60)\n\tat ✽.Then I sign in to Whill(features/whillLoginEN.feature:9)\n",
  "status": "failed"
});
formatter.write("Failed Case - Current Page URL is http://sports.williamhill.com/betting/en-gb");
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 9035064383,
  "status": "passed"
});
});