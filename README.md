cucumber-jvm-williamhill
=====================

Prerequisites:
- Java JDK 1.8
- Maven 3.3.9
- Geckodriver and Chromedriver (appropriate for the execution environment)
- configure path of drivers manual in getChromeDriver() and getFireFoxDriver() within BrowserInit

Demo Reports

<a href="http://htmlpreview.github.io/?https://github.com/xmaska/cucumber-jvm-williamhill/blob/master/report-desktop-spanish-firefox/index.html">Desktop View on FireFox running all test cases</a>

Please note that the test user on Spanish site does not have funds. However the assertion is parameterized, therefore the error message showing betslip error gets accepted.
The second feature is running a login test againts the English site, but it returns javascript errors in console and breaks the main functionality. I tried to run the test from Spanish and Gibraltarian IP addresses, without success.
   
<a href="http://htmlpreview.github.io/?https://github.com/xmaska/cucumber-jvm-williamhill/blob/master/report-mobile-spanish-firefox/index.html">Mobile View on FireFox, running against English site</a>


**Starting Tests**

If you want to Specify Browser simulation and browser

`mvn test -Dtarget=Desktop -Dbrowser=FireFox`

`mvn test -Dtarget=Desktop -Dbrowser=Chrome`

**To specify which tests to run**

`mvn test -Dtarget=Desktop -Dbrowser=FireFox -Dcucumber.options="--tags @WhillES"`


`mvn test -Dtarget=Desktop -Dbrowser=FireFox -Dcucumber.options="--tags @WhillEnLogin"`