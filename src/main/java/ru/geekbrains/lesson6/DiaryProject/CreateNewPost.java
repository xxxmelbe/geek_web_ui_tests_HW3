package ru.geekbrains.lesson6.DiaryProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewPost extends BaseView {

    public CreateNewPost (WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "BlogsPosts[title]")
    public WebElement headDescription;

    public CreateNewPost fillHead(String description) {
        headDescription.sendKeys(description);
        return this;
    }

    @FindBy(xpath = "//iframe[contains(@id,'message_ifr')]")
    public WebElement messageDescription;

    public CreateNewPost fillMessage(String descriptionMes) {
        messageDescription.sendKeys(descriptionMes);
        return this;
    }

    @FindBy(xpath = "//input[contains(@name,'rewrite')]")
    public WebElement saveAndCloseButtonList;

    @FindBy(xpath = "//*[text()='test1']")
    public WebElement requestListSuccess;

    public By requestListSuccessLocator = By.xpath("//*[text()='test1']");

    public By diaryInfoLocator = By.xpath("//*[text()='Заголовок:']");

}

