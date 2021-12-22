package com.tintardona.pages.com;

import java.util.Map;

import com.tintardona.lib.BasePage;
import com.tintardona.lib.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Index {

    private Map<String, String> data;
    private WebDriver driver;
    private int TIMEOUT = 20;
    WebDriverWait wait;

    public Index(WebDriver passeddriver) {
        driver = passeddriver;
        wait = new WebDriverWait(driver, TIMEOUT);
        PageFactory.initElements(driver, this);
        driver.manage().window().maximize();

    }

    @FindBy(css = "body > div.mc-page__header > div > div > div > div > div:nth-child(5) > button")
    private WebElement headerLoginButton;

    @FindBy(css = "#sign-in-email")
    private WebElement loginModalEmailInput;

    @FindBy(css = "#sign-in-password")
    private WebElement loginModalPasswordInput;

    @FindBy(css = "body > div.mc-modal.mc-modal--small.authentication-modal.authentication-modal--login > div.mc-modal__viewport > div > div > div > div.mc-background__content-container > div > div > div > form > button")
    private WebElement loginModalLoginButton;

    @FindBy(css = "body > div.mc-modal.mc-modal--small.authentication-modal.authentication-modal--login > div.mc-modal__viewport > div > div > div > div.mc-background__content-container")
    private WebElement loginModal;

    @FindBy(css = "#nav_more_menu_open > li:nth-child(5) > a")
    private WebElement headerHamburgerMenuSignOutAnchor;

    @FindBy(css = "#nav_more_menu")
    private WebElement headerHamburgerMenu;

    @FindBy(css = "body > div.mc-modal.mc-modal--small.authentication-modal.authentication-modal--login > div.mc-modal__viewport > div > div > div > div.mc-background__content-container > div > div > div > p:nth-child(7) > a")
    private WebElement loginModalSignUpButton;

    @FindBy(css = "#sign-in-email")
    private WebElement signUpModalEmailInput;

    @FindBy(css = "#password")
    private WebElement signUpModalPasswordInput;

    @FindBy(css = "body > div.mc-modal.mc-modal--small.authentication-modal.authentication-modal--register > div.mc-modal__viewport > div > div > div > div.mc-background__content-container > div > div > div > form > button")
    private WebElement signUpModalCreateAccountButton;

    /*
     * @FindBy(css = "")
     * private WebElement header;
     * 
     * @FindBy(css = "")
     * private WebElement header;
     */

    // methods

    public Boolean headerLoginButtonDisplays() {
        return new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.elementToBeClickable(headerLoginButton))
                .isDisplayed();

    }

    public Boolean headerHamburgerMenuDisplays() {
        return new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOf(headerHamburgerMenu))
                .isDisplayed();

    }

    public Boolean headerHamburgerMenuSignOutAnchorDisplays() {
        return new WebDriverWait(driver, TIMEOUT)
                .until(ExpectedConditions.visibilityOf(headerHamburgerMenuSignOutAnchor))
                .isDisplayed();

    }

    public String clickSignUpModalCreateAccountButton() {
        // headerHamburgerMenuDisplays();

        wait.until(ExpectedConditions.elementToBeClickable(signUpModalCreateAccountButton))
                .click();
        return driver.getCurrentUrl();
    }

    public String clickLoginModalSignUpButton() {
        // headerHamburgerMenuDisplays();

        wait.until(ExpectedConditions.elementToBeClickable(loginModalSignUpButton))
                .click();
        return driver.getCurrentUrl();
    }

    public String clickHeaderHamburgerMenu() {
        headerHamburgerMenuDisplays();

        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.elementToBeClickable(headerHamburgerMenu))
                .click();
        return driver.getCurrentUrl();
    }

    public String clickHeaderLoginButton() {
        // headerLoginButtonDisplays();

        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.elementToBeClickable(this.headerLoginButton))
                .click();
        return driver.getCurrentUrl();
    }

    public Boolean loginModalDisplays() {
        return new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOf(this.loginModal))
                .isDisplayed();

    }

    public String clickheaderHamburgerMenuSignOutAnchor() {
        new WebDriverWait(driver, TIMEOUT)
                .until(ExpectedConditions.elementToBeClickable(headerHamburgerMenuSignOutAnchor))
                .click();
        return driver.getCurrentUrl();
    }

    public String enterLoginEmail(String email) {
        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOf(loginModalEmailInput)).sendKeys(email);
        return loginModalEmailInput.getText();
    }

    public String enterLoginPassword(String password) {
        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOf(loginModalPasswordInput))
                .sendKeys(password);
        return loginModalPasswordInput.getText();
    }

    public String clickLoginModalLoginButton() {

        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.elementToBeClickable(loginModalLoginButton))
                .click();
        return driver.getCurrentUrl();
    }

    public void enterSignUpEmail(String email) {
        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOf(signUpModalEmailInput))
                .sendKeys(email);
        // return signUpModalEmailInput.getText();
    }

    public String enterSignUpPassword(String password) {
        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOf(signUpModalPasswordInput))
                .sendKeys(password);
        return signUpModalPasswordInput.getText();
    }

}
