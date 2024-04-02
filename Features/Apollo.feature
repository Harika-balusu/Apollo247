Feature: Working with Apollo247 Consult Module 

  #Background: Login to Apollo247 
    #Given User is on login page
    #When User entered Phone number and OTP
    #Then User is successfully navigated to Apollo247
    
  Background: Consult module
    Given User clicks on consult module
    When User navigates to consult module
    Then User succesfully navigated
  
  Scenario: select location
    //Given User is on consult module
    When User selects a location
    Then Location is selected successfully
    
  Scenario: select doctor for visit doctor
  	//Given User is on consult module
    When User selects a location
    Then Location is selected successfully
    When User selects doctor
    When User proceeds to payment
    Then Appointment is booked successfully
    
  
   
  Scenario Outline: select doctor for Haematology 
    //Given I am on consult page
    When User select a Location
    Then Location is selected succesfully
    When User searches for Haematology doctor <specification>
    And User selects an Haematology doctor
    Then Appointment is booked successfully
  Examples:
  |specification|
  |"Haematology"| 
    
  Scenario: Search for Neurology
    When User select a Location
    Then Location is selected succesfully
    When User searches for Neurology doctor
    Then search is succesful
   
    
  Scenario: select Neurology doctor
    When User select a Location
    Then Location is selected succesfully
    When User searches for Neurology doctor
    Then search is succesful
    When User selects neuro doctor
    Then Appointment is booked successfully
   
  #Scenario: select Gastroenterology doctor 
    #When User select a Location
    #Then Location is selected succesfully
    #When User searches for Gastroenterology doctor
    #Then search is succesful
    #When User selects female doctor with 16+ years experience
    #Then Doctor not found 
    
@tag    
 Scenario:  select orthopedic
 Given scroll down to menu
 When User clicks on orthopedic
 And User applies required filters
 Then Doctor not found
    

  
  #Scenario Outline: User Login
    #Given User is on login page
    #When  User entered phone number as <mobile number>
    #And OTP entered
    #Then User successfully logged in
#
    #Examples: 
      #| mobile number | 
      #| 9959324696 |
