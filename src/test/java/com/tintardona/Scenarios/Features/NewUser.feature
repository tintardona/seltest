Feature: A new user launches the app
    The app should launch on all platforms and display the new user home page for new users.
    The new user should be able to navigate the pages.
    The new user should be able to sign up.
    The new user then becomes a signed up user.

    Scenario: The new user launches the app
        Given The user is a New User
        When The New User launches the App
        Then The New User Home Page displays


    Scenario: The new user navigates to the Library Page
        Given The New User Home Page displays
        When The New User navigates to the Library Page
        Then the Library Page displays

    Scenario: The new user signs up
        Given The New user homepage displays
        When The new user signs up for the app
        Then The new user becomes a Signed In User