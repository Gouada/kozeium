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
Feature: travelinformation
I want to use this template for my feature file

  @calculator
  Scenario Outline: travelInfo
    Given navigator is started
    Then I enter the start station <start_station>
    Then I enter the destination station <destination_station>
    Then I click the day picker
    Then I select the travel date
    Then I click the done button
    And I click the search button

Examples:
	|	      start_station | destination_station |
    |                Berlin |		      Hamburg |
#	|                 Mainz |              Bremen |
#    |             Magdeburg |             Leipzig |
#    |               Dresden |           Stuttgart |    
