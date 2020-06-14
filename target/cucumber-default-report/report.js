$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/HRMSB6_210.feature");
formatter.feature({
  "name": "Admin user should be able to",
  "description": "  create an employee and login credentials for an employee",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint210,"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logged in into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_210.user_logged_in_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to add employee page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_210.user_navigate_to_add_employee_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create new Employee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint210,"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enters employees first name and last name",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_210.user_enters_employees_first_name_and_last_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_210.user_clicks_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee is added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_210.employee_is_added_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Create new Employee");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logged in into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_210.user_logged_in_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to add employee page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_210.user_navigate_to_add_employee_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Employee without employee id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint210,"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enters employees first name and last name",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_210.user_enters_employees_first_name_and_last_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user deletes employee id",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_210.user_deletes_employee_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_210.user_clicks_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee is added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_210.employee_is_added_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "Add Employee without employee id");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logged in into HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_210.user_logged_in_into_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to add employee page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_210.user_navigate_to_add_employee_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "AddEmployee and create Login Credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint210,"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enters employees first name and last name",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_210.user_enters_employees_first_name_and_last_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on create login checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_210.user_clicks_on_create_login_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters  login credentials",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_210.user_enters_login_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_210.user_clicks_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "employee is added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.HRMSB6_210.employee_is_added_successfully()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@id\u003d\u0027profile-pic\u0027]/h1\"}\n  (Session info: chrome\u003d83.0.4103.97)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-H3GIJ8P\u0027, ip: \u002710.237.153.229\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.97, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\reyha\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:52948}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 92b6f5abb2406dc8903b07ec58865a49\n*** Element info: {Using\u003dxpath, value\u003d//div[@id\u003d\u0027profile-pic\u0027]/h1}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.isDisplayed(Unknown Source)\r\n\tat com.hrms.steps.HRMSB6_210.employee_is_added_successfully(HRMSB6_210.java:38)\r\n\tat ✽.employee is added successfully(file:///C:/Users/reyha/eclipse-workspace/HrmsCucumberFramework/src/test/resources/features/HRMSB6_210.feature:28)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded2.png", "AddEmployee and create Login Credentials");
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/InvalidCredentials.feature");
formatter.feature({
  "name": "Invalid Credentials",
  "description": "  User should see error message when login \n  with invalid credentials",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigated to HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.InvalidCredentialsSteps.user_navigated_to_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.InvalidCredentialsSteps.user_enters_valid_username_and_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.InvalidCredentialsSteps.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see \"Invalid credentials\" error message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.InvalidCredentialsSteps.user_see_error_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", "Login with valid username and invalid password");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login without username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigated to HRMS",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.InvalidCredentialsSteps.user_navigated_to_HRMS()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters empty username and valid password",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.InvalidCredentialsSteps.user_enters_empty_username_and_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.InvalidCredentialsSteps.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see \"Username cannot be empty\" error message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.InvalidCredentialsSteps.user_see_error_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", "Login without username and valid password");
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/loginWithDifferentRoles.feature");
formatter.feature({
  "name": "Login With Different Roles",
  "description": "  User with different roles should be able to login \n  into HRMS application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "Login as an Admin using valid admin credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters admin username and admin password",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.loginWithDifferentRoles.user_enters_admin_username_and_admin_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.InvalidCredentialsSteps.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see Welcome Admin message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.loginWithDifferentRoles.user_see_Welcome_Admin_message()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png", "Login as an Admin using valid admin credentials");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as an ESS using valid ess credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters ESS username and ESS password",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.loginWithDifferentRoles.user_enters_ESS_username_and_ESS_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.InvalidCredentialsSteps.user_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see Welcome ESS message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.loginWithDifferentRoles.user_see_Welcome_ESS_message()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#welcome\"}\n  (Session info: chrome\u003d83.0.4103.97)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-H3GIJ8P\u0027, ip: \u002710.237.153.229\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.97, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\reyha\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:53074}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: a773cef8bb9d7da91ed2219870bb48ff\n*** Element info: {Using\u003did, value\u003dwelcome}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.getText(Unknown Source)\r\n\tat com.hrms.steps.loginWithDifferentRoles.user_see_Welcome_ESS_message(loginWithDifferentRoles.java:36)\r\n\tat ✽.user see Welcome ESS message(file:///C:/Users/reyha/eclipse-workspace/HrmsCucumberFramework/src/test/resources/features/loginWithDifferentRoles.feature:18)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded6.png", "Login as an ESS using valid ess credentials");
formatter.after({
  "status": "passed"
});
});