package com.tintardona.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewUser {

    @Given("The User is a New User")
    public void The_User_is_a_New_User(){
        System.out.println("The User is a new user");
        
    }

    @When("The New User launches the App")
    public void The_New_User_launches_the_App(){
        System.out.println("The new user launches the app");
        //Application.launch(user);

    }

    @Then("The New User Home Page displays")
    public void The_New_User_Home_Page_displays(){
        System.out.println("The New User Home Page displays");
    }


    // @Then("The New User navigates to the Library Page")
    // public void The_New_User_navigates_to_the_Library_Page(){

    //     System.out.println("the new user navigates to the library page");
    //     //Browser.gotopage(Page LibraryPage.url);

    // }

    // @Then("The New User signs Up")
    // public void The_New_User_signs_Up(){

    //     System.out.println("The new user signe up");
    //     //User.signUp();

    // }
}