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
Feature: travelinformation
I want to use this template for my feature file

  @tripPlaner
  Scenario Outline: travelInfo
    Given navigator is started
    Then I enter the start station <start_station>
    Then I enter the destination station <destination_station>
    Then I click the day picker
    Then I select the travel date
    Then I click the done button
    And I click the search button
    And I scroll down to later button
    Then I scroll up to earlier button
    Then I scroll back to later button
    And I click later button
    Then I select a trip
    Then I click mfe button
    Then I click operation days
    Then I click back button
    

Examples:
	|	      start_station | destination_station |
	|                Mainz Hbf |		      Leipzig Hbf |
	|                Frankfurt(Main)Hbf |		      Frankfurt(Main)Flugh |
#	|                 Mainz Hbf|              Bremen |
#    |             Magdeburg |             Leipzig |
#    |               Dresden |           Stuttgart |    
