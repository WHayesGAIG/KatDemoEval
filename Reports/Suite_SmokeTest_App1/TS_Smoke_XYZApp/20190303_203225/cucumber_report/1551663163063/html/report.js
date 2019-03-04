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
  "name": "User is on Registration Page",
  "keyword": "Given "
});
formatter.match({
  "location": "AllSteps.user_open_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Username",
  "keyword": "When "
});
formatter.match({
  "location": "AllSteps.user_enters_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters email Id",
  "keyword": "And "
});
formatter.match({
  "location": "AllSteps.user_enters_emailID()"
});
formatter.result({
  "status": "passed"
});
});