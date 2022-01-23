package com.tintardona.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class NewUser {

    @Given("The User is a New User")
    public void The_User_is_a_New_User(){
        User
        
    }

    @when("The New User launches the App")
    public void The_New_User_launches_the_App(){
        
        Application.launch(user);

    }


    @Then("The New User navigates to the Library Page")
    public void The_New_User_navigates_to_the_Library_Page(){

        Browser.gotopage(Page LibraryPage.url);

    }

    @Then("The New User signs Up")
    public void The_New_User_signs_Up(){

        User.signUp();

    }
}