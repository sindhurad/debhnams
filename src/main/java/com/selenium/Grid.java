package com.selenium;
import java.net.MalformedURLException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid {
    DesiredCapabilities cap = null;

    @Test
    public void Grid(String Br) throws MalformedURLException {
        if (Br.equalsIgnoreCase("firefox")) {
            cap = new DesiredCapabilities();
            cap.setBrowserName("firefox");
            cap.setPlatform(Platform.LINUX);
        } else if (Br.equalsIgnoreCase("chrome")) {
            cap = new DesiredCapabilities();
            cap.setBrowserName("chrome");
            cap.setPlatform(Platform.ANY);
            RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.20:4444/wd/hub"), cap);
            driver.get("http://www.gggggggggmail.com");

        }
    }
}
