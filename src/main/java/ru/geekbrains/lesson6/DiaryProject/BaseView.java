package ru.geekbrains.lesson6.DiaryProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseView {
    public WebDriver driver;
    public WebDriverWait webDriverWait;
    public static final String BASE_URL_DIARY = "https://diary.ru/user/login";

    public BaseView(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, 5);
        PageFactory.initElements(driver, this);
    }
}