$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("xing.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: gouada1@yahoo.fr"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "xing",
  "description": "I want to use this template for my feature file",
  "id": "xing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 24,
  "name": "travelInfo",
  "description": "",
  "id": "xing;travelinfo",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@xing"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "xing is started",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I click go to login",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I enter username \u003cusername\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I enter password \u003cpassword\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "xing;travelinfo;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 31,
      "id": "xing;travelinfo;;1"
    },
    {
      "cells": [
        "gouada",
        "password"
      ],
      "line": 32,
      "id": "xing;travelinfo;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 32,
  "name": "travelInfo",
  "description": "",
  "id": "xing;travelinfo;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    },
    {
      "line": 23,
      "name": "@xing"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "xing is started",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I click go to login",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I enter username gouada",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I enter password password",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.startXingApp()"
});
formatter.result({
  "duration": 28259976039,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.go_to_login_activity()"
});
formatter.result({
  "duration": 3291600581,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " gouada",
      "offset": 16
    }
  ],
  "location": "LoginSteps.type_username(String)"
});
formatter.result({
  "duration": 5862267409,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " password",
      "offset": 16
    }
  ],
  "location": "LoginSteps.type_password(String)"
});
formatter.result({
  "duration": 610916298,
  "status": "passed"
});
});