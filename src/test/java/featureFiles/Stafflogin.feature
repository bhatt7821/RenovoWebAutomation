#========================================================================================================================
#Author: Ajay Bhatt
#Created At: 01 April 2022
#========================================================================================================================
@Renovo
Feature: Verify the login functionality

  #========================================================================================================================
  Background: User is at Signin selection page
    Given Open Browser and navigate to application URL

  #========================================================================================================================
  #[Test_Case_001] Test Signin with valid credentials
  #========================================================================================================================
  #========================================================================================================================
  #Tags to executes
  #========================================================================================================================
  Scenario Outline: Verify Signin with Valid Credentials
    Given User is at login selection page
    When User clicks the staff login
    Then User enters the valid Email as "<EmailID>"
    Then User enter the valid password as "<Password>"
    Then User clicks Signin button
    Then User navigate to Home page

    Examples: 
      | EmailID                     | Password    |
      | archana_tomar@us.crawco.com | Crawford123 |
      
  #========================================================================================================================
  #[Test_Case_002] Test Signin with Invalid Password
  #========================================================================================================================
  Scenario Outline: Verify Signin with InValid Credentials
    Given User is at login selection page
    When User clicks the staff login
    Then User enters the valid Email as "<EmailID>"
    Then User enter the Invalid password as "<Wrong_Password>"
    Then User clicks Signin button
    #Then Verify validation message appears and user unables to signin

    Examples: 
      | EmailID                  | Password    | Wrong_Email | Wrong_Password |
      | ajay.bhatt@us.crawco.com | Laptop@7821 | aj@test.com |    ajgdsjg     |

  #========================================================================================================================
  #[Test_Case_003] Test Signin with Invalid EmailId
  #========================================================================================================================
  Scenario Outline: Verify Signin with InValid Credentials
    Given User is at login selection page
    When User clicks the staff login
    Then User enters the Invalid Email as "<Wrong_Email>"
    Then User enter the valid password as "<Password>"
    Then User clicks Signin button
    #Then Verify validation message appears and user unables to signin

    Examples: 
      | Wrong_Email                  | Password    |
      | ajay.bhatt@us.crawco.cosdvfe | Laptop@7821 |
      
  
