Feature: Registration Form Submission
  Scenario: Submit the registration form with valid details
    Given the user is on the registration page
    When the user enters first name "John"
    And the user enters last name "Doe"
    And the user selects gender "Male"
    And the user enters mobile number "1234567890"
    #And the user selects hobbies "Sports" and "Music"
    And the user selects state "NCR" and city "Delhi"
    And the user submits the form
    Then the form should be submitted successfully
