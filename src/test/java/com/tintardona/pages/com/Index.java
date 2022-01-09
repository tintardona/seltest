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

    @FindBy(css = "button[data-ba ='login-button']")
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

    @FindBy(xpath = "/html/body/div[13]/div[2]/div/div/div/div[2]/div/div/div/form/div[1]/div/div[2]/div/input")
    private WebElement signUpModalEmailInput;

    @FindBy(css = "#password")
    private WebElement signUpModalPasswordInput;

    @FindBy(css = "body > div.mc-modal.mc-modal--small.authentication-modal.authentication-modal--register > div.mc-modal__viewport > div > div > div > div.mc-background__content-container > div > div > div > form > button")
    private WebElement signUpModalCreateAccountButton;

    @FindBy(css = "body > div.mc-modal.mc-modal--small.authentication-modal.authentication-modal--register > div.mc-modal__viewport > div > div > div > div.mc-background__content-container > div > div")
    private WebElement signUpModal;

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

        new WebDriverWait(driver, TIMEOUT)
                .until(ExpectedConditions.elementToBeClickable(signUpModalCreateAccountButton))
                .click();
        return driver.getCurrentUrl();
    }

    public String clickLoginModalSignUpButton() {
        // headerHamburgerMenuDisplays();

        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.elementToBeClickable(loginModalSignUpButton))
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

        // new WebDriverWait(driver,
        // TIMEOUT).until(ExpectedConditions.elementToBeClickable(headerLoginButton))
        headerLoginButton.click();
        return driver.getCurrentUrl();
    }

    public Boolean loginModalDisplays() {
        return new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOf(loginModal))
                .isDisplayed();

    }

    public Boolean signInModalDisplays() {
        return new WebDriverWait(driver, 25).until(ExpectedConditions.visibilityOf(signUpModal))
                .isDisplayed();

    }

    public String clickheaderHamburgerMenuSignOutAnchor() {
        new WebDriverWait(driver, TIMEOUT)
                .until(ExpectedConditions.elementToBeClickable(headerHamburgerMenuSignOutAnchor))
                .click();
        return driver.getCurrentUrl();
    }

    public String enterLoginEmail(String email) {

        signUpModalEmailInput.sendKeys(email);
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

    public String enterSignUpEmail(String email1) {

        signUpModalEmailInput.sendKeys(email1);
        return signUpModalEmailInput.getText();
    }

    public String enterSignUpPassword(String password) {

        signUpModalPasswordInput.sendKeys(password);
        return signUpModalPasswordInput.getText();
    }

}
