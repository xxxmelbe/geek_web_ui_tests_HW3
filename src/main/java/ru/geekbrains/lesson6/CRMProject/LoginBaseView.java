package ru.geekbrains.lesson6.CRMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginBaseView extends BaseView {
    @FindBy(id = "prependedInput")
    public WebElement inputLogin;

    @FindBy(id = "prependedInput2")
    public WebElement inputPassword;

    @FindBy(id = "_submit")
    public WebElement buttonSubmit;

    public LoginBaseView(WebDriver driver) {
        super(driver);
    }

    public LoginBaseView fillInputLogin(String login) {
        inputLogin.sendKeys(login);
        return this;
    }

    public LoginBaseView fillInputPassword(String password) {
        inputPassword.sendKeys(password);
        return this;
    }

    public MainPage submitLogin() {
        buttonSubmit.click();
        return new MainPage(driver);
    }

    public MainPage login(String login, String password) {
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonSubmit.click();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(new MainPage(driver).GeekBrainsHomeButtonLocator));
        return new MainPage(driver);
    }
}
