
package com.tintardona.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

    WebDriver driver;
    int TIMEOUT = 10;
    // WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);

    public Driver(String browser) {
        driver = new ChromeDriver();
    }

    // send driver to url, returns the url of the page.
    public String navigateTo(String url) {

        driver.get(url);
        return driver.getCurrentUrl();

    }
}