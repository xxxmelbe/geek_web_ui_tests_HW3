package ru.geekbrains.lesson6.CRMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseView {
    public WebDriver driver;
    public WebDriverWait webDriverWait;
    LoginBaseView LoginPageCRM;
    public static final String BASE_URL = "https://crm.geekbrains.space/";

    public BaseView(WebDriver driver) {
    }

    public void PageCRM(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver, this);
    }
}

