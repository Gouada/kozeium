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
Feature: Navigator navigation
I want to use this template for my feature file


  @navigation
   Scenario: navigation through navigator
    Given navigator is started for navigation
    #Then I click information and booking
    Then I click favorite and history
    Then I click trip planer
    Then I click save fares
    Then I click verbundtickets
    And I click regional offers
    And I click my tickets
    Then I click add ticket
    Then I click search order
    Then I click departure arrival
    Then I scroll to imprint
    Then I click bahnCard
    Then I scroll to regional offers
    Then I click Karte
    Then I scroll to favorite and history
    Then I click real time information agin
    Then I Scroll to delay alarm