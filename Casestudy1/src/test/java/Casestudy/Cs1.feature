Feature: TestMe
  @tag1
  Scenario: New Registration
    Given I want to click on Signup button
    When Enter the User Name
    And Enter the first name "Priya" and last name "Moorthy"
    Then Enter the password "123456" and confirm password "123456"
    And Select the gender "Female"
    And Enter the E-mail "priyamurthy1028@gmail.com"
    And Enter the mobile number "8680901259"
    And Enter the DOB "10/03/1998"
    And Enter the address "Arcot,Vellore"
    Then Select the security question "What is your Birth Place"
    Then Enter the answer "Vellore"
    Then click on Register

  