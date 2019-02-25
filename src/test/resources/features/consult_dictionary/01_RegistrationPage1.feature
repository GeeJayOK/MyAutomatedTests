Feature: check Registration page1

  Scenario: 01.0001 check Registration page
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then Check that Email field is present
    And SUBMIT button is present
    And CANCEL button is present
    And 'Back to authorization' link is present

  Scenario: 01.0002 Check 'Registration page1' (without any data)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    When Check that SUBMIT button is blocked

  Scenario: 01.0003 checking the functionality of the 'Cancel' button
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When User clicks on the 'Cancel' button
    Then Authorization page is opened

  Scenario: 01.0004 Checking the functionality of the 'Back to authorization' link
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When User clicks on the 'Back to authorization' link
    Then Authorization page is opened

  Scenario: 01.0005 Check that 'Email' field is accept valid email
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "testuser@test.com" in the 'Email' field
    And Check that SUBMIT button is available

  Scenario: 01.0006 Check 'Email' field without any data
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User clicks in the 'Email' field and click outside
    And Check that SUBMIT button is blocked
    Then Error message "Email field must not be empty!" is displayed

  Scenario: 01.0007 Check that 'Email' field is not accept invalid data (email without @)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "Abc.example.com" in the 'Email' field
    And Check that SUBMIT button is blocked
    Then Error message "Invalid email format!" is displayed

  Scenario: 01.0008 Check that 'Email' field is not accept invalid data (@ @)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "A@b@c@example.com" in the 'Email' field
    And Check that SUBMIT button is blocked
    Then Error message "Invalid email format!" is displayed

  #Scenario: 01.0009 Check that 'Email' field is not accept invalid data (1 character in local part)
    #Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    #When First registration page is opened
    #Then User enter data "x@example.com" in the 'Email' field
    #And Check that SUBMIT button is blocked
    #Then Error message "Invalid email format!" is displayed

  #Scenario: 01.0010 Check that 'Email' field is not accept invalid data (digits in both parts)
   #Given User go to Registration "https://192.168.217.23/index.html#/registration" page
   #When First registration page is opened
   #Then User enter data "123456@1234.1234" in the 'Email' field
   #And Check that SUBMIT button is blocked
   #Then Error message "Invalid email format!" is displayed

  Scenario: 01.0011 Check that 'Email' field is not accept invalid data (special characters in local part)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ab(c)d,e:f;g<h>i[j\k]l@example.com" in the 'Email' field
    And Check that SUBMIT button is blocked
    Then Error message "Invalid email format!" is displayed

  Scenario: 01.0012 Check that 'Email' field is not accept invalid data (whitespace in local part)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "this is notallowed@example.com" in the 'Email' field
    And Check that SUBMIT button is blocked
    Then Error message "Invalid email format!" is displayed

  Scenario: 01.0013 Check that 'Email' field is not accept invalid data (russian characters in local part)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "йцукен@example.com" in the 'Email' field
    And Check that SUBMIT button is blocked
    Then Error message "Invalid email format!" is displayed

  Scenario: 01.0014 Check that 'Email' field is not accept invalid data (special characters in domain part)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "example@#$%^&*.com" in the 'Email' field
    And Check that SUBMIT button is blocked
    Then Error message "Invalid email format!" is displayed

  Scenario: 01.0015 Check that 'Email' field is not accept invalid data (whitespace in domain part)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "example@micro soft.com" in the 'Email' field
    And Check that SUBMIT button is blocked
    Then Error message "Invalid email format!" is displayed

  Scenario: 01.0016 Check that 'Email' field is not accept invalid data (russian characters in domain part)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "example@йцукен.ком" in the 'Email' field
    And Check that SUBMIT button is blocked
    Then Error message "Invalid email format!" is displayed

  #Scenario: 01.0017 Check 'Email' field verification (using already registered email).
    #Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    #When First registration page is opened
    #Then User enter data "kosapofuv@mail-apps.com" in the 'Email' field
    #Then Check that SUBMIT button is available
    #And Check that SUBMIT button is not clickable and User should be on the first registration page# And Error message "This email is already taken" is displayed
    # - not implemented yet

  Scenario Outline: 01.0018-21 Check that field 'Email' is accept valid data
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "<email>" in the 'Email' field
    And Check that SUBMIT button is available
    Examples:
      | email                                          |
      | disposable.style.email.with.symbol@example.com |
      | fully-qualified-domain@example.com             |
      | other.email-with-hyphen@example.com            |
      | example-indeed@strange-example.com             |