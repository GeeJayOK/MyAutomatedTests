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
    And Check that '' is present
    And Check that '' is present
    And Check that '' is present

  Scenario: 06.0007 Visual check 'Header container'
    Given User go to the "https://192.168.217.23/index.html#/login" page
    Then User is on the Authorization page
    When User perform login with "ya.getalo@aimprosoft.com" email and "qk180t56732i" password in the "login" and "password"
    And User clicks on the SIGN IN button
    And Wait for loader
    Then Authorization is successful
    And Check that '' is present
    And Check that '' is present
    And Check that '' is present






    #Then User clicks on the 'User menu'