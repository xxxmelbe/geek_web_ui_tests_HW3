package ru.geekbrains.lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;



public class CreateAutoProject {
    private static WebDriver driver;
    private static final String LOGIN_PAGE_URL = "https://time-master.ru/login.aspx";
    private static WebDriverWait webDriverWait;

    @BeforeSuite
    void setupDataBase() {
        System.out.println("Before suit setup database");
    }

    @BeforeTest
    void setUp() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    void setUpBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, 5);
        driver.get(LOGIN_PAGE_URL);
        login();
    }

    @Test
    void timeMasterTestCase1Login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement authorization = driver.findElement(By.xpath("//b[text()='События на весь день']"));
        assertThat(authorization.getText(), containsString("События на весь день"));

        driver.findElement(By.id("newTaskName")).sendKeys("test1");

        driver.findElement(By.id("addTask")).click();

        WebElement saveProject = driver.findElement(By.xpath("//*[text()='test1']"));
        assertThat(saveProject.getText(), containsString("test1"));

        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='test1']")));
        driver.findElement(By.xpath("//*[text()='test1']"));
    }

    private void assertThat(String text, Object события_на_весь_день) {
    }

    private Object containsString(String события_на_весь_день) {
        return null;
    }

    private static void login() throws InterruptedException {
        driver.get(LOGIN_PAGE_URL);

        //Авторизация на сайте с помощью кнопок
        driver.findElement(By.id("authUsername")).sendKeys("koluivan@yandex.ru");
        driver.findElement(By.id("authPassword")).sendKeys("TestIvan1");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//b[text()='События на весь день']")));
        driver.findElement(By.xpath("//b[text()='События на весь день']"));

        Thread.sleep(50000);
        driver.close();
    }

    @AfterMethod
    void closeBrowser() {
        driver.quit();
    }
}
