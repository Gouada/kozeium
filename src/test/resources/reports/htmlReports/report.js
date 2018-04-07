$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("travelinformation.feature");
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
      "name": "@tripPlaner"
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
formatter.step({
  "line": 32,
  "name": "I scroll down to later button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I scroll up to earlier button",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "I scroll back to later button",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I click later button",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I select a trip",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "I click mfe button",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "I click operation days",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "I click back button",
  "keyword": "Then "
});
formatter.examples({
  "line": 42,
  "name": "",
  "description": "",
  "id": "travelinformation;travelinfo;",
  "rows": [
    {
      "cells": [
        "start_station",
        "destination_station"
      ],
      "line": 43,
      "id": "travelinformation;travelinfo;;1"
    },
    {
      "cells": [
        "Mainz Hbf",
        "Leipzig Hbf"
      ],
      "line": 44,
      "id": "travelinformation;travelinfo;;2"
    },
    {
      "cells": [
        "Frankfurt(Main)Hbf",
        "Frankfurt(Main)Flugh"
      ],
      "line": 45,
      "id": "travelinformation;travelinfo;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 44,
  "name": "travelInfo",
  "description": "",
  "id": "travelinformation;travelinfo;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    },
    {
      "line": 23,
      "name": "@tripPlaner"
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
  "name": "I enter the start station Mainz Hbf",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I enter the destination station Leipzig Hbf",
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
formatter.step({
  "line": 32,
  "name": "I scroll down to later button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I scroll up to earlier button",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "I scroll back to later button",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I click later button",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I select a trip",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "I click mfe button",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "I click operation days",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "I click back button",
  "keyword": "Then "
});
formatter.match({
  "location": "TravelInformationSteps.navigator_app_is_startted()"
});
formatter.result({
  "duration": 19446715075,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mainz Hbf",
      "offset": 26
    }
  ],
  "location": "TravelInformationSteps.i_enter_the_start_station(String)"
});
formatter.result({
  "duration": 7706343892,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Leipzig Hbf",
      "offset": 32
    }
  ],
  "location": "TravelInformationSteps.i_enter_the_destination_station(String)"
});
formatter.result({
  "duration": 8262239417,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_day_picker()"
});
formatter.result({
  "duration": 2363012088,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_select_the_travel_date()"
});
formatter.result({
  "duration": 243897072,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_done_button()"
});
formatter.result({
  "duration": 1856699479,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_search_button()"
});
formatter.result({
  "duration": 786031014,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.scrollToLaterButton()"
});
formatter.result({
  "duration": 4722002973,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.scrollToEarlierButton()"
});
formatter.result({
  "duration": 1467833054,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.scrollBackToLaterButton()"
});
formatter.result({
  "duration": 3896674616,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.clickLaterButton()"
});
formatter.result({
  "duration": 206072733,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.selectAtrip()"
});
formatter.result({
  "duration": 2028693604,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.clickMfeButton()"
});
formatter.result({
  "duration": 1128065525,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.clickOperationDays()"
});
formatter.result({
  "duration": 4729328170,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.clickBackButton()"
});
formatter.result({
  "duration": 3174073081,
  "status": "passed"
});
formatter.after({
  "duration": 3130059499,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "travelInfo",
  "description": "",
  "id": "travelinformation;travelinfo;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    },
    {
      "line": 23,
      "name": "@tripPlaner"
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
  "name": "I enter the start station Frankfurt(Main)Hbf",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I enter the destination station Frankfurt(Main)Flugh",
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
formatter.step({
  "line": 32,
  "name": "I scroll down to later button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I scroll up to earlier button",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "I scroll back to later button",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I click later button",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I select a trip",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "I click mfe button",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "I click operation days",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "I click back button",
  "keyword": "Then "
});
formatter.match({
  "location": "TravelInformationSteps.navigator_app_is_startted()"
});
formatter.result({
  "duration": 15307011259,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Frankfurt(Main)Hbf",
      "offset": 26
    }
  ],
  "location": "TravelInformationSteps.i_enter_the_start_station(String)"
});
formatter.result({
  "duration": 7548650383,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Frankfurt(Main)Flugh",
      "offset": 32
    }
  ],
  "location": "TravelInformationSteps.i_enter_the_destination_station(String)"
});
formatter.result({
  "duration": 7899282342,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_day_picker()"
});
formatter.result({
  "duration": 1043030348,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_select_the_travel_date()"
});
formatter.result({
  "duration": 1253375121,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_done_button()"
});
formatter.result({
  "duration": 1828943949,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_search_button()"
});
formatter.result({
  "duration": 490130506,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.scrollToLaterButton()"
});
formatter.result({
  "duration": 3448545244,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.scrollToEarlierButton()"
});
formatter.result({
  "duration": 1393830626,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.scrollBackToLaterButton()"
});
formatter.result({
  "duration": 3491189278,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.clickLaterButton()"
});
formatter.result({
  "duration": 206334655,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.selectAtrip()"
});
formatter.result({
  "duration": 1504361331,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.clickMfeButton()"
});
formatter.result({
  "duration": 1147346766,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.clickOperationDays()"
});
formatter.result({
  "duration": 4686215715,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.clickBackButton()"
});
formatter.result({
  "duration": 3151892633,
  "status": "passed"
});
formatter.after({
  "duration": 2267035711,
  "status": "passed"
});
});