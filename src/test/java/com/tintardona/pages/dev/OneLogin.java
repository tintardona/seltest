package com.tintardona.pages.dev;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.security.Key;
import java.util.Map;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OneLogin {

    private Map<String, String> data;
    private WebDriver driver;
    private int TIMEOUT = 20;

    public OneLogin(WebDriver passeddriver) {
        driver = passeddriver;
        PageFactory.initElements(driver, this);
        driver.manage().window().maximize();

    }

    @FindBy(id = "username")
    private WebElement oneLoginEmailInput;

    @FindBy(id = "password")
    private WebElement oneLoginPasswordInput;

    @FindBy(id = "#root > div > div.sc-eilVRo.cjOIBd > div.withConditionalBorder.sc-eerKOB.fSmzsB > div.sc-dymIpo.jqkhbb > form > div > div:nth-child(3) > div > button")
    private WebElement oneLoginEmailInputButton;

    public void getCookies() {
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

    }

    public void login(String email) {
        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOf(oneLoginEmailInput)).sendKeys(email,
                Keys.ENTER);
        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOf(oneLoginPasswordInput)).sendKeys(
                "15s715S715",
                Keys.ENTER);
        new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.urlMatches("https://www.masterclass.dev"));
        // driver.manage().addCookie("CF_Authorization",
        // "eyJhbGciOiJSUzI1NiIsImtpZCI6Ijk0NmI5MGMwZjg4NTMzZWUwYjQ2ODNlZmMzNDFiY2IwMWE4ZWYyMGIxMjYyOWYxOTY2OWIxYjY5MWEzZGYwODkifQ.eyJhdWQiOlsiMTI1ZjZjYzVmNDhiNTQ2YjNhZDc1MmZlZTg0NjAzNjBiOWQzODMzODM3ZmMxMzY5MzBjNDE3MTY2MTAwZmJkNCJdLCJlbWFpbCI6ImMtdGhvbWFzLmludGFyZG9uYXRvQG1hc3RlcmNsYXNzLmNvbSIsImV4cCI6MTY0MDgzODE3NCwiaWF0IjoxNjQwMjMzMzc0LCJuYmYiOjE2NDAyMzMzNzQsImlzcyI6Imh0dHBzOi8vbWFzdGVyY2xhc3MuY2xvdWRmbGFyZWFjY2Vzcy5jb20iLCJ0eXBlIjoiYXBwIiwiaWRlbnRpdHlfbm9uY2UiOiJSSGJ5OHp6amJjOFA5ejQzIiwic3ViIjoiMWQ1MGNkMmQtYjY3ZC00OGNmLTg0MDAtNmQ2ZmVlMGNmNDUxIiwiY3VzdG9tIjp7ImVtYWlsIjoiYy10aG9tYXMuaW50YXJkb25hdG9AbWFzdGVyY2xhc3MuY29tIn0sImNvdW50cnkiOiJVUyJ9.CvlLpokxqTSKkaD-IdYbpv0NxOsNgQIqnICKau4FVbKyW2xaq5nbHYpCp2ZlnuFoaDIukrqtICwqnPn4Udtvpbav12bnJwIoHtPmZjMjzhYli-fJfLcvmns6WNX9FP_SaThoG0Ztsk-TGtFZflJBSpy6li-cMYZfoyFR5Hi46jGTErj0GgUkaZ8CR-NurRZWd3sUz8wPy-mPsMxnLcowL6rJn-uhBCR3CdqLSpYV_5IY1dnoBhAgDkxDPg8L_Qx1hIT7JArJbPgnxcXWplBnTfn-vxmaB1OCfhkY9JBRk6ntltA2brh3NfAZhnBMXeZuPloBSTEgR6XoqGCNZtLVxA",
        // "www.masterclass.dev", "/", null, true);
    }

}
