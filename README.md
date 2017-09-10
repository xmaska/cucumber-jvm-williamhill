cucumber-jvm-williamhill
=====================

Prerequisites:
- Java JDK
- Maven
- Geckodriver and Chromedriver
- configure path of drivers manuall in getChromeDriver() and getFireFoxDriver() within BrowserInit

Demo Reports

Desktop View on FireFox running all test cases:

http://htmlpreview.github.io/?https://github.com/xmaska/cucumber-jvm-williamhill/blob/master/report-desktop-spanish-firefox/index.html

Mobile View on FireFox, running against English site
http://htmlpreview.github.io/?https://github.com/xmaska/cucumber-jvm-williamhill/blob/master/report-mobile-spanish-firefox/index.html

Starting Tests

If you want to Specify Browser simulation and browser
 mvn test -Dtarget=Desktop -Dbrowser=FireFox

 or

 mvn test -Dtarget=Desktop -Dbrowser=Chrome

 To specify which tests to run:

 mvn test -Dtarget=Desktop -Dbrowser=FireFox -Dcucumber.options="--tags @WhillES"

 or

 mvn test -Dtarget=Desktop -Dbrowser=FireFox -Dcucumber.options="--tags @WhillEnLogin"