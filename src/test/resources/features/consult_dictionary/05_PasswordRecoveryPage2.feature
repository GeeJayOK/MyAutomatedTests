Feature: Testing of Password Recovery page 2

  Scenario: 05.0001 Visual check 'Password recovery2' page
    Given User go to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Password recovery page2 is opened
    Then Check that 'Generated password' field is present
    And Check that 'Password1' field is present
    And Check that 'Password2' field is present
    And Check that 'USE GENERATED PASS' button is present
    And Check that 'USE CUSTOM PASS' button is present

  Scenario: 05.0002 Check that 'USE GENERATED PASS' and 'USE CUSTOM PASS' buttons are blocked (without data)
    Given User go to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Password recovery page2 is opened
    And Check that 'USE GENERATED PASS' button is blocked
    And Check that 'USE CUSTOM PASS' button is blocked

  Scenario: 05.0003 Checking the functionality of the 'Back to authorization' link
    Given User go to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Password recovery page2 is opened
    Then User clicks on the 'Back to authorization' link
    And Authorization page is opened

  Scenario: 05.0006 Check 'Generated password' field without data
    Given User go to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Password recovery page2 is opened
    And User enter data "" in the 'USE GENERATED PASS' field
    Then Error message "Please enter generated password" is displayed
    And Check that 'USE GENERATED PASS' button is blocked
    And Check that 'USE CUSTOM PASS' button is blocked

  Scenario: 05.0007 Check verification 'Generated password' field (wrong generated password)
    Given User go to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Password recovery page2 is opened
    Then User enter data "Qwerty123456" in the 'USE GENERATED PASS' field
    And User clicks on the 'USE GENERATED PASS' button
    Then Password recovery page2 is opened

  #Scenario: 05.0008 Check verification 'Generated password' field (wrong generated password + custom password)
    #Given User go to the "https://192.168.217.23/index.html#/recovery" page
    #When Password recovery page1 is opened
    #Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    #And User clicks on the Submit button
    #Then Password recovery page2 is opened
    #Then User enter data "Qwerty123456" in the 'USE GENERATED PASS' field
    #And User enter data "Qwerty1234" in the 'Password1' field
    #And User enter data "Qwerty1234" in the 'Password2' field
    #Then User clicks on the 'USE CUSTOM PASS' button
    #Then Password recovery page2 is opened
    #Then Error "Generated password is not correct" is displayed

  Scenario: 05.0009 Check 'Password1' field without data
    Given User go to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Password recovery page2 is opened
    And User enter data "" in the 'Password1' field
    Then Error "Password must be 6 characters or more and 24 or less" is displayed
    And Check that 'USE GENERATED PASS' button is blocked
    And Check that 'USE CUSTOM PASS' button is blocked

  Scenario: 05.0010 Check 'Password2' field without data
    Given User go to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Password recovery page2 is opened
    And User enter data "" in the 'Password2' field
    Then Error "Password must be 6 characters or more and 24 or less" is displayed
    And Check that 'USE GENERATED PASS' button is blocked
    And Check that 'USE CUSTOM PASS' button is blocked

  Scenario: 05.0011 Check that 'Password1' field is not accept invalid data (5 characters)
    Given User go to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Password recovery page2 is opened
    And User enter data "q1234" in the 'Password1' field
    Then Error "Password must be 6 characters or more and 24 or less" is displayed
    And Check that 'USE GENERATED PASS' button is blocked
    And Check that 'USE CUSTOM PASS' button is blocked

  Scenario: 05.0011/2 Check that 'Password2' field is not accept invalid data (5 characters)
    Given User go to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Password recovery page2 is opened
    And User enter data "q1234" in the 'Password2' field
    Then Error "Password must be 6 characters or more and 24 or less" is displayed
    And Check that 'USE GENERATED PASS' button is blocked
    And Check that 'USE CUSTOM PASS' button is blocked

  Scenario: 05.0012 Check that 'Password1' field is not accept invalid data (5 characters)
    Given User go to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Password recovery page2 is opened
    And User enter data "QWERTYUIOPasdfghjkl123456" in the 'Password1' field
    Then Error "Password must be 6 characters or more and 24 or less" is displayed
    And Check that 'USE GENERATED PASS' button is blocked
    And Check that 'USE CUSTOM PASS' button is blocked

  Scenario: 05.0012/2 Check that 'Password2' field is not accept invalid data (5 characters)
    Given User go to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Password recovery page2 is opened
    And User enter data "QWERTYUIOPasdfghjkl123456" in the 'Password2' field
    Then Error "Password must be 6 characters or more and 24 or less" is displayed
    And Check that 'USE GENERATED PASS' button is blocked
    And Check that 'USE CUSTOM PASS' button is blocked

  Scenario: 05.0013 Check that 'Password1' field is not accept invalid data (only digits)
    Given User go to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Password recovery page2 is opened
    And User enter data "123456" in the 'Password1' field
    Then Error "Password must contains one or more letters" is displayed
    And Check that 'USE GENERATED PASS' button is blocked
    And Check that 'USE CUSTOM PASS' button is blocked

  Scenario: 05.0013/2 Check that 'Password2' field is not accept invalid data (only digits)
    Given User go to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Password recovery page2 is opened
    And User enter data "123456" in the 'Password2' field
    Then Error "Password must contains one or more letters" is displayed
    And Check that 'USE GENERATED PASS' button is blocked
    And Check that 'USE CUSTOM PASS' button is blocked

  Scenario: 05.0014 Check that 'Password1' field is not accept invalid data (russian characters/digits)
    Given User go to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Password recovery page2 is opened
    And User enter data "йцукен123" in the 'Password1' field
    Then Error "Password must contains one or more letters" is displayed
    And Check that 'USE GENERATED PASS' button is blocked
    And Check that 'USE CUSTOM PASS' button is blocked

  Scenario: 05.0014/2 Check that 'Password2' field is not accept invalid data (russian characters/digits)
    Given User go to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Password recovery page2 is opened
    And User enter data "йцукен123" in the 'Password2' field
    Then Error "Password must contains one or more letters" is displayed
    And Check that 'USE GENERATED PASS' button is blocked
    And Check that 'USE CUSTOM PASS' button is blocked

  Scenario: 05.0015 Check that 'Password1' field is not accept invalid data (only special characters)
    Given User go to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Password recovery page2 is opened
    And User enter data "йцукен123" in the 'Password1' field
    Then Error "Password must contains one or more letters" is displayed
    And Check that 'USE GENERATED PASS' button is blocked
    And Check that 'USE CUSTOM PASS' button is blocked

  Scenario: 05.0015/2 Check that 'Password2' field is not accept invalid data (only special characters)s)
    Given User go to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Password recovery page2 is opened
    And User enter data "йцукен123" in the 'Password2' field
    Then Error "Password must contains one or more letters" is displayed
    And Check that 'USE GENERATED PASS' button is blocked
    And Check that 'USE CUSTOM PASS' button is blocked

  #Scenario: 05.0016 Check that 'Password1' field is not accept invalid data (same as login)
    #Given User go to the "https://192.168.217.23/index.html#/recovery" page
    #When Password recovery page1 is opened
    #Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    #And User clicks on the Submit button
    #Then Password recovery page2 is opened
    #And User enter data "ya.getalo" in the 'Password1' field
    #Then Error "Password must not be the same as your username or email" is displayed
    #And Check that 'USE GENERATED PASS' button is blocked
    #And Check that 'USE CUSTOM PASS' button is blocked

  #Scenario: 05.0016/2 Check that 'Password2' field is not accept invalid data (same as login)
    #Given User go to the "https://192.168.217.23/index.html#/recovery" page
    #When Password recovery page1 is opened
    #Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    #And User clicks on the Submit button
    #Then Password recovery page2 is opened
    #And User enter data "ya.getalo" in the 'Password2' field
    #Then Error "Password must not be the same as your username or email" is displayed
    #And Check that 'USE GENERATED PASS' button is blocked
    #And Check that 'USE CUSTOM PASS' button is blocked

  Scenario: 05.0017 Check that 'Password1' field is not accept invalid data (same as login)
    Given User go to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Password recovery page2 is opened
    And User enter data "ya.getalo@aimprosoft.com" in the 'Password1' field
    Then Error "Password must not be the same as your username or email" is displayed
    And Check that 'USE GENERATED PASS' button is blocked
    And Check that 'USE CUSTOM PASS' button is blocked

  Scenario: 05.0017/2 Check that 'Password2' field is not accept invalid data (same as login)
    Given User go to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Password recovery page2 is opened
    And User enter data "ya.getalo@aimprosoft.com" in the 'Password2' field
    Then Error "Password must not be the same as your username or email" is displayed
    And Check that 'USE GENERATED PASS' button is blocked
    And Check that 'USE CUSTOM PASS' button is blocked

  Scenario: 05.0019 Check that comparison with 'Password'/'Password2' fields is work.
    Given User go to the "https://192.168.217.23/index.html#/recovery" page
    When Password recovery page1 is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Password recovery page2 is opened
    And User enter data "QwErTy20199" in the 'Password1' field
    And User enter data "QwErTy2018" in the 'Password2' field
    Then Error "Passwords do not match!" is displayed