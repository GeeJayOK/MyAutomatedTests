Feature: Testing of Password Recovery page 1

  Scenario: 04.0001 Visual check 'Password recovery1'
    Given User goes to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then Check that 'Email' field is present
    And Check that SEND RESET INSTRUCTIONS button is present
    And Check that 'BTA' link is present

  Scenario: 04.0002 Check that 'SEND RESET INSTRUCTIONS' button is blocked (without data)
    Given User goes to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then Check that SEND RESET INSTRUCTIONS button is blocked
    #failed

  Scenario: 04.0003 Checking the functionality of the 'Back to authorization' link
    Given User goes to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User clicks on the 'Back to authorization' link
    And Authorization page is opened

  Scenario: 04.0005 Check 'Email' field without any data
    Given User goes to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "" in the 'Email' field
    And Error message "Email field must not be empty!" is displayed
    #failed

  Scenario: 04.0006 Check that 'Email' field is not accept invalid data ( email without @)
    Given User goes to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "Abc.example.com" in the 'Email' field
    And Error message "Invalid email format!" is displayed

  Scenario: 04.0007 Check that 'Email' field is not accept invalid data ( @...@)
    Given User goes to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "A@b@c@example.com" in the 'Email' field
    And Error message "Invalid email format!" is displayed

  Scenario: 04.0008 Check that 'Email' field is not accept invalid data (1 character in local part)
    Given User goes to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "x@example.com" in the 'Email' field
    And Error message "Invalid email format!" is displayed
    #failed

  Scenario: 04.0009 Check that 'Email' field is not accept invalid data (digits in both parts)
    Given User goes to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "123456@1234.1234" in the 'Email' field
    And Error message "Invalid email format!" is displayed
    #failed

  Scenario: 04.0010 Check that 'Email' field is not accept invalid data (special characters in local part)
    Given User goes to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "a'b(c)d,e:f;g<h>i[j\k]l@example.com" in the 'Email' field
    And Error message "Invalid email format!" is displayed

  Scenario: 04.0011 Check that 'Email' field is not accept invalid data (whitespace in local part)
    Given User goes to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "this is notallowed@example.com" in the 'Email' field
    And Error message "Invalid email format!" is displayed

  Scenario: 04.0012 Check that 'Email' field is not accept invalid data (russian characters in local part)
    Given User goes to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "йцукен@example.com" in the 'Email' field
    And Error message "Invalid email format!" is displayed

  Scenario: 04.0013 Check that 'Email' field is not accept invalid data (special characters in domain part)
    Given User goes to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "example@#$%^&*.com" in the 'Email' field
    And Error message "Invalid email format!" is displayed

  Scenario: 04.0014 Check that 'Email' field is not accept invalid data (whitespace in domain part)
    Given User goes to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "example@micro soft.com" in the 'Email' field
    And Error message "Invalid email format!" is displayed

  Scenario: 04.0015 Check that 'Email' field is not accept invalid data (russian characters in domain part)
    Given User goes to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "example@йцукен.ком" in the 'Email' field
    And Error message "Invalid email format!" is displayed

  Scenario: 04.0016 Check that 'Email' field is not accept unregistered email
    Given User goes to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "example@example.exe" in the 'Email' field
    And User clicks on the 'Submit' button
    And Error message "This email is not registered!" is displayed
    #failed