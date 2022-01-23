package com.tintardona;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AppiumSession {

    String sessionid;
    DesiredCapabilities capabilities;
    RemoteWebDriver driver;

    public RemoteWebDriver Session(){
        return driver;

    }
    
}
