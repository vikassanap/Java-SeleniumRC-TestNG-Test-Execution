# Java SeleniumRC TestNG Test Execution
- This project demonstrates how to execute application UI test cases on Selenium RC

## Selenium RC
1. Download `Selenium server standalone.jar`.
2. Execute the following command: `java -jar selenium-server-standalone-2.41.0.jar`

## Sample Selenium RC code
```java
selenium = new DefaultSelenium("localhost", 4444, "*chrome",
    "http://test-app:5000");
selenium.start();
selenium.open("/");
selenium.deleteAllVisibleCookies();
selenium.windowMaximize();
System.out.println("Selenium Remote control has been started ...");
```
## Get Started
1. Clone this repo
2. Execute test cases: `mvn test`

## Author
[Vikas Sanap](https://www.linkedin.com/in/vikassanap/)
