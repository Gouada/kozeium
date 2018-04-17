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
  "duration": 25357758784,
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
  "duration": 245624472,
  "status": "passed"
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
  "duration": 685119180,
  "status": "passed"
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
  "duration": 740631903,
  "status": "passed"
});
formatter.match({
  "location": "CalculatorSteps.i_click_equal()"
});
formatter.result({
  "duration": 817393732,
  "status": "passed"
});
formatter.after({
  "duration": 6155896577,
  "status": "passed"
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
  "duration": 21758616400,
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
  "duration": 210005666,
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
  "duration": 792527362,
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
  "duration": 810042614,
  "status": "passed"
});
formatter.match({
  "location": "CalculatorSteps.i_click_equal()"
});
formatter.result({
  "duration": 929525170,
  "status": "passed"
});
formatter.after({
  "duration": 6354891166,
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
  "duration": 19279999754,
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
  "duration": 201207807,
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
  "duration": 681276120,
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
  "duration": 645688926,
  "status": "passed"
});
formatter.match({
  "location": "CalculatorSteps.i_click_equal()"
});
formatter.result({
  "duration": 767479535,
  "status": "passed"
});
formatter.after({
  "duration": 4810761058,
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
  "duration": 20068661067,
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
  "duration": 199868627,
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
  "duration": 675998637,
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
  "duration": 654593935,
  "status": "passed"
});
formatter.match({
  "location": "CalculatorSteps.i_click_equal()"
});
formatter.result({
  "duration": 759204703,
  "status": "passed"
});
formatter.after({
  "duration": 4781788884,
  "status": "passed"
});
});