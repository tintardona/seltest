package com.tintardona.pom.masterclass.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {

    private WebDriver driver; // WebDriver Object

    private int TIMEOUT = 10; // number of seconds before time out to poll for elements.

    private static String PAGE_URL = "https://www.masterclass.com"; // page URL

    // private WebDriverWait wait = new WebDriverWait(driver, TIMEOUT); // Explicit
    // wait object used to poll until elements
    // are available. body > div.mc-page__header > div > div > div > div >
    // div.col-auto.mc-px-0 > a

    // Locators

    @FindBy(css = "body > div.mc-page__header")
    private WebElement header;

    @FindBy(css = "body > div.mc-page__header > div > div > div > div > div.col-auto.d-flex.align-items-center > a")
    private WebElement mclogo;

    @FindBy(css = "body > div.mc-page__header > div > div > div > div > div.col-auto.mc-px-0 > a")
    private WebElement at_work_button;

    // Constructor
    public Home(WebDriver chosenDriver) {

        this.driver = chosenDriver;
        driver.get(PAGE_URL);
        // wait = new WebDriverWait(driver, TIMEOUT);
        PageFactory.initElements(driver, this);// Initialise Elements
    }

    public Boolean isHeaderDisplayed() {

        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOf(this.header));
        System.out.println("The header is displayed: " + this.header.isDisplayed());
        return this.header.isDisplayed();

    }

    public Boolean isMClogoDisplayed() {

        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOf(this.mclogo));
        System.out.println("The mclogo is displayed: " + this.header.isDisplayed());
        return this.header.isDisplayed();
    }

    // expected url = masterclass.com
    public String mcLogoClick() {

        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.elementToBeClickable(this.mclogo)).click();
        System.out.println("The mclogo is clickable: ");
        return this.driver.getCurrentUrl();
    }

    public String at_work_buttonClick() {

        System.out.println("The At Work button is clickable: ");
        // new WebDriverWait(driver,
        // TIMEOUT).until(ExpectedConditions.titleIs("MasterClass"));
        String originalWindow = driver.getWindowHandle();

        // Check we don't have other windows open already
        assert driver.getWindowHandles().size() == 1;
        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.elementToBeClickable(at_work_button)).click();
        System.out.println("The At Work button is clicked ");
        // Loop through until we find a new window handle
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        System.out.println("New url is: " + driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }
}