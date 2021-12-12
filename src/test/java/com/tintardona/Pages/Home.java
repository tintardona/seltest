package com.tintardona.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Home {
    private WebDriver driver;

    // Page URL
    private static String PAGE_URL = "https://www.masterclass.com";

    // Locators

    // Apply as Developer Button
    @FindBy(css = "body > div.mc-page__header")
    private WebElement header;

    // Constructor
    public Home(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
        // Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public Boolean isHeaderDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, 1);
        wait.until(ExpectedConditions.visibilityOf(this.header));
        Boolean headerIsDisplayed = this.header.isDisplayed();
        System.out.println("The header is displayed: " + headerIsDisplayed);
        return true;

    }
}