cucumber-jvm-williamhill
=====================

Prerequisites:
- Java JDK
- Maven
- Geckodriver and Chromedriver
- configure path of drivers manuall in getChromeDriver() and getFireFoxDriver() within BrowserInit

Start Tests:
If you want to Specify Browser simulation and browser
 mvn test -Dtarget=Desktop -Dbrowser=FireFox
 or
 mvn test -Dtarget=Desktop -Dbrowser=Chrome

 To specify which tests to run:

 mvn test -Dtarget=Desktop -Dbrowser=FireFox -Dcucumber.options="--tags @WhillES"
 or
 mvn test -Dtarget=Desktop -Dbrowser=FireFox -Dcucumber.options="--tags @WhillEnLogin"