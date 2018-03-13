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
  "duration": 31576992443,
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
  "duration": 8614261650,
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
  "duration": 10428820453,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_day_picker()"
});
formatter.result({
  "duration": 1709383933,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_select_the_travel_date()"
});
formatter.result({
  "duration": 1354762374,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_done_button()"
});
formatter.result({
  "duration": 1012696492,
  "status": "passed"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_search_button()"
});
formatter.result({
  "duration": 1204763053,
  "status": "passed"
});
formatter.after({
  "duration": 4716148881,
  "status": "passed"
});
});3d{appPackage\u003dde.hafas.android.db, appActivity\u003dde.hafas.main.HafasApp, newCommandTimeout\u003d120.0, platformVersion\u003d4.1.2, browserName\u003dAndroid, platformName\u003dAndroid, udid\u003d479020b1201a903c, deviceName\u003d479020b1201a903c}, newCommandTimeout\u003d120.0, platformVersion\u003d4.1.2, webStorageEnabled\u003dfalse, locationContextEnabled\u003dfalse, takesScreenshot\u003dtrue, browserName\u003dAndroid, javascriptEnabled\u003dtrue, deviceModel\u003dGT-I8190, platformName\u003dAndroid, udid\u003d479020b1201a903c, deviceManufacturer\u003dsamsung}]\nSession ID: aab25a18-fb9e-47a0-8cf7-5e4deb72f002\n*** Element info: {Using\u003d-android uiautomator, value\u003d new UiSelector().resourceId(\"de.hafas.android.db:id/input_start\")}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:40)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:56)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElementByAndroidUIAutomator(AndroidDriver.java:365)\r\n\tat core.UIObjectWrapper.tap(UIObjectWrapper.java:169)\r\n\tat api.apps.navigator.tripPlaner.TripPlaner.clickStartStion(TripPlaner.java:30)\r\n\tat api.apps.navigator.testSteps.TravelInformationSteps.i_enter_the_start_station(TravelInformationSteps.java:82)\r\n\tat ✽.Then I enter the start station Berlin(travelinformation.feature:26)\r\n",
  "status": "failed"
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
  "status": "skipped"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_day_picker()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TravelInformationSteps.i_select_the_travel_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_done_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TravelInformationSteps.i_click_the_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 6279608554,
  "status": "passed"
});
});