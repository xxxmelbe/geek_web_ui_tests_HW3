package ru.geekbrains.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomeWork_3_Diary {

    private static WebDriver driver;
    private static final String LOGIN_PAGE_URL = "https://diary.ru/user/login";

        public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            login();

            //Новая запись
            Thread.sleep(5000);
            driver.findElement(By.xpath("//a[contains(@title,'Новая запись')]")).click();
            //поле Заголовок
            driver.findElement(By.name("My first diary")).sendKeys("Hello Diary");
            //поле Сообщение
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'message_ifr')]")));
            driver.findElement(By.xpath("//body")).sendKeys("Hello Diary");
            driver.switchTo().defaultContent();
            //Опубликовать
            driver.findElement(By.xpath("//input[contains(@name,'rewrite')]")).click();

            Thread.sleep(10000);

            driver.quit();
        }
        private static void login() {
            driver.findElement(By.id("loginform-username")).sendKeys("TestMarina23");
            driver.findElement(By.id("loginform-password")).sendKeys("TestMarina23");
        }
    }

