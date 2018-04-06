#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: calculator
  I want to use this template for my feature file

  @calculator
  Scenario Outline: addition
    Given I start the calculator
    When I click the first <operand1>
    Then I click an operator <operator>
    And I click the second <operand2>
    And I click equal

Examples:
	|	operand1 | operand2 | operator |
    |          7 |		  8 |   op_add |
    |          3 |        7 |   op_mul |
    |          3 |        3 |   op_sub |
    |          3 |        3 |   op_div |
    

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
