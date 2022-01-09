package com.tintardona.cases.function;

import com.tintardona.pages.dev.OneLogin;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SSO {

    WebDriver driver;
    OneLogin page;

    @Before
    public void init() {

        driver = new ChromeDriver();
        page = new OneLogin(driver);
    }

    @Test
    public void newUserSignUp() {

        driver.get("https://masterclass.dev");
        driver.manage().addCookie(new Cookie("CF_Authorization",
                "eyJhbGciOiJSUzI1NiIsImtpZCI6Ijk0NmI5MGMwZjg4NTMzZWUwYjQ2ODNlZmMzNDFiY2IwMWE4ZWYyMGIxMjYyOWYxOTY2OWIxYjY5MWEzZGYwODkifQ.eyJhdWQiOlsiMTI1ZjZjYzVmNDhiNTQ2YjNhZDc1MmZlZTg0NjAzNjBiOWQzODMzODM3ZmMxMzY5MzBjNDE3MTY2MTAwZmJkNCJdLCJlbWFpbCI6ImMtdGhvbWFzLmludGFyZG9uYXRvQG1hc3RlcmNsYXNzLmNvbSIsImV4cCI6MTY0MDgzODE3NCwiaWF0IjoxNjQwMjMzMzc0LCJuYmYiOjE2NDAyMzMzNzQsImlzcyI6Imh0dHBzOi8vbWFzdGVyY2xhc3MuY2xvdWRmbGFyZWFjY2Vzcy5jb20iLCJ0eXBlIjoiYXBwIiwiaWRlbnRpdHlfbm9uY2UiOiJSSGJ5OHp6amJjOFA5ejQzIiwic3ViIjoiMWQ1MGNkMmQtYjY3ZC00OGNmLTg0MDAtNmQ2ZmVlMGNmNDUxIiwiY3VzdG9tIjp7ImVtYWlsIjoiYy10aG9tYXMuaW50YXJkb25hdG9AbWFzdGVyY2xhc3MuY29tIn0sImNvdW50cnkiOiJVUyJ9.CvlLpokxqTSKkaD-IdYbpv0NxOsNgQIqnICKau4FVbKyW2xaq5nbHYpCp2ZlnuFoaDIukrqtICwqnPn4Udtvpbav12bnJwIoHtPmZjMjzhYli-fJfLcvmns6WNX9FP_SaThoG0Ztsk-TGtFZflJBSpy6li-cMYZfoyFR5Hi46jGTErj0GgUkaZ8CR-NurRZWd3sUz8wPy-mPsMxnLcowL6rJn-uhBCR3CdqLSpYV_5IY1dnoBhAgDkxDPg8L_Qx1hIT7JArJbPgnxcXWplBnTfn-vxmaB1OCfhkY9JBRk6ntltA2brh3NfAZhnBMXeZuPloBSTEgR6XoqGCNZtLVxA",
                "www.masterclass.dev", "/", null, true));
        // page.login("c-thomas.intardonato@masterclass.com");

    }

}
