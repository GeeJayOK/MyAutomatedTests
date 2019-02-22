Feature: Testing of Main page

  Scenario: 06.0001 Visual check 'Main' page.
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    Then Check that Left panel is present
    And Check that Header is present
    And Check that Right panel is present
    And Check that Middle element is present
    And Check that Footer is present

  Scenario: 06.0002 Visual check 'Left panel'
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    And Check that 'User menu' is present
    And Check that 'Room-list' is present
    And Check that 'Direct-list' is present
    And Check that 'Navigation panel' is present

  Scenario: 06.0003 Visual check 'User menu'
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    And Check that 'Team name' is present
    And Check that 'Avatar' is present
    And Check that 'Username' is present
    And Check that 'Bell' is present

  Scenario: 06.0004 Visual check 'Room-list'
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    And Check that 'ROOMS' is present
    And Check that 'ADD ROOM' is present

  Scenario: 06.0005 Visual check 'Direct-list'
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    And Check that 'Direct' is present
    And Check that 'Add Direct' is present
    And Check that 'General' room is present

  Scenario: 06.0006 Visual check 'Navigation panel'
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    And Check that 'Search navigation panel' is present
    And Check that 'Close' button nav panel is present

  Scenario: 06.0007 Visual check 'Header'
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    And Check that 'Channel-title' is present
    And Check that 'Header control' is present

  Scenario: 06.0008 Visual check 'Right panel'
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    And Check that 'Room members' button is present
    And Check that 'Pinned messages' button is present
    And Check that 'Starred messages' button is present
    And Check that 'Uploaded files' button is present
    And Check that 'Room settings' is present

  Scenario: 06.0010 Input text field (visual check)
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    And Check that 'Input text' field is present
    And Check that 'Upload' button is present
    And Check that 'Stickers' button is present
    And Check that 'Emoji' button is present

  Scenario: 07.0001 Check drop-down user menu
    Given User go to the "https://192.168.217.23/index.html#/login" page
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
    Given User go to the "https://192.168.217.23/index.html#/login" page
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

