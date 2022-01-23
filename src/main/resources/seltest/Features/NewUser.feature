Feature: A New User launches the app
    The app shoUld launch on all platforms and display the New User Home Page for New Users.
    The New User shoUld be able to Navigate the pages.
    The New User should be able to sign up.
    The New User then becomes a Signed Up User.

    Scenario: The New User launches the app
        Given The User is a New User
        When The New User launches the App
        Then The New User Home Page displays


    Scenario: The New User navigates to the Library Page
        Given The New User Home Page displays
        When The New User navigates to the Library Page
        Then the Library Page displays

    Scenario: The New User signs Up
        Given The New User homepage displays
        When The New User signs Up for the app
        Then The New User becomes a Signed Up User