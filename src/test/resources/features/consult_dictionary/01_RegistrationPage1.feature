Feature: check Registration page1

  Scenario: 01.0001 check Registration page
    Given User goes to "https://192.168.217.23/index.html#/registration" page
    When Registration page1 is opened
    Then Check that 'Email' field is present
    And Check that 'SUBMIT' button is present
    And Check that 'CANCEL' button is present
    And Check that 'Back to authorization' link is present

  Scenario: 01.0002 Check 'Registration page1' (without any data)
    Given User goes to "https://192.168.217.23/index.html#/registration" page
    When Registration page1 is opened
    When Check that 'SUBMIT' button is blocked

  Scenario: 01.0003 checking the functionality of the 'Cancel' button
    Given User goes to "https://192.168.217.23/index.html#/registration" page
    When User clicks on the 'Cancel' button
    Then Authorization page is opened

  Scenario: 01.0004 Checking the functionality of the 'Back to authorization' link
    Given User goes to "https://192.168.217.23/index.html#/registration" page
    When User clicks on the 'Back to authorization' link
    Then Authorization page is opened

  Scenario: 01.0005 Check that 'Email' field is accept valid email
    Given User goes to "https://192.168.217.23/index.html#/registration" page
    When Registration page1 is opened
    Then User enter data "testuser@test.com" in the 'Email' field
    And Check that 'SUBMIT' button is available

  Scenario: 01.0006 Check 'Email' field without any data
    Given User goes to "https://192.168.217.23/index.html#/registration" page
    When Registration page1 is opened
    Then User clicks in the 'Email' field and click outside
    And Check that 'SUBMIT' button is blocked
    Then Error message "Email field must not be empty!" is displayed

  Scenario: 01.0007 Check that 'Email' field is not accept invalid data (email without @)
    Given User goes to "https://192.168.217.23/index.html#/registration" page
    When Registration page1 is opened
    Then User enter data "Abc.example.com" in the 'Email' field
    And Check that 'SUBMIT' button is blocked
    Then Error message "Invalid email format!" is displayed

  Scenario: 01.0008 Check that 'Email' field is not accept invalid data (@ @)
    Given User goes to "https://192.168.217.23/index.html#/registration" page
    When Registration page1 is opened
    Then User enter data "A@b@c@example.com" in the 'Email' field
    And Check that 'SUBMIT' button is blocked
    Then Error message "Invalid email format!" is displayed

  Scenario: 01.0009 Check that 'Email' field is not accept invalid data (1 character in local part)
    Given User goes to "https://192.168.217.23/index.html#/registration" page
    When Registration page1 is opened
    Then User enter data "x@example.com" in the 'Email' field
    And Check that 'SUBMIT' button is blocked
    Then Error message "Invalid email format!" is displayed
#failed

  Scenario: 01.0010 Check that 'Email' field is not accept invalid data (digits in both parts)
    Given User goes to "https://192.168.217.23/index.html#/registration" page
    When Registration page1 is opened
    Then User enter data "123456@1234.1234" in the 'Email' field
    And Check that 'SUBMIT' button is blocked
    Then Error message "Invalid email format!" is displayed
#failed

  Scenario: 01.0011 Check that 'Email' field is not accept invalid data (special characters in local part)
    Given User goes to "https://192.168.217.23/index.html#/registration" page
    When Registration page1 is opened
    Then User enter data "ab(c)d,e:f;g<h>i[j\k]l@example.com" in the 'Email' field
    And Check that 'SUBMIT' button is blocked
    Then Error message "Invalid email format!" is displayed

  Scenario: 01.0012 Check that 'Email' field is not accept invalid data (whitespace in local part)
    Given User goes to "https://192.168.217.23/index.html#/registration" page
    When Registration page1 is opened
    Then User enter data "this is notallowed@example.com" in the 'Email' field
    And Check that 'SUBMIT' button is blocked
    Then Error message "Invalid email format!" is displayed

  Scenario: 01.0013 Check that 'Email' field is not accept invalid data (russian characters in local part)
    Given User goes to "https://192.168.217.23/index.html#/registration" page
    When Registration page1 is opened
    Then User enter data "йцукен@example.com" in the 'Email' field
    And Check that 'SUBMIT' button is blocked
    Then Error message "Invalid email format!" is displayed

  Scenario: 01.0014 Check that 'Email' field is not accept invalid data (special characters in domain part)
    Given User goes to "https://192.168.217.23/index.html#/registration" page
    When Registration page1 is opened
    Then User enter data "example@#$%^&*.com" in the 'Email' field
    And Check that 'SUBMIT' button is blocked
    Then Error message "Invalid email format!" is displayed

  Scenario: 01.0015 Check that 'Email' field is not accept invalid data (whitespace in domain part)
    Given User goes to "https://192.168.217.23/index.html#/registration" page
    When Registration page1 is opened
    Then User enter data "example@micro soft.com" in the 'Email' field
    And Check that 'SUBMIT' button is blocked
    Then Error message "Invalid email format!" is displayed

  Scenario: 01.0016 Check that 'Email' field is not accept invalid data (russian characters in domain part)
    Given User goes to "https://192.168.217.23/index.html#/registration" page
    When Registration page1 is opened
    Then User enter data "example@йцукен.ком" in the 'Email' field
    And Check that 'SUBMIT' button is blocked
    Then Error message "Invalid email format!" is displayed

  Scenario: 01.0017 Check 'Email' field verification (using already registered email).
    Given User goes to "https://192.168.217.23/index.html#/registration" page
    When Registration page1 is opened
    Then User enter data "kosapofuv@mail-apps.com" in the 'Email' field
    Then Check that 'SUBMIT' button is available
    And Error message "This email is already taken" is displayed
    #failed

  Scenario Outline: 01.0018-21 Check that field 'Email' is accept valid data
    Given User goes to "https://192.168.217.23/index.html#/registration" page
    When Registration page1 is opened
    Then User enter data "<email>" in the 'Email' field
    And Check that 'SUBMIT' button is available
    Examples:
      | email                                          |
      | disposable.style.email.with.symbol@example.com |
      | fully-qualified-domain@example.com             |
      | other.email-with-hyphen@example.com            |
      | example-indeed@strange-example.com             |