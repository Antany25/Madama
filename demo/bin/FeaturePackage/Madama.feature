@tag
Feature: Maintenance
	Background: 
		Given User is on DOne Factory Login page "https://donefactory.d-one.app/madamaoliva/dev/d-oneportal/factory/"
  	When User zoom out the page
  	When User enters username as "factory" and password as "newPas1*"
  
  @OrderGeneration
  Scenario: Profile Page
    Given User click on the Schedule Icon
    When User click on the Scheduler Gannt Icon
    And User click on the New Order Icon
    And User click on the Material as "DEMIX029JSW"
    And User click on the Quantity as "75"
    And User click on the Due Date
    And User click on the Machine Group as Final
    And User click on the Confirm order
    Then User click on the Master Data Icon
    And User click on the Order Generation option "https://donefactory.d-one.app/madamaoliva/dev/d-oneportal/factory/order-generation?parent=Masterdata"
    And User click on the Generation tab
    And User click on the Due Date Generation
    And User click on the Add Filter
    And User click on the Material and EO
    And User click on the Material as "DEMIX029JSW" and EO as "MO1000000256"
    And User click on the Search Icon
    And User click on the Check box
    Then User click on the Generate Icon
    And User click on the Confirm Generate button
    Given User is on the Scheduler Gantt "https://donefactory.d-one.app/madamaoliva/dev/d-oneportal/factory/scheduler?parent=Schedule"
    Then User click on the Material as "DEMIX029JSW" and Order as "MO1000000256"
    And USer click on the Order Check Box
    And User click on the Schedule Order Icon
    And User click on the Schedule Forward the Entire Family
    And User click on the Confirm Order Icon