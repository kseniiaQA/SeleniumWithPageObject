package com.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    WebDriver driver = new ChromeDriver();
    WebElement loginInput = driver.findElement(By.id("txtPassword"));
    WebElement loginInput2 = driver.findElement(By.id("txtPassword"));
    WebElement enter = driver.findElement(By.id("btnLogin"));

    WebElement performance = driver.findElement(By.id("menu_pim_viewMyDetails"));
    public void login(String login, String login2){
        loginInput.sendKeys(login);
        loginInput2.sendKeys(login2);
        enter.click();


    }

    public void performance(){
 performance.click();
    }
}

