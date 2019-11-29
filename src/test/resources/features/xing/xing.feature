#Author: gouada1@yahoo.fr
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
Feature: xing
I want to use this template for my feature file

  @xing
  Scenario Outline: travelInfo
    Given xing is started
    Then I click go to login
    Then I enter username <username>
    Then I enter password <password>

Examples:
	|	username	|	password |
	|	gouada		|	password |
