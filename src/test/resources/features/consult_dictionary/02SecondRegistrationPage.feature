Feature: check Registration page2

  Scenario: 02.0001-0002 Visual check 'Registration page2'
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And Check that blocked Email field is present
    And Check that 'Send again' is present
    And Check that 'Email Confirmation code' is present
    And Check that 'Login' is present
    And Check that PasswordOne is present
    And Check that PasswordTwo is present
    And Check that SUBMIT button is present
    And CANCEL button is present
    And Check that BTA link is present

  #Scenario: 02.0002 Check that 'SUBMIT' button is blocked (without any data)
    #Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    #When First registration page is opened
    #Then User enter data "kosapofuv@mail-apps.com" in the 'Email' field
    #And User clicks on the Submit button
    #Then Second registration page is opened
    #Then Check that SUBMIT button is blocked

  Scenario: 02.0003 Checking the functionality of the 'Cancel' button
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User clicks on the Cancel button
    Then Authorization page is opened

  Scenario: 02.0004 Checking the functionality of the 'Back to authorization' link
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User clicks on the 'Back to authorization' link
    Then Authorization page is opened

  Scenario: 02.0006 Check that 'Registration page2' fields validation is work ('Email confirmation code' field is empty)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "qwerty1234" to Login field
    And User enter data "qwerty12345" to PasswordOne field
    And User enter data "qwerty12345" to PasswordTwo field
    And User clicks on the Submit button
    Then Second registration page is opened

  Scenario: 02.0007 Check that 'Registration page2' fields validation is work ('Login' field is empty)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "qwerty12345" to PasswordOne field
    And User enter data "qwerty12345" to PasswordTwo field
    Then Check that SUBMIT button is blocked

  Scenario: 02.0008 Check that 'Registration page2' fields validation is work ('Password' field is empty)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "qwerty1234" to Login field
    And User enter data "qwerty12345" to PasswordTwo field
    Then Check that SUBMIT button is blocked

  Scenario: 02.0009 Check that 'Registration page2' fields validation is work ('Password2' field is empty)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "qwerty1234" to Login field
    And User enter data "qwerty12345" to PasswordOne field
    Then Check that SUBMIT button is blocked

  #Scenario: 02.0010 Check that 'Registration page2' fields validation is work (wrong 'Email confirmation code')
    #Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    #When First registration page is opened
    #Then User enter data "kosapofuv@mail-apps.com2" in the 'Email' field
    #And User clicks on the Submit button
    #Then Second registration page is opened
    #And User enter data "Qwerty123" in the 'Email confirmation code' field
    #And User enter data "qwerty1234" to Login field
    #And User enter data "qwerty12345" to PasswordOne field
    #And User enter data "qwerty12345" to PasswordTwo field
    #And User clicks on the Submit button
    #Then Error message "Wrong confirmation code" is displayed

  Scenario: 02.0011 Check that  'Password'/'Password2' fields verification is work (wrong 'Password2')
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "Qwerty123" in the 'Email confirmation code' field
    And User enter data "qwerty1234" to Login field
    And User enter data "qwerty12345" to PasswordOne field
    And User enter data "qwerty123467" to PasswordTwo field
    Then Check that SUBMIT button is blocked
    Then Error message "Passwords do not match!" is displayed

  Scenario: 02.0016 Check 'Login' field without any data
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "" to Login field
    Then Error message "Login must be 3 characters or more and 27 or less" is displayed

  Scenario: 02.0017 Check that 'Login' field is not accept invalid data (2 characters)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "qw" to Login field
    Then Error message "Login must be 3 characters or more and 27 or less" is displayed

  Scenario: 02.0018 Check that 'Login' field is not accept invalid data (more than 27 characters)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "QWERTYUIOPASDFGHJKLZXCVBNMQW" to Login field
    Then Error message "Too many characters!" is displayed

  Scenario: 02.0019 Check that 'Login' field is not accept invalid data (with whitespace)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "QWERTY qwerty" to Login field
    Then Error message "Login can not have whitespace..." is displayed

  Scenario: 02.0020 Check that 'Login' field is not accept invalid data (russian characters)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "йцукен" to Login field
    Then Error message "Login must start with a (A-Za-z)..." is displayed

  Scenario: 02.0021 Check that 'Login' is not accept invalid data (special characters)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "!@#$%^&*()" to Login field
    Then Error message "Login must start with a (A-Za-z)..." is displayed

  Scenario: 02.0022 Check that 'Login' field is not accept invalid data (only digits)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "1234567890" to Login field
    Then Error message "Login must start with a (A-Za-z)..." is displayed

  Scenario: 02.0023 Check that 'Login' field is not accept invalid data (latin/russian characters)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "wйцукен" to Login field
    Then Error message "Login must have characters from a range of (A-Za-z0-9.-_)..." is displayed

  Scenario: 02.0024 Check that 'Login' field is not accept invalid data (latin/special characters)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "q!@#$%^&*()" to Login field
    Then Error message "Login must have characters from a range of (A-Za-z0-9.-_)..." is displayed

  Scenario: 02.0025 Check 'Password'/'Password2' fields without entering data
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "" to PasswordOne field
    Then Error message "Password must be 6 characters or more and 24 or less" is displayed
    And User enter data "" to PasswordTwo field
    Then Error message "Password must be 6 characters or more and 24 or less" is displayed
    And Check that SUBMIT button is blocked

  Scenario: 02.0026 Check that 'Password'/'Password2' fields are not accept invalid data (5 characters)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "q1234" to PasswordOne field
    Then Error message "Password must be 6 characters or more and 24 or less" is displayed
    And User enter data "q1234" to PasswordTwo field
    Then Error message "Password must be 6 characters or more and 24 or less" is displayed
    And Check that SUBMIT button is blocked

  Scenario: 02.0027 Check that 'Password'/'Password2' fields are not accept invalid data (more than 24 characters)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "QWERTYUIOPasdfghjkl123456" to PasswordOne field
    Then Error message "Password must be 6 characters or more and 24 or less" is displayed
    And User enter data "QWERTYUIOPasdfghjkl123456" to PasswordTwo field
    Then Error message "Password must be 6 characters or more and 24 or less" is displayed
    And Check that SUBMIT button is blocked

  Scenario: 02.0028 Check that 'Password'/'Password2' fields are not accept invalid data (only didgits)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "QWERTYUIOPasdfghjkl123456" to PasswordOne field
    Then Error message "Password must be 6 characters or more and 24 or less" is displayed
    And User enter data "QWERTYUIOPasdfghjkl123456" to PasswordTwo field
    Then Error message "Password must be 6 characters or more and 24 or less" is displayed
    And Check that SUBMIT button is blocked

  Scenario: 02.0029 Check that 'Password'/'Password2' fields are not accept invalid data (russian characters/digits)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "йцукен123" to PasswordOne field
    Then Error message "Password must contains one or more letters" is displayed
    And User enter data "йцукен123" to PasswordTwo field
    Then Error message "Password must contains one or more letters" is displayed
    And Check that SUBMIT button is blocked

  #Scenario: 02.0030 Check that 'Password'/'Password2' fields are not accept invalid data (latin/russian characters/digits)
    #Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    #When First registration page is opened
    #Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    #And User clicks on the Submit button
    #Then Second registration page is opened
    #And User enter data "qwйцукен123" to PasswordOne field
    #Then Error message "Password must have characters from a range of (A-Za-z0-9.-_)..." is displayed
    #And User enter data "qwйцукен123" to PasswordTwo field
    #Then Error message "Password must have characters from a range of (A-Za-z0-9.-_)..." is displayed
    #And Check that SUBMIT button is blocked

  Scenario: 02.0031 Check that 'Password'/'Password2' fields are not accept invalid data (only special characters)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "!@#$%^&" to PasswordOne field
    Then Error message "Password must contains one or more numbers" is displayed
    And User enter data "!@#$%^&" to PasswordTwo field
    Then Error message "Password must contains one or more numbers" is displayed
    And Check that SUBMIT button is blocked

  Scenario: 02.0032 Check that 'Password'/'Password2' fields are not accept invalid data (same as login)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "QwErTy2019" to Login field
    And User enter data "QwErTy2019" to PasswordOne field
    Then Error message Password must not be the same as your username or email is displayed
    And User enter data "QwErTy2019" to PasswordTwo field
    Then Error message Password must not be the same as your username or email is displayed
    And Check that SUBMIT button is blocked

  Scenario: 02.0033 Check that 'Password'/'Password2' fields are not accept invalid data (same as email)
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "ya.getalo@aimprosoft.com" to PasswordOne field
    Then Error message Password must not be the same as your username or email is displayed
    And User enter data "ya.getalo@aimprosoft.com" to PasswordTwo field
    Then Error message Password must not be the same as your username or email is displayed
    And Check that SUBMIT button is blocked

  Scenario: 02.0035 Check that comparison with 'Password'/'Password2' fields is work.
    Given User go to Registration "https://192.168.217.23/index.html#/registration" page
    When First registration page is opened
    Then User enter data "ya.getalo@aimprosoft.com" in the 'Email' field
    And User clicks on the Submit button
    Then Second registration page is opened
    And User enter data "QwErTy20199" to PasswordOne field
    And User enter data "QwErTy2018" to PasswordTwo field
    Then Error message "Passwords do not match!" is displayed
    And Check that SUBMIT button is blocked
