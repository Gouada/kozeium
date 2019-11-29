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
  "comments": [
    {
      "line": 34,
      "value": "#Then I click add ticket"
    },
    {
      "line": 35,
      "value": "#Then I click search order"
    }
  ],
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
  "comments": [
    {
      "line": 42,
      "value": "#Then I click real time information agin"
    }
  ],
  "line": 43,
  "name": "I scroll to is my train on time",
  "keyword": "Then "
});
formatter.match({
  "location": "NavigationSteps.navigator_app_is_started_for_navigation()"
});
formatter.result({
  "duration": 16883675975,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.clickFavoriteHistory()"
});
formatter.result({
  "duration": 9825271,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.clickTripPlaner()"
});
formatter.result({
  "duration": 12440452,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.clickSaveFares()"
});
formatter.result({
  "duration": 15399809,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.clickVerbundTickets()"
});
formatter.result({
  "duration": 5654182,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.clickRegionalOffers()"
});
formatter.result({
  "duration": 5090982,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.clickMyTickets()"
});
formatter.result({
  "duration": 5220119,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.clickdepartureArrival()"
});
formatter.result({
  "duration": 9461752,
  "status": "passed"
});
formatter.match({
  "location": "NavigationSteps.scrollToImprint()"
});
formatter.result({
  "duration": 11139404,
  "error_message": "java.lang.NullPointerException\r\n\tat core.UIObjectWrapper.isElementEmpty(UIObjectWrapper.java:72)\r\n\tat api.apps.navigator.navigation.Navigation.scrollToElement(Navigation.java:30)\r\n\tat api.apps.navigator.testSteps.NavigationSteps.scrollToImprint(NavigationSteps.java:201)\r\n\tat ✽.Then I scroll to imprint(navigatornavigation.feature:37)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "NavigationSteps.clickBahnCard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigationSteps.scrollToRegionalOffers()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigationSteps.clickKarte()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigationSteps.scrollToFavofiteHistory()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NavigationSteps.scrollToIsMyTrainOnTime()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2179411,
  "status": "passed"
});
formatter.after({
  "duration": 182613,
  "error_message": "java.lang.NullPointerException\r\n\tat api.apps.navigator.testSteps.TravelInformationSteps.finishTest(TravelInformationSteps.java:271)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:252)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:141)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:112)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:189)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:165)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory.invokeProvider(ProviderFactory.java:85)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:115)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:75)\r\n",
  "status": "failed"
});
});(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:252)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:141)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:112)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:189)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:165)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory.invokeProvider(ProviderFactory.java:85)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:115)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:75)\r\n",
  "status": "failed"
});
});