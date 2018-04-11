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
  "duration": 31958344538,
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
  "duration": 36896992371,
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters. (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 30.20 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027BK7N00066974\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities [{appPackage\u003dde.hafas.android.db, deviceScreenSize\u003d1080x1920, networkConnectionEnabled\u003dtrue, warnings\u003d{}, databaseEnabled\u003dfalse, deviceName\u003demulator-5554, platform\u003dLINUX, deviceUDID\u003demulator-5554, appActivity\u003dde.hafas.main.HafasApp, desired\u003d{appPackage\u003dde.hafas.android.db, appActivity\u003dde.hafas.main.HafasApp, newCommandTimeout\u003d60.0, platformVersion\u003d7.0, browserName\u003dAndroid, platformName\u003dAndroid, udid\u003demulator-5554, deviceName\u003demulator-5554}, newCommandTimeout\u003d60.0, platformVersion\u003d7.0, webStorageEnabled\u003dfalse, locationContextEnabled\u003dfalse, takesScreenshot\u003dtrue, browserName\u003dAndroid, javascriptEnabled\u003dtrue, deviceModel\u003dAndroid SDK built for x86, platformName\u003dAndroid, udid\u003demulator-5554, deviceManufacturer\u003dGoogle}]\nSession ID: d802d09d-2f11-4433-82ed-9c3e30fdfef2\n*** Element info: {Using\u003dxpath, value\u003d//android.widget.LinearLayout[@content-desc\u003d\u0027Mainz Hbf\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:40)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:56)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:509)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByXPath(DefaultGenericMobileDriver.java:134)\r\n\tat io.appium.java_client.AppiumDriver.findElementByXPath(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElementByXPath(AndroidDriver.java:1)\r\n\tat core.UIObjectWrapper.tap(UIObjectWrapper.java:189)\r\n\tat api.apps.navigator.tripPlaner.TripInformation.clickStationNameInList(TripInformation.java:55)\r\n\tat api.apps.navigator.testSteps.TravelInformationSteps.i_enter_the_start_station(TravelInformationSteps.java:89)\r\n\tat ✽.Then I enter the start station Mainz Hbf(travelinformation.feature:26)\r\n",
  "status": "failed"
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
formatter.match({
  "location": "TravelInformationSteps.scrollToLaterButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TravelInformationSteps.scrollToEarlierButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TravelInformationSteps.scrollBackToLaterButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TravelInformationSteps.clickLaterButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TravelInformationSteps.selectAtrip()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TravelInformationSteps.clickMfeButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TravelInformationSteps.clickOperationDays()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TravelInformationSteps.clickBackButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 7763457273,
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
  "duration": 28189908282,
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
  "duration": 37122726913,
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters. (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 30.81 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027BK7N00066974\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities [{appPackage\u003dde.hafas.android.db, deviceScreenSize\u003d1080x1920, networkConnectionEnabled\u003dtrue, warnings\u003d{}, databaseEnabled\u003dfalse, deviceName\u003demulator-5554, platform\u003dLINUX, deviceUDID\u003demulator-5554, appActivity\u003dde.hafas.main.HafasApp, desired\u003d{appPackage\u003dde.hafas.android.db, appActivity\u003dde.hafas.main.HafasApp, newCommandTimeout\u003d60.0, platformVersion\u003d7.0, browserName\u003dAndroid, platformName\u003dAndroid, udid\u003demulator-5554, deviceName\u003demulator-5554}, newCommandTimeout\u003d60.0, platformVersion\u003d7.0, webStorageEnabled\u003dfalse, locationContextEnabled\u003dfalse, takesScreenshot\u003dtrue, browserName\u003dAndroid, javascriptEnabled\u003dtrue, deviceModel\u003dAndroid SDK built for x86, platformName\u003dAndroid, udid\u003demulator-5554, deviceManufacturer\u003dGoogle}]\nSession ID: 850e7f64-fe7e-4cd3-947f-b252d1be4472\n*** Element info: {Using\u003dxpath, value\u003d//android.widget.LinearLayout[@content-desc\u003d\u0027Frankfurt(Main)Hbf\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:40)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:56)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:509)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByXPath(DefaultGenericMobileDriver.java:134)\r\n\tat io.appium.java_client.AppiumDriver.findElementByXPath(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElementByXPath(AndroidDriver.java:1)\r\n\tat core.UIObjectWrapper.tap(UIObjectWrapper.java:189)\r\n\tat api.apps.navigator.tripPlaner.TripInformation.clickStationNameInList(TripInformation.java:55)\r\n\tat api.apps.navigator.testSteps.TravelInformationSteps.i_enter_the_start_station(TravelInformationSteps.java:89)\r\n\tat ✽.Then I enter the start station Frankfurt(Main)Hbf(travelinformation.feature:26)\r\n",
  "status": "failed"
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
formatter.match({
  "location": "TravelInformationSteps.scrollToLaterButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TravelInformationSteps.scrollToEarlierButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TravelInformationSteps.scrollBackToLaterButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TravelInformationSteps.clickLaterButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TravelInformationSteps.selectAtrip()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TravelInformationSteps.clickMfeButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TravelInformationSteps.clickOperationDays()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TravelInformationSteps.clickBackButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 4796196711,
  "status": "passed"
});
});