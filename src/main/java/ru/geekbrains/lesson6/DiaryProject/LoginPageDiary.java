package ru.geekbrains.lesson6.DiaryProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageDiary extends BaseView {
    @FindBy(id = "loginform-username")
    public WebElement inputLogin;

    @FindBy(id = "loginform-password")
    public WebElement inputPassword;

    @FindBy(id = "login_btn")
    public WebElement buttonSubmit;

    public LoginPageDiary(WebDriver driver) {
        super(driver);
    }

    public LoginPageDiary fillInputLogin(String login) throws InterruptedException {
        Thread.sleep(120000);
        inputLogin.sendKeys(login);
        return this;
    }

    public LoginPageDiary fillInputPassword(String password) {
        inputPassword.sendKeys(password);
        return this;
    }

    public MainPage submitLogin() throws InterruptedException {
        Thread.sleep(10000);
        buttonSubmit.click();
        return new MainPage(driver);
    }

    public MainPage login(String login, String password) {
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonSubmit.click();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(new MainPage(driver).DiaryHomeButtonLocator));
        return new MainPage(driver);
    }
}


