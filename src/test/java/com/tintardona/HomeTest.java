package com.tintardona;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.tintardona.Pages.Home;

public class HomeTest {

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
    }

    @After
    public void close() {
        driver.quit();
    }
}
