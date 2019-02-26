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