Feature: Testing login page

  Scenario: 03.0001 Visual check 'Authorization page'
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And Check that 'Login' is present
    And Check that 'Password' is present
    And Check that 'Remember me' is present
    And Check that 'Forgot your password' is present
    And Check that 'SIGN IN' is present
    And Check that 'REGISTER' is present

  Scenario: 03.0002 Check that 'SIGN IN' button is blocked (without data)
    Given User go to the "https://192.168.217.23/index.html#/login" page
    When User is on the Authorization page
    Then Check that SIGN IN button is blocked

  Scenario: 03.0003 Check that 'Remember me' label is available
    Given User go to the "https://192.168.217.23/index.html#/login" page
    When User is on the Authorization page
    Then User clicks on the 'Remember me' link
    Then Registration page1 is opened

  Scenario: 03.0004 Checking the functionality of the 'Forgot your password' link
    Given User go to the "https://192.168.217.23/index.html#/login" page
    When User is on the Authorization page
    Then User clicks on the 'Forgot your password' link
    Then Password recovery page1 is opened

  Scenario: 03.0005 Checking the functionality of the 'REGISTER' link
    Given User go to the "https://192.168.217.23/index.html#/login" page
    When User is on the Authorization page
    Then User clicks on the 'REGISTER' link
    Then Registration page1 is opened

  Scenario: 03.0006 Check that 'Authorization page' can accept valid data
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful

  Scenario: 03.0008 Check that 'Authorization page' fields validation is work (empty 'Password')
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And User enter data "ya.getalo@aimprosoft.com" to 'Login' field
    And Check that 'SIGN IN' button is disabled
    Then User is on the Authorization page

  Scenario: 03.0009 Check that 'Authorization page' fields validation is work (empty 'Login')
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And User enter data "qk180t56732i" to Password field
    And Check that 'SIGN IN' button is disabled
    Then User is on the Authorization page

  Scenario: 03.0010 Check that 'Authorization page' fields verification is work (use unregistered login/password)
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And User enter data "testuser@aimprosoft.com" to 'Login' field
    And User enter data "qk123456i" to Password field
    And User clicks on the SIGN IN button
    Then Message 'Unauthorized' is displayed

  Scenario: 03.0011 Check that 'Authorization page' fields verification is work (wrong password)
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And User enter data "ya.getalo@aimprosoft.com" to 'Login' field
    And User enter data "qk12345678i" to Password field
    And User clicks on the SIGN IN button
    Then Message 'Unauthorized' is displayed

  Scenario: 03.0012 Check that 'Authorization page' fields validation is work (email in login)
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And User enter data "ya.getalo@aimprosoft.com" to 'Login' field
    And User enter data "qk180t56732i" to Password field
    And User clicks on the SIGN IN button
    Then Message 'Unauthorized' is displayed
    Then User is on the Authorization page
  #failed

  Scenario: 03.0014 Check 'Login' field without any data
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And User enter data "" to 'Login' field
    And Message of error is displayed

  Scenario: 03.0015 Check that 'Login' field is not accept invalid data (2 characters)
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And User enter data "qw" to 'Login' field
    Then Check that 'Check circle' is not displayed
    And Check that 'SIGN IN' button is disabled
    #failed

  Scenario: 03.0016 Check that 'Login' field is not accept invalid data (more than 27 characters)
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And User enter data "QWERTYUIOPASDFGHJKLZXCVBNMQW" to 'Login' field
    Then Check that 'Check circle' is not displayed
    And Check that 'SIGN IN' button is disabled
    #failed

  Scenario: 03.0017 Check that 'Login' field is not accept invalid data (with whitespace)
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And User enter data "QWERTY qwerty" to 'Login' field
    Then Check that 'Check circle' is not displayed
    And Message of error is displayed
    And Check that 'SIGN IN' button is disabled

  Scenario: 03.0018 Check that 'Login' field is not accept invalid data (russian characters)
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And User enter data "йцукен" to 'Login' field
    Then Check that 'Check circle' is not displayed
    And Message of error is displayed
    And Check that 'SIGN IN' button is disabled

  Scenario: 03.0019 Check that 'Login' field is not accept invalid data (special characters)
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And User enter data "!@#$%^&*()" to 'Login' field
    Then Check that 'Check circle' is not displayed
    And Message of error is displayed
    And Check that 'SIGN IN' button is disabled

  Scenario: 03.0020 Check that 'Login' field is not accept invalid data (only digits)
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And User enter data "1234567890" to 'Login' field
    Then Check that 'Check circle' is not displayed
    And Message of error is displayed
    And Check that 'SIGN IN' button is disabled
    #failed

  Scenario: 03.0021 Check that 'Login' field is not accept invalid data (latin/russian characters)
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And User enter data "Wйцукен" to 'Login' field
    Then Check that 'Check circle' is not displayed
    And Message of error is displayed
    And Check that 'SIGN IN' button is disabled

  Scenario: 03.0022 Check that 'Login' field is not accept invalid data (latin/special characters)
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And User enter data "q!@#$%^&*()" to 'Login' field
    Then Check that 'Check circle' is not displayed
    And Message of error is displayed
    And Check that 'SIGN IN' button is disabled

  Scenario: 03.0023 Check 'Password' field without any data
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And User enter data "" to Password field
    And Message of error is displayed
    And Check that 'SIGN IN' button is disabled

  Scenario: 03.0024 Check that 'Password' field is not accept invalid data (5 characters)
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And User enter data "q1234" to Password field
    And Message of error is displayed
    And Check that 'SIGN IN' button is disabled
    #failed

  Scenario: 03.0025 Check that 'Password' field is not accept invalid data (more than 24 characters)
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And User enter data "QWERTYUIOPASDFGHJKLZXCVBN" to Password field
    And Message of error is displayed
    And Check that 'SIGN IN' button is disabled
    #failed

  Scenario: 03.0026 Check that 'Password' field is not accept invalid data (only didgits)
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And User enter data "123456" to Password field
    And Message of error is displayed
    And Check that 'SIGN IN' button is disabled
    #failed

  Scenario: 03.0027 Check that 'Password' field is not accept invalid data (with russian characters)
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And User enter data "йцукен123" to Password field
    And Message of error is displayed
    And Check that 'SIGN IN' button is disabled
    #failed

  Scenario: 03.0028 Check that 'Password' field is not accept invalid data (only special characters)
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    And User enter data "!@#$%^&" to Password field
    And Message of error is displayed
    And Check that 'SIGN IN' button is disabled
    #failed

