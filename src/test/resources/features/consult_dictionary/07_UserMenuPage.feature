Feature: Testing of User Menu page

  Scenario: 07.0001 Check drop-down user menu
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And Check that 'Profile' button is present
    And Check that 'Sign out' button is present
    And Check that 'Join another team' button is present
    And Check that 'Download App' button is present

  Scenario: 07.0002 Check 'Profile' item in drop-down user menu
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And Check that 'Profile' is present
    And Check that 'Account settings' is present
    And Check that 'Notification settings' is present
    And Check that 'First Name' is present
    And Check that 'Last Name' is present
    And Check that 'Phone number' is present
    And Check that 'Skype' is present
    And Check that 'What I do' is present
    And Check that 'Where I am' is present
    And Check that 'Time Zone' is present
    And Check that 'Avatar big' is present
    And Check that 'Change avatar' button is present
    And Check that 'Save' button is present

  Scenario: 07.0003 Check 'Account settings' item in 'Left panel'
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User clicks on the 'Account settings' item
    Then 'Account settings' page is opened
    And Check that 'Email' field is present at the 'Account settings' page
    And Check that 'Email' field contains "ya.getalo@aimprosoft.com"
    And Check that 'Username' field is present
    And Check that 'Username' field contains "qwer_"
    And Check that 'Old password' field is present
    And Check that 'New password' field is present

  Scenario: 07.0004 Check 'Notification settings' item in 'Left panel'
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User clicks on the 'Notification settings' item
    Then 'Notification settings' page is opened
    And Check that 'Desktop Notifications' item is present
    And Check that 'Mobile Push Notifications' item is present
    And Check that 'Room Specific Settings' item is present
    And Check that 'Do not disturb' item is present
    And Check that 'Marking messages as read' item is present

  Scenario: 07.0005 Check 'Sign out' item in drop-down user menu
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'SIGN OUT' button
    Then Authorization page is opened

  Scenario: 07.0008 Check dropdown menu 'The Bell' icon
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'The Bell' button
    And Check that 'Mute all chat for:' item is present
    And Check that '20 minutes' item is present
    And Check that '1 hour' item is present
    And Check that '2 hours' item is present
    And Check that '4 hours' item is present
    And Check that '8 hours' item is present
    And Check that '24 hours' item is present
    And Check that 'Notification settings' item is present

  Scenario: 07.0017 Checking functionality of the 'Notification settings' item.
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'The Bell' button
    And  User clicks on the 'Notification settings' button
    Then 'Notification settings' page is opened

  Scenario: 07.0018 Check that  fields 'First Name:'/'Last Name:' are accept valid data.
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "John" in the 'First Name' field
    And User enter data "Smith" in the 'Last Name' field
    And User clicks on the 'Save' button
    Then Message "Profile successfully updated" is displayed
    Then User refresh the page
    And Wait for loader
    Then Check that entered data "John" in the 'First Name' field is saved
    And  Check that entered data "Smith" in the 'Last Name' field is saved

  Scenario: 07.0019 Check that 'First Name:' field is not accept invalid data (2 characters).
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "Qw" in the 'First Name' field
    Then Profile page error message "Should be 3 characters or more." is displayed
    And Check that 'SAVE' button is blocked

  Scenario: 07.0020 Check that 'First Name:' field is not accept invalid data  (more than 50 characters).
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "QwErTyUiOpQwErTyUiOpQwErTyUiOpQwErTyUiOpQwErTyUiOpQ" in the 'First Name' field
    Then Profile page error message "Too many characters!" is displayed
    And Check that 'SAVE' button is blocked
    #failed

  Scenario: 07.0021 Check that 'First Name:' field is not accept invalid data  (russian characters)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "ЙцУкЕн" in the 'First Name' field
    Then Profile page error message "Must start with a (A-Za-z)..." is displayed
    And Check that 'SAVE' button is blocked

  Scenario: 07.0022 Check that 'First Name:' field is not accept invalid data (digits only)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "123456" in the 'First Name' field
    Then Profile page error message "Must start with a (A-Za-z)..." is displayed
    And Check that 'SAVE' button is blocked

  Scenario: 07.0023 Check that 'First Name:' field is not accept invalid data (special characters)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "!№;%:?*" in the 'First Name' field
    Then Profile page error message "Must start with a (A-Za-z)..." is displayed
    And Check that 'SAVE' button is blocked

  Scenario: 07.0024 Check that 'First Name:' field is not accept invalid data (latin/russian characters)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "Wйцукенович" in the 'First Name' field
    Then Profile page error message "Must contains only (A-Za-z) characters" is displayed
    And Check that 'SAVE' button is blocked
    #failed

  Scenario: 07.0025 Check that 'First Name:' field is not accept invalid data (latin/special characters)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "Q!№;%:?*" in the 'First Name' field
    Then Profile page error message "Must contains only (A-Za-z) characters" is displayed
    And Check that 'SAVE' button is blocked
    #failed

  Scenario: 07.0026 Check that 'First Name:' field is not accept invalid data (latin/digits)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "Z123456" in the 'First Name' field
    Then Profile page error message "Must contains only (A-Za-z) characters" is displayed
    And Check that 'SAVE' button is blocked
    #failed

  Scenario: 07.0027 Check that 'Last Name:' field is not accept invalid data (2 characters).
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "Qw" in the 'Last Name' field
    Then Profile page error message "Should be 3 characters or more." is displayed
    And Check that 'SAVE' button is blocked

  Scenario: 07.0028 Check that 'Last Name:' field is not accept invalid data (more than 50 characters).
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "QwErTyUiOpQwErTyUiOpQwErTyUiOpQwErTyUiOpQwErTyUiOpQ" in the 'Last Name' field
    Then Profile page error message "Too many characters!" is displayed
    And Check that 'SAVE' button is blocked
    #failed

  Scenario: 07.0029 Check that 'Last Name:' field is not accept invalid data (russian characters)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "ЙцУкЕн" in the 'Last Name' field
    Then Profile page error message "Must start with a (A-Za-z)..." is displayed
    And Check that 'SAVE' button is blocked

  Scenario: 07.0030 Check that 'Last Name:' field is not accept invalid data (digits only)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "123456" in the 'Last Name' field
    Then Profile page error message "Must start with a (A-Za-z)..." is displayed
    And Check that 'SAVE' button is blocked

  Scenario: 07.0031 Check that 'Last Name:' field is not accept invalid data (special characters)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "!№;%:?*" in the 'Last Name' field
    Then Profile page error message "Must start with a (A-Za-z)..." is displayed
    And Check that 'SAVE' button is blocked

  Scenario: 07.0032 Check that 'Last Name:' field is not accept invalid data (latin/russian characters)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "Wйцукенович" in the 'Last Name' field
    Then Profile page error message "Must contains only (A-Za-z) characters" is displayed
    And Check that 'SAVE' button is blocked
    #failed

  Scenario: 07.0033 Check that 'Last Name:' field is not accept invalid data (latin/special characters)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "Q!№;%:?*" in the 'Last Name' field
    Then Profile page error message "Must contains only (A-Za-z) characters" is displayed
    And Check that 'SAVE' button is blocked
    #failed

  Scenario: 07.0034 Check that 'Last Name:' field is not accept invalid data (latin/digits)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "Z123456" in the 'Last Name' field
    Then Profile page error message "Must contains only (A-Za-z) characters" is displayed
    And Check that 'SAVE' button is blocked
    #failed

  Scenario: 07.0035 Check that field 'Phone number:' is accept valid data
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "380935554433" in the 'Phone number' field
    And User clicks on the 'Save' button
    Then Message "Profile successfully updated" is displayed
    Then User refresh the page
    And Wait for loader
    Then Check that entered data "380935554433" in the 'Phone number' field is saved

  Scenario: 07.0036 Check that field 'Phone number:' is not accept invalid data (2 digits)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "12" in the 'Phone number' field
    Then Profile page error message "Phone number should include from 3 to 20 digits without special symbols" is displayed
    And Check that 'SAVE' button is blocked
    #failed

  Scenario: 07.0037 Check that field 'Phone number:' is not accept invalid data (more than 20 digits)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "012345678901234567891" in the 'Phone number' field
    Then Profile page error message "Phone number should include from 3 to 20 digits without special symbols" is displayed
    And Check that 'SAVE' button is blocked
    #failed

  Scenario: 07.0038 Check that field 'Phone number:' is not accept invalid data (digits with whitespace)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "012345    67" in the 'Phone number' field
    Then Profile page error message "Phone number should include from 3 to 20 digits without special symbols" is displayed
    And Check that 'SAVE' button is blocked
    #failed

  Scenario: 07.0039 Check that field 'Phone number:' is not accept invalid data (latin characters)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "QwErTy" in the 'Phone number' field
    Then Profile page error message "Phone number should include from 3 to 20 digits without special symbols" is displayed
    And Check that 'SAVE' button is blocked

  Scenario: 07.0040 Check that field 'Phone number:' is not accept invalid data (russian characters)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "ЙцУкЕн" in the 'Phone number' field
    Then Profile page error message "Phone number should include from 3 to 20 digits without special symbols" is displayed
    And Check that 'SAVE' button is blocked

  Scenario: 07.0041 Check that field 'Phone number:' is not accept invalid data (special characters)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "!@#$%^&*" in the 'Phone number' field
    Then Profile page error message "Phone number should include from 3 to 20 digits without special symbols" is displayed
    And Check that 'SAVE' button is blocked

  Scenario: 07.0042 Check that field 'Skype:' is accept valid data
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "live:botyra_1999" in the 'Skype' field
    And User clicks on the 'Save' button
    Then Message "Profile successfully updated" is displayed
    Then User refresh the page
    And Wait for loader
    Then Check that entered data "live:botyra_1999" in the 'Skype' field is saved

  Scenario: 07.0043 Check that field 'Skype:' is not accept invalid data (2 characters)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "Qw" in the 'Skype' field
    Then Profile page error message "Should be 3 characters or more." is displayed
    And Check that 'SAVE' button is blocked

  Scenario: 07.0044 Check that field 'Skype:' is not accept invalid data (more that 14 characters)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "live:kosapofuvQ" in the 'Skype' field
    Then Profile page error message "Too many characters!" is displayed
    And Check that 'SAVE' button is blocked
    #failed

  Scenario: 07.0045 Check that field 'Skype:' is not accept invalid data (special characters)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "!@#$%" in the 'Skype' field
    Then Profile page error message "Must start with a (A-Za-z)..." is displayed
    And Check that 'SAVE' button is blocked

  Scenario: 07.0046 Check that field 'Skype:' is not accept invalid data (russian characters)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "ЙцУкЕн" in the 'Skype' field
    Then Profile page error message "Must start with a (A-Za-z)..." is displayed
    And Check that 'SAVE' button is blocked

  Scenario: 07.0047 Check that field 'Skype:' is not accept invalid data (whitespace)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "Qwe  asdf" in the 'Skype' field
    Then Profile page error message "Must contains only (A-Za-z) characters" is displayed
    And Check that 'SAVE' button is blocked
    #failed

  Scenario: 07.0048 Check that  field 'Skype:' is not accept invalid data (latin/russian characters)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "QwErЙцукенович" in the 'Skype' field
    Then Profile page error message "Must contains only (A-Za-z) characters" is displayed
    And Check that 'SAVE' button is blocked
    #failed

  Scenario: 07.0049 Check that field 'Skype:' is not accept invalid data (latin/special characters)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "QwEr!@#$%^&" in the 'Skype' field
    Then Profile page error message "Must contains only (A-Za-z) characters" is displayed
    And Check that 'SAVE' button is blocked
    #failed

  Scenario: 07.0050 Check that field 'What I do:' is accept valid data
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "I'm writing test cases" in the 'What I do' field
    And User clicks on the 'Save' button
    Then Message "Profile successfully updated" is displayed
    Then User refresh the page
    And Wait for loader
    Then Check that entered data "I'm writing test cases" in the 'What I do' field is saved

  Scenario: 07.0051 Check that  field 'What I do:' is not accept invalid data (2 characters)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "qw" in the 'What I do' field
    Then Profile page error message "Should be 3 characters or more." is displayed
    And Check that 'SAVE' button is blocked

  Scenario: 07.0052 Check that  field 'What I do:' is not accept invalid data (digits)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "12345" in the 'What I do' field
    Then Profile page error message "Must start with a (A-Za-z)..." is displayed
    And Check that 'SAVE' button is blocked

  Scenario: 07.0053 Check that  field 'What I do:' is not accept invalid data (special characters)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "!@#$%^&" in the 'What I do' field
    Then Profile page error message "Must start with a (A-Za-z)..." is displayed
    And Check that 'SAVE' button is blocked

  Scenario: 07.0054 Check that  field 'What I do:' is not accept invalid data (russian characters)
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    And User enter data "Я пишу тест-кейсы" in the 'What I do' field
    Then Profile page error message "Must start with a (A-Za-z)..." is displayed
    And Check that 'SAVE' button is blocked



  Scenario: 07.9999 - Clear all fields
    Given User goes to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then User clicks on the 'User menu'
    And  User clicks on the 'Profile' button
    Then 'Profile' page is opened
    Then Clear all fields 'Profile' page