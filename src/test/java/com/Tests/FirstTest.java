package com.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;
import static org.testng.AssertJUnit.assertEquals;


public class FirstTest {
    WebDriver driver;

    @Test
    public void LaunchApp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }

    @Test
    public void EnterLogin() throws InterruptedException {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();


    }

    @Test
    public void NavigateToMyInfo() throws InterruptedException {
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();

    }

    @Test
    public void VerifyMyInfo() throws InterruptedException {
        driver.findElement(By.id("frmEmpPersonalDetails")).isDisplayed();


    }

    @Test
    public void AssertGoogleSearch() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
        String expectedTitle = "HYR Tutorials - Google Search";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @Test
    public void AssertFacebookErrors() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");

        driver.findElement(By.cssSelector("[data-cookiebanner='accept_button']")).click();

        driver.findElement(By.id("email")).sendKeys("");
        driver.findElement(By.id("pass")).sendKeys("");

        driver.findElement(By.id("loginbutton")).click();
//        Thread.sleep(5000);
        WebElement error = driver.findElement(By.id("error_box"));


        Assert.assertEquals(true, error.isDisplayed());

        WebElement error1 = driver.findElement(By.id("error_box"));
        String ExpectedText = "Wrong credentials\n" +
                "Invalid username or password";
        Assert.assertEquals(ExpectedText, error1.getText());


    }

    @Test
    public void CheckCss() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://devby.io/");
        WebElement element = driver.findElement(By.tagName("a"));
        assertEquals(element.getText(), "Новости");
        wait.until(ExpectedConditions.elementToBeClickable(By.tagName("a")));


    }

    @Test
    public void Actions() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://app.crossbrowsertesting.github.io/drug-and-drop");

        Thread.sleep(2000);
//        driver.findElement(By.name("q")).sendKeys("hi", Keys.ENTER);
//
//        driver.findElement(By.xpath("//a[text()='437 результатов по запросу «hi»']")).click();
//actions

        WebElement element = driver.findElement(By.id("draggable"));
        WebElement element2 = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.moveToElement(element).clickAndHold().moveToElement(element2).release().build().perform();
        Thread.sleep(3000);
        driver.quit();
        actions.dragAndDrop(element, element2).build().perform();
        actions.dragAndDropBy(element, 100, 100).pause(3000).build().perform(); //по оси


    }

    @Test
    public void WaitDisappearance() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://pagination.js.org/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Thread.sleep(7000);

        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='data-container']/ul/li"));
        List<WebElement> pages = driver.findElements(By.xpath("//div[@class='paginationjs-pages']/ul/li"));


        pages.get(2).click();
        wait.until(ExpectedConditions.stalenessOf(elements.get(5)));
        elements = driver.findElements(By.xpath("//div[@class='data-container']/ul/li/"));
        String text = elements.get(5).getText();
        System.out.println(text);
        driver.quit();

    }

//    @Test
//    public void Alert() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("http://pagination.js.org/");
//        //click()
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        Alert alert = wait.until(alertIsPresent());
//        alert.accept();  //нажимаем кнопку ок
//
//
//        Alert prompt = wait.until(alertIsPresent());
//        prompt.sendKeys("Super!");
//        prompt.accept();
//
//        Alert alerts2 = wait.until(alertIsPresent());
//        alerts2.dismiss();  //нажимаем отмена


//    }

    @Test
    public void uploadVideo() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.querySelector('#a').setAttribute('style', 'opacity:1')");
//element.click();
        driver.findElement(By.id("file")).sendKeys("img");


    }

    @Test
    public void AssertsandPageObject() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwjh_a38mJv5AhWvNOwKHQNHBJgQPAgI");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Document");

        LoginPage lp = new LoginPage();
        lp.login("admin", "password");


    }


    @Test
    public void Test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://crtweb.ru/");
        Thread.sleep(4000);


        driver.findElement(By.xpath("//*[contains(text(), 'design')]")).click();
        Thread.sleep(6000);
//        WebElement element = driver.findElement(By.cssSelector("h1[field='tn_text_1646294701303']"));
//        assertEquals("UX/UI дизайн сайтов и сервисов", element.getText());

        driver.findElement(By.xpath("//*[contains(text(), 'Оставить заявку')]")).click();
        driver.findElement(By.cssSelector(".t-popup__close-icon")).click();

    }





}

