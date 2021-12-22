/*Test Case: Login with valid credentials.
Type: Functionality.

PRE
1. Choose Browser
2. Configure Browser
3. Open Browser
4. launch masterclass.com       

Steps
1. Navigate to masterclass.com  ER: The page loads
5. Click login button           ER: The login modal displays
6. Enter valid email            ER: The email input element contains valid email string
7. Enter valid password         ER: The password input element contains valid password
8. Click login button           ER: The User is dropped on logged in home page.

POST
1. Close Browser

*/

package com.tintardona.cases.function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.tintardona.lib.Driver;
import com.tintardona.pages.com.Index;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewUserSignUp {
    WebDriver driver;
    Index page;

    @Before
    public void init() {

        driver = new ChromeDriver();
        page = new Index(driver);
        String[] cookies = driver.manage().getCookies();
        System.out.println(cookies);
    }

    @Test
    public void newUserSignUp() {

        String url = "https://www.masterclass.com";

        String email = "c-thomas.intardonato+121921-2@masterclass.com";
        String psswd = "aaaa";
        driver.get(url);

        // assertEquals(url, driver.navigateTo());
        page.clickHeaderLoginButton();
        assertTrue(page.loginModalDisplays());
        page.clickLoginModalSignUpButton();
        page.enterSignUpEmail(email);
        page.enterSignUpPassword(psswd);
        page.clickSignUpModalCreateAccountButton();
        page.clickHeaderHamburgerMenu();
        assertTrue(page.headerHamburgerMenuSignOutAnchorDisplays());
        page.clickheaderHamburgerMenuSignOutAnchor();

        /*
         * Navigate to masterclass.com ER: The page loads
         * 5. Click login button ER: The login modal displays
         * 6. Enter valid email ER: The email input element contains valid email string
         * 7. Enter valid password ER: The password input element contains valid
         * password
         * 8. Click login button ER: The User is dropped on logged in home page.
         */

    }

}
