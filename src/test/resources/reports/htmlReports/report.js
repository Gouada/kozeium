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
  "duration": 19873418153,
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
  "duration": 128033012855,
  "error_message": "org.openqa.selenium.NoSuchSessionException: A session is either terminated or not started (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 122.06 seconds\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027BK7N00066974\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities [{appPackage\u003dde.hafas.android.db, deviceScreenSize\u003d1080x1920, networkConnectionEnabled\u003dtrue, warnings\u003d{}, databaseEnabled\u003dfalse, deviceName\u003demulator-5556, platform\u003dLINUX, deviceUDID\u003demulator-5556, appActivity\u003dde.hafas.main.HafasApp, desired\u003d{appPackage\u003dde.hafas.android.db, appActivity\u003dde.hafas.main.HafasApp, newCommandTimeout\u003d60.0, platformVersion\u003d7.0, browserName\u003dAndroid, platformName\u003dAndroid, udid\u003demulator-5556, deviceName\u003demulator-5556}, newCommandTimeout\u003d60.0, platformVersion\u003d7.0, webStorageEnabled\u003dfalse, locationContextEnabled\u003dfalse, takesScreenshot\u003dtrue, browserName\u003dAndroid, javascriptEnabled\u003dtrue, deviceModel\u003dAndroid SDK built for x86, platformName\u003dAndroid, udid\u003demulator-5556, deviceManufacturer\u003dGoogle}]\nSession ID: be48fa63-1a12-49d8-a87e-f6f7fc3277f7\n*** Element info: {Using\u003dxpath, value\u003d//android.widget.LinearLayout[@content-desc\u003d\u0027Mainz Hbf\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:40)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:410)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:56)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:509)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByXPath(DefaultGenericMobileDriver.java:134)\r\n\tat io.appium.java_client.AppiumDriver.findElementByXPath(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElementByXPath(AndroidDriver.java:1)\r\n\tat core.UIObjectWrapper.tap(UIObjectWrapper.java:187)\r\n\tat api.apps.navigator.tripPlaner.TripInformation.clickStationNameInList(TripInformation.java:55)\r\n\tat api.apps.navigator.testSteps.TravelInformationSteps.i_enter_the_start_station(TravelInformationSteps.java:145)\r\n\tat ✽.Then I enter the start station Mainz Hbf(travelinformation.feature:26)\r\n",
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
  "duration": 33327326,
  "error_message": "org.openqa.selenium.NoSuchSessionException: A session is either terminated or not started (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 24 milliseconds\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027BK7N00066974\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities [{appPackage\u003dde.hafas.android.db, deviceScreenSize\u003d1080x1920, networkConnectionEnabled\u003dtrue, warnings\u003d{}, databaseEnabled\u003dfalse, deviceName\u003demulator-5556, platform\u003dLINUX, deviceUDID\u003demulator-5556, appActivity\u003dde.hafas.main.HafasApp, desired\u003d{appPackage\u003dde.hafas.android.db, appActivity\u003dde.hafas.main.HafasApp, newCommandTimeout\u003d60.0, platformVersion\u003d7.0, browserName\u003dAndroid, platformName\u003dAndroid, udid\u003demulator-5556, deviceName\u003demulator-5556}, newCommandTimeout\u003d60.0, platformVersion\u003d7.0, webStorageEnabled\u003dfalse, locationContextEnabled\u003dfalse, takesScreenshot\u003dtrue, browserName\u003dAndroid, javascriptEnabled\u003dtrue, deviceModel\u003dAndroid SDK built for x86, platformName\u003dAndroid, udid\u003demulator-5556, deviceManufacturer\u003dGoogle}]\nSession ID: be48fa63-1a12-49d8-a87e-f6f7fc3277f7\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:40)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:235)\r\n\tat io.appium.java_client.AppiumDriver.closeApp(AppiumDriver.java:283)\r\n\tat core.manager.DriverManager.killDriver(DriverManager.java:262)\r\n\tat api.apps.navigator.testSteps.TravelInformationSteps.finishTest(TravelInformationSteps.java:261)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4TestSet.execute(JUnit4TestSet.java:53)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:123)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:104)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:164)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:110)\r\n\tat org.apache.maven.surefire.booter.SurefireStarter.invokeProvider(SurefireStarter.java:175)\r\n\tat org.apache.maven.surefire.booter.SurefireStarter.runSuitesInProcessWhenForked(SurefireStarter.java:107)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:68)\r\n",
  "status": "failed"
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
  "duration": 39110205559,
  "error_message": "java.lang.AssertionError: the app could not be started\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat api.apps.navigator.testSteps.TravelInformationSteps.navigator_app_is_startted(TravelInformationSteps.java:128)\r\n\tat ✽.Given navigator is started(travelinformation.feature:25)\r\n",
  "status": "failed"
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
  "status": "skipped"
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
  "duration": 19117027,
  "error_message": "org.openqa.selenium.NoSuchSessionException: A session is either terminated or not started (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 13 milliseconds\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027BK7N00066974\u0027, ip: \u0027192.168.56.1\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities [{appPackage\u003dde.hafas.android.db, deviceScreenSize\u003d1080x1920, networkConnectionEnabled\u003dtrue, warnings\u003d{}, databaseEnabled\u003dfalse, deviceName\u003demulator-5556, platform\u003dLINUX, deviceUDID\u003demulator-5556, appActivity\u003dde.hafas.main.HafasApp, desired\u003d{appPackage\u003dde.hafas.android.db, appActivity\u003dde.hafas.main.HafasApp, newCommandTimeout\u003d60.0, platformVersion\u003d7.0, browserName\u003dAndroid, platformName\u003dAndroid, udid\u003demulator-5556, deviceName\u003demulator-5556}, newCommandTimeout\u003d60.0, platformVersion\u003d7.0, webStorageEnabled\u003dfalse, locationContextEnabled\u003dfalse, takesScreenshot\u003dtrue, browserName\u003dAndroid, javascriptEnabled\u003dtrue, deviceModel\u003dAndroid SDK built for x86, platformName\u003dAndroid, udid\u003demulator-5556, deviceManufacturer\u003dGoogle}]\nSession ID: be48fa63-1a12-49d8-a87e-f6f7fc3277f7\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:40)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:235)\r\n\tat io.appium.java_client.AppiumDriver.closeApp(AppiumDriver.java:283)\r\n\tat core.manager.DriverManager.killDriver(DriverManager.java:262)\r\n\tat api.apps.navigator.testSteps.TravelInformationSteps.finishTest(TravelInformationSteps.java:261)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4TestSet.execute(JUnit4TestSet.java:53)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:123)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:104)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:164)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:110)\r\n\tat org.apache.maven.surefire.booter.SurefireStarter.invokeProvider(SurefireStarter.java:175)\r\n\tat org.apache.maven.surefire.booter.SurefireStarter.runSuitesInProcessWhenForked(SurefireStarter.java:107)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:68)\r\n",
  "status": "failed"
});
});