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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.tintardona.lib.Driver;
import com.tintardona.pages.com.Index;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;

public class NewUserSignUp {
    WebDriver driver;
    Index page;

    public String generateEmail() {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyymmddhhmmss");
        String strDate = "c-thomas.intardonato+" + dateFormat.format(date) + "@masterclass.com";
        return strDate;
    }

    @Before
    public void init() {

        driver = new ChromeDriver();
        page = new Index(driver);
    }

    @Test
    public void newUserSignUp() {

        String url = "https://www.masterclass.dev";

        String email = generateEmail();
        String psswd = "aaaaddddddddddddd";
        driver.manage().deleteAllCookies();
        driver.get(url);

        // create file named Cookies to store Login Information

        File file = new File("Cookies.data");
        try {
            // Delete old file if exists
            file.delete();
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file);
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);
            // loop for getting the cookie information

            // loop for getting the cookie information
            for (Cookie ck : driver.manage().getCookies()) {
                Bwrite.write((ck.getName() + ";\t" + ck.getValue() + ";\t" + ck.getDomain() +
                        ";\t" + ck.getPath() + ";"
                        + ck.getExpiry() + ";\t" + ck.isSecure()));
                Bwrite.newLine();
            }
            Bwrite.close();
            fileWrite.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        /*
         * // assertEquals(url, driver.navigateTo());
         * page.clickHeaderLoginButton();
         * // assertTrue(page.loginModalDisplays());
         * page.clickLoginModalSignUpButton();
         * page.enterSignUpPassword(psswd);
         * page.enterSignUpEmail(email);
         * 
         * // page.clickSignUpModalCreateAccountButton();
         * // page.clickHeaderHamburgerMenu();
         * // assertTrue(page.headerHamburgerMenuSignOutAnchorDisplays());
         * // page.clickheaderHamburgerMenuSignOutAnchor();
         * // driver.close();
         * /*
         * Navigate to masterclass.com ER: The page loads
         * 5. Click login button ER: The login modal displays
         * 6. Enter valid email ER: The email input element contains valid email string
         * 7. Enter valid password ER: The password input element contains valid
         * password
         * 8. Click login button ER: The User is dropped on logged in home page.
         */

    }

}
