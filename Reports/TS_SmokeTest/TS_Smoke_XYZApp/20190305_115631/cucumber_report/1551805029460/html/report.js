$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/whayes/Desktop/WHLocal/KatalonLocalProjects/DemoForEval/./Include/features/WH_BDD_Demo/RegisterUser.feature");
formatter.feature({
  "name": "Register a new user",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Register with mandatory data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Open Demo Site",
  "keyword": "Given "
});
formatter.match({
  "location": "AllSteps.user_open_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Make Appoint Link",
  "keyword": "When "
});
formatter.match({
  "location": "AllSteps.User_click_on_Make_Appoint_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid LoginID",
  "keyword": "And "
});
formatter.match({
  "location": "AllSteps.User_enter_valid_LoginID()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid password",
  "keyword": "And "
});
formatter.match({
  "location": "AllSteps.User_enter_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "AllSteps.User_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
});