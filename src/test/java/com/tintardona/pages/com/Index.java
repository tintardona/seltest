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
    private int TIMEOUT = 15;
    WebDriverWait wait;

    public Index(WebDriver passeddriver) {
        driver = passeddriver;
        wait = new WebDriverWait(driver, TIMEOUT);
        PageFactory.initElements(driver, this);
        driver.manage().window().maximize();

    }

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[5]/button")
    private WebElement headerLoginButton;

    @FindBy(css = "#sign-in-email")
    private WebElement loginModalEmailInput;

    @FindBy(css = "#sign-in-password")
    private WebElement loginModalPasswordInput;

    @FindBy(css = "body > div.mc-modal.mc-modal--small.authentication-modal.authentication-modal--login > div.mc-modal__viewport > div > div > div > div.mc-background__content-container > div > div > div > form > button")
    private WebElement loginModalLoginButton;

    /*
     * @FindBy(css = "")
     * private WebElement header;
     * 
     * @FindBy(css = "")
     * private WebElement header;
     */

    // methods

    public String clickHeaderLoginButton() {

        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.elementToBeClickable(this.headerLoginButton))
                .click();
        return driver.getCurrentUrl();
    }

    public Boolean loginModalDisplays() {
        return new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOf(this.loginModalEmailInput))
                .isDisplayed();

    }

    public String enterEmail(String email) {
        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOf(loginModalEmailInput)).sendKeys(email);
        return loginModalEmailInput.getText();
    }

    public String enterPassword(String password) {
        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOf(loginModalPasswordInput))
                .sendKeys(password);
        return loginModalPasswordInput.getText();
    }

    public String clickLoginModalLoginButton() {

        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.elementToBeClickable(loginModalLoginButton))
                .click();
        return driver.getCurrentUrl();
    }

}
