package ru.geekbrains.lesson6.DiaryProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseView {
    public MainPage (WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[text()='Популярное']")
    public WebElement geekBrainsHomeButton;

    public By DiaryHomeButtonLocator = By.xpath("//h1[text()='Популярное']");


}

