/*

Test cases should be reusable as much as possible
Test cases should be modular and specific
Code repetition should be avoided

aap non aap no login

All elements display
    All elements display on masterclass.com/page1
        initialize driver
            browser
            screen
            username
            pswd
            navigate to page
            aap
            non aap
            no login
All content displays correctly manual
    images
    nameplates
    colors
    text auto

functional elements function correctly
         

A. Launch masterclass.com
B. Maximize the window.
C. Scroll to top of page.
    1.The Header Displays.
        a. The Masterclass logo displays.
            i. The masterclass logo is clickable.
            ii. Clicking the logo navigates to masterclass.com.
        b. The All Categories button  displays.
            i. The All categories button is clickable.
            ii. Clicking the All Categories buttton opens the All Categories drop down menu.
                1. The Arts and Entertainment button displays
                    a. The arts and entertainment button is clickable.
                    b. Clicking the Arts and Entertainment button navigates to https://www.masterclass.com/categories#film-tv
                2. The Home & Lifestyle button displays.
                    a. The Home & Lifestyle button is clickable.
                    b. CLicking the Home and Lifestyle button navigates to https://www.masterclass.com/categories#lifestyle
        





*/
package com.tintardona.cases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.tintardona.pages.com.Home;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderTest {

    WebDriver driver;
    Home homepage;

    @Before
    public void init() {

        driver = new ChromeDriver();
        homepage = new Home(driver);
    }

    @Test
    public void isHeaderDisplayed() {

        assertTrue(homepage.isHeaderDisplayed());
        assertTrue(homepage.isMClogoDisplayed());
    }

    /*
     * @Test
     * public void isMCLogoDisplayed() {
     * 
     * assertTrue(homepage.isMClogoDisplayed());
     * }
     */
    @Test
    public void at_work_buttonClick() {

        assertEquals("https://www.masterclass.com/for-business", homepage.at_work_buttonClick());
    }

    @After
    public void close() {
        driver.quit();
    }
}
