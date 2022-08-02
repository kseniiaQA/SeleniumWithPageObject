package com.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectRegistration<SignUpPage> {

    WebDriver driver = new ChromeDriver();

   By position = By.cssSelector("select[name='Title']");
   By value = By.cssSelector("option[value='Mr']");
   By name = By.id("FirstName");
   By lastName = By.id("LastName");
   By pass = By.id("Password");
   By confirm = By.id("Confirm");
   By email = By.id("Email");
   By confemail = By.id("ConfEmail");
   By postcode = By.id("Postcode");
   By job = By.id("JobTitle");
   By visa = By.id("VisaStatus");
   By valueVisa = By.cssSelector("option[value='HASVISA']");
   By type = By.id("EmploymentType");
   By living = By.cssSelector("option[value='PERMANENT']");
  By checkbox = By.cssSelector("input[type='checkbox']");





    public void fillRegistrationForm(String arg1) throws InterruptedException {
        driver.findElement(confirm).sendKeys(arg1);
        driver.findElement(email).sendKeys(arg1);
        driver.findElement(confemail).sendKeys(arg1);
        driver.findElement(postcode).sendKeys(arg1);
        driver.findElement(job).sendKeys(arg1);
        driver.findElement(visa).click();
        driver.findElement(valueVisa).click();
        driver.findElement(type).click();
        driver.findElement(living).click();
        driver.findElement(checkbox).click();

    }

    public void name(String arg1) {

        driver.findElement(name).sendKeys(arg1);

    }
    public void position() {
        driver.findElement(position).click();
    }

    public void value() {
        driver.findElement(value).click();
    }

    public void lastName(String arg1) {
        driver.findElement(lastName).sendKeys(arg1);
    }

    public void pass(String arg1) {
        driver.findElement(pass).sendKeys(arg1);
    }
}

