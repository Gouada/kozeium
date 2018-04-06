$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("travelinformation.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
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
  "name": "travelinformation",
  "description": "I want to use this template for my feature file",
  "id": "travelinformation",
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
  "id": "travelinformation;travelinfo",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@calculator"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "navigator is started",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I enter the start station \u003cstart_station\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I enter the destination station \u003cdestination_station\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I click the day picker",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I select the travel date",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I click the done button",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "I click the search button",
  "keyword": "And "
});
formatter.examples({
  "line": 33,
  "name": "",
  "description": "",
  "id": "travelinformation;travelinfo;",
  "rows": [
    {
      "cells": [
        "start_station",
        "destination_station"
      ],
      "line": 34,
      "id": "travelinformation;travelinfo;;1"
    },
    {
      "cells": [
        "Berlin",
        "Hamburg"
      ],
      "line": 35,
      "id": "travelinformation;travelinfo;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 35,
  "name": "travelInfo",
  "description": "",
  "id": "travelinformation;travelinfo;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@calculator"
    },
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "navigator is started",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I enter the start station Berlin",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I enter the destination station Hamburg",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I click the day picker",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I select the travel date",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I click the done button",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "I click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "TravelInformationSteps.navigator_app_is_startted()"
});
formatter.result({
  "duration": 16155580689,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Berlin",
      "offset": 26
    }
  ],
  "location": "TravelInformationSteps.i_enter_the_start_station(String)"
});
formatter.result({
  "duration": 8188326676,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hamburg",
      "offset": 32
    }
  ],
  "location": "TravelInformationSteps.i_enter_the_destination_station(String)"
});
formatter.result({
  "duration": 8144448049,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_day_picker()"
});
formatter.result({
  "duration": 1627262800,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_select_the_travel_date()"
});
formatter.result({
  "duration": 651083623,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_done_button()"
});
formatter.result({
  "duration": 1088131259,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_search_button()"
});
formatter.result({
  "duration": 1206954976,
  "status": "passed"
});
formatter.after({
  "duration": 3418817970,
  "status": "passed"
});
});