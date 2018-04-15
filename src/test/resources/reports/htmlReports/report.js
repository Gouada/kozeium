$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("navigatornavigation.feature");
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
  "name": "Navigator navigation",
  "description": "I want to use this template for my feature file",
  "id": "navigator-navigation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 25,
  "name": "navigation through navigator",
  "description": "",
  "id": "navigator-navigation;navigation-through-navigator",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@navigation"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "navigator is started for navigation",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 27,
      "value": "#Then I click information and booking"
    }
  ],
  "line": 28,
  "name": "I click favorite and history",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I click trip planer",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I click save fares",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "I click verbundtickets",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "I click regional offers",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I click my tickets",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click add ticket",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I click search order",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "I click departure arrival",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "I scroll to imprint",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "I click bahnCard",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "I scroll to regional offers",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "I click Karte",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "I scroll to favorite and history",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "I click real time information agin",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "I Scroll to delay alarm",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationSteps.navigator_app_is_started_for_navigation()"
});
formatter.result({
  "duration": 16199081624,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.clickFavoriteHistory()"
});
formatter.result({
  "duration": 2110612443,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.clickTripPlaner()"
});
formatter.result({
  "duration": 3565212536,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.clickSaveFares()"
});
formatter.result({
  "duration": 2969650057,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.clickVerbundTickets()"
});
formatter.result({
  "duration": 2883550509,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.clickRegionalOffers()"
});
formatter.result({
  "duration": 2629514086,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.clickMyTickets()"
});
formatter.result({
  "duration": 2746920544,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.clickAddTicket()"
});
formatter.result({
  "duration": 2951753824,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.clickSearchOrder()"
});
formatter.result({
  "duration": 2678159716,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.clickdepartureArrival()"
});
formatter.result({
  "duration": 2678507443,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.scrollToImprint()"
});
formatter.result({
  "duration": 2712211083,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.clickBahnCard()"
});
formatter.result({
  "duration": 270950645,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.scrollToRegionalOffers()"
});
formatter.result({
  "duration": 3407421320,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.clickKarte()"
});
formatter.result({
  "duration": 277439630,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.scrollToFavofiteHistory()"
});
formatter.result({
  "duration": 33918259970,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.clickRealTimeInfosAgain()"
});
formatter.result({
  "duration": 237966681,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.scrollToDelayAlarm()"
});
formatter.result({
  "duration": 2641622534,
  "status": "passed"
});
formatter.after({
  "duration": 2329266120,
  "status": "passed"
});
formatter.after({
  "duration": 174890,
  "error_message": "java.lang.NullPointerException\r\n\tat api.apps.navigator.testSteps.TravelInformationSteps.finishTest(TravelInformationSteps.java:258)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4TestSet.execute(JUnit4TestSet.java:53)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:123)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:104)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:164)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:110)\r\n\tat org.apache.maven.surefire.booter.SurefireStarter.invokeProvider(SurefireStarter.java:175)\r\n\tat org.apache.maven.surefire.booter.SurefireStarter.runSuitesInProcessWhenForked(SurefireStarter.java:107)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:68)\r\n",
  "status": "failed"
});
formatter.uri("travelinformation.feature");
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
  "location": "TravelInformationSteps.navigator_app_is_started()"
});
formatter.result({
  "duration": 13123250076,
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
  "duration": 7769207495,
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
  "duration": 8139022588,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_day_picker()"
});
formatter.result({
  "duration": 820862379,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_select_the_travel_date()"
});
formatter.result({
  "duration": 1237706399,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_done_button()"
});
formatter.result({
  "duration": 1698074570,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_search_button()"
});
formatter.result({
  "duration": 1577077945,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.scrollToLaterButton()"
});
formatter.result({
  "duration": 112261169,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.scrollToEarlierButton()"
});
formatter.result({
  "duration": 97918155,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.scrollBackToLaterButton()"
});
formatter.result({
  "duration": 81483443,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.clickLaterButton()"
});
formatter.result({
  "duration": 180357744,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.selectAtrip()"
});
formatter.result({
  "duration": 2899690043,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.clickMfeButton()"
});
formatter.result({
  "duration": 375808147,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.clickOperationDays()"
});
formatter.result({
  "duration": 4755612894,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.clickBackButton()"
});
formatter.result({
  "duration": 3232866550,
  "status": "passed"
});
formatter.after({
  "duration": 246324,
  "error_message": "java.lang.NullPointerException\r\n\tat api.apps.navigator.testSteps.NavigationSteps.finishTest(NavigationSteps.java:231)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4TestSet.execute(JUnit4TestSet.java:53)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:123)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:104)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:164)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:110)\r\n\tat org.apache.maven.surefire.booter.SurefireStarter.invokeProvider(SurefireStarter.java:175)\r\n\tat org.apache.maven.surefire.booter.SurefireStarter.runSuitesInProcessWhenForked(SurefireStarter.java:107)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:68)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 2110239673,
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
  "location": "TravelInformationSteps.navigator_app_is_started()"
});
formatter.result({
  "duration": 13283691324,
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
  "duration": 7584094884,
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
  "duration": 8009990065,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_day_picker()"
});
formatter.result({
  "duration": 1088610817,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_select_the_travel_date()"
});
formatter.result({
  "duration": 1132871066,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_done_button()"
});
formatter.result({
  "duration": 1696022284,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_search_button()"
});
formatter.result({
  "duration": 1597910354,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.scrollToLaterButton()"
});
formatter.result({
  "duration": 15035602384,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.scrollToEarlierButton()"
});
formatter.result({
  "duration": 1310744225,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.scrollBackToLaterButton()"
});
formatter.result({
  "duration": 3504938378,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.clickLaterButton()"
});
formatter.result({
  "duration": 200816152,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.selectAtrip()"
});
formatter.result({
  "duration": 2434326018,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.clickMfeButton()"
});
formatter.result({
  "duration": 393433423,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.clickOperationDays()"
});
formatter.result({
  "duration": 4731315532,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.clickBackButton()"
});
formatter.result({
  "duration": 3238021693,
  "status": "passed"
});
formatter.after({
  "duration": 128088,
  "error_message": "java.lang.NullPointerException\r\n\tat api.apps.navigator.testSteps.NavigationSteps.finishTest(NavigationSteps.java:231)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4TestSet.execute(JUnit4TestSet.java:53)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:123)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:104)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:164)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:110)\r\n\tat org.apache.maven.surefire.booter.SurefireStarter.invokeProvider(SurefireStarter.java:175)\r\n\tat org.apache.maven.surefire.booter.SurefireStarter.runSuitesInProcessWhenForked(SurefireStarter.java:107)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:68)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 2102909493,
  "status": "passed"
});
});