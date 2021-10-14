package ru.geekbrains.lesson6.CRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BaseView {
    public ru.geekbrains.lesson6.CRMProject.NavigationMenu NavigationMenu;

    public MainPage(WebDriver driver) {
        super(driver);
        NavigationMenu = new NavigationMenu(driver);
    }

    @FindBy(xpath = "//a[@title='Geekbrains']")
    public WebElement GeekBrainsHomeButton;

    public By GeekBrainsHomeButtonLocator = By.xpath("//a[@title='Geekbrains']");
}