$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("calculator.feature");
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
  "name": "calculator",
  "description": "I want to use this template for my feature file",
  "id": "calculator",
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
  "name": "addition",
  "description": "",
  "id": "calculator;addition",
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
  "name": "I start the calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I click the first \u003coperand1\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I click an operator \u003coperator\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I click the second \u003coperand2\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I click equal",
  "keyword": "And "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": "calculator;addition;",
  "rows": [
    {
      "cells": [
        "operand1",
        "operand2",
        "operator"
      ],
      "line": 32,
      "id": "calculator;addition;;1"
    },
    {
      "cells": [
        "7",
        "8",
        "op_add"
      ],
      "line": 33,
      "id": "calculator;addition;;2"
    },
    {
      "cells": [
        "3",
        "7",
        "op_mul"
      ],
      "line": 34,
      "id": "calculator;addition;;3"
    },
    {
      "cells": [
        "3",
        "3",
        "op_sub"
      ],
      "line": 35,
      "id": "calculator;addition;;4"
    },
    {
      "cells": [
        "3",
        "3",
        "op_div"
      ],
      "line": 36,
      "id": "calculator;addition;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 33,
  "name": "addition",
  "description": "",
  "id": "calculator;addition;;2",
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
  "name": "I start the calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I click the first 7",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I click an operator op_add",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I click the second 8",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I click equal",
  "keyword": "And "
});
formatter.match({
  "location": "CalculatorSteps.i_start_the_calculator()"
});
formatter.result({
  "duration": 165201806,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 18
    }
  ],
  "location": "CalculatorSteps.i_click_the_first(int)"
});
formatter.result({
  "duration": 4134510,
  "error_message": "java.lang.NullPointerException\r\n\tat api.apps.myCalculator.steps.CalculatorSteps.i_click_the_first(CalculatorSteps.java:105)\r\n\tat ✽.When I click the first 7(calculator.feature:26)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "op_add",
      "offset": 20
    }
  ],
  "location": "CalculatorSteps.i_click_an_operator(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 19
    }
  ],
  "location": "CalculatorSteps.i_click_the_second(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CalculatorSteps.i_click_equal()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 150256,
  "error_message": "java.lang.NullPointerException\r\n\tat api.apps.myCalculator.steps.CalculatorSteps.finishTest(CalculatorSteps.java:161)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4TestSet.execute(JUnit4TestSet.java:53)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:123)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:104)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:164)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:110)\r\n\tat org.apache.maven.surefire.booter.SurefireStarter.invokeProvider(SurefireStarter.java:175)\r\n\tat org.apache.maven.surefire.booter.SurefireStarter.runSuitesInProcessWhenForked(SurefireStarter.java:107)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:68)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 34,
  "name": "addition",
  "description": "",
  "id": "calculator;addition;;3",
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
  "name": "I start the calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I click the first 3",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I click an operator op_mul",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I click the second 7",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I click equal",
  "keyword": "And "
});
formatter.match({
  "location": "CalculatorSteps.i_start_the_calculator()"
});
formatter.result({
  "duration": 34899853397,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 18
    }
  ],
  "location": "CalculatorSteps.i_click_the_first(int)"
});
formatter.result({
  "duration": 263710779,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "op_mul",
      "offset": 20
    }
  ],
  "location": "CalculatorSteps.i_click_an_operator(String)"
});
formatter.result({
  "duration": 635147068,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 19
    }
  ],
  "location": "CalculatorSteps.i_click_the_second(int)"
});
formatter.result({
  "duration": 686046574,
  "status": "passed"
});
formatter.match({
  "location": "CalculatorSteps.i_click_equal()"
});
formatter.result({
  "duration": 747921353,
  "status": "passed"
});
formatter.after({
  "duration": 2927916829,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "addition",
  "description": "",
  "id": "calculator;addition;;4",
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
  "name": "I start the calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I click the first 3",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I click an operator op_sub",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I click the second 3",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I click equal",
  "keyword": "And "
});
formatter.match({
  "location": "CalculatorSteps.i_start_the_calculator()"
});
formatter.result({
  "duration": 13457715391,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 18
    }
  ],
  "location": "CalculatorSteps.i_click_the_first(int)"
});
formatter.result({
  "duration": 190458811,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "op_sub",
      "offset": 20
    }
  ],
  "location": "CalculatorSteps.i_click_an_operator(String)"
});
formatter.result({
  "duration": 684762006,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 19
    }
  ],
  "location": "CalculatorSteps.i_click_the_second(int)"
});
formatter.result({
  "duration": 695510664,
  "status": "passed"
});
formatter.match({
  "location": "CalculatorSteps.i_click_equal()"
});
formatter.result({
  "duration": 766014502,
  "status": "passed"
});
formatter.after({
  "duration": 3170673431,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "addition",
  "description": "",
  "id": "calculator;addition;;5",
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
  "name": "I start the calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I click the first 3",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I click an operator op_div",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I click the second 3",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I click equal",
  "keyword": "And "
});
formatter.match({
  "location": "CalculatorSteps.i_start_the_calculator()"
});
formatter.result({
  "duration": 13807898223,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 18
    }
  ],
  "location": "CalculatorSteps.i_click_the_first(int)"
});
formatter.result({
  "duration": 181091607,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "op_div",
      "offset": 20
    }
  ],
  "location": "CalculatorSteps.i_click_an_operator(String)"
});
formatter.result({
  "duration": 661988333,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 19
    }
  ],
  "location": "CalculatorSteps.i_click_the_second(int)"
});
formatter.result({
  "duration": 650372213,
  "status": "passed"
});
formatter.match({
  "location": "CalculatorSteps.i_click_equal()"
});
formatter.result({
  "duration": 762653854,
  "status": "passed"
});
formatter.after({
  "duration": 2426296647,
  "status": "passed"
});
});