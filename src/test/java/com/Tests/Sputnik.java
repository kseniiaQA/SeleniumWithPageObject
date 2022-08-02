package com.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class Sputnik {

    WebDriver driver;

    @Test
    public void RegistrationEmptyFields() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.technojobs.co.uk/software-testing-jobs/europe");
        Thread.sleep(3000);

//        PageObjectRegistration rg = new PageObjectRegistration();
//        rg.registration();

        driver.findElement(By.xpath("//*[contains(text(), 'Register')]")).click();
        driver.findElement(By.cssSelector("#create-cand-acc")).click();

        driver.findElement(By.cssSelector("input[class='apply-btn']")).click();

        WebElement element = driver.findElement(By.cssSelector("span[class='fvce_error']"));
        assertEquals(element.getText(), "You Must Complete This Field");


    }


    @Test
    public void RegistrationAllFieldsFilled() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.technojobs.co.uk/software-testing-jobs/europe");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(text(), 'Register')]")).click();
        driver.findElement(By.cssSelector("#create-cand-acc")).click();
        Thread.sleep(3000);
        PageObjectRegistration fillRegistrationForm;
        Thread.sleep(3000);
        fillRegistrationForm = new PageObjectRegistration();
        String firstName = GenerateRandomName.generateRandomName(9); // 9 Characters long
        fillRegistrationForm.name(firstName);
        fillRegistrationForm.position();
        fillRegistrationForm.value();
        String lastName = GenerateRandomName.generateRandomLastName(9);
        fillRegistrationForm.lastName(lastName);
        fillRegistrationForm.pass("123456");

//        driver.findElement(By.id("Password")).sendKeys("123456");
//        driver.findElement(By.id("Confirm")).sendKeys("123456");
//        driver.findElement(By.id("Email")).sendKeys("123@gmail.com");
//        driver.findElement(By.id("ConfEmail")).sendKeys("123@gmail.com");
//        driver.findElement(By.id("Postcode")).sendKeys("SW1W 0NY");
//        driver.findElement(By.id("JobTitle")).sendKeys("QA");
//        driver.findElement(By.id("VisaStatus")).click();
//        driver.findElement(By.cssSelector("option[value='HASVISA']")).click();
//        driver.findElement(By.id("EmploymentType")).click();
//        driver.findElement(By.cssSelector("option[value='PERMANENT']")).click();
//        driver.findElement(By.cssSelector("input[type='checkbox']")).click();


        driver.findElement(By.cssSelector("input[class='apply-btn']")).click();


    }


    @Test
    public void LoginEmpty() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.technojobs.co.uk/software-testing-jobs/europe");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(text(), 'Login')]")).click();
        driver.findElement(By.id("login-button")).click();


    }

    @Test
    public void LoginIncorrect() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.technojobs.co.uk/software-testing-jobs/europe");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(text(), 'Login')]")).click();
        driver.findElement(By.id("username")).sendKeys("ks@mail.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("login-button")).click();
        WebElement element = driver.findElement(By.tagName("h1"));
        assertEquals(element.getText(), "Login Failed");
    }


    @Test
    public void CreateEmailAlert() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.technojobs.co.uk/software-testing-jobs/europe");

       Alert w = new Alert();
       w.alert();


//        driver.findElement(By.cssSelector("input[name='emailaddress']")).sendKeys("ks@mail.com");



    }
}