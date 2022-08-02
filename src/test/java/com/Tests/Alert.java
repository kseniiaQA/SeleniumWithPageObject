package com.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alert {
        WebDriver driver = new ChromeDriver();

        public void alert() {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.cssSelector("input[name='emailaddress']")).sendKeys("email@.com");

        }
    }

