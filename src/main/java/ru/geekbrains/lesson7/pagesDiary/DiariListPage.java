package ru.geekbrains.lesson7.pagesDiary;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DiariListPage extends BaseViewDiary {

    public DiariListPage(WebDriver driver) {
        super(driver);
    }

    //для тест-кейса1
    @FindBy(xpath = "//a[contains(@title,'Новая запись')]")
    public WebElement createListButton;

    @Step("Нажимаем на кнопку Новая задача")
    public void CreateList() throws InterruptedException {
        //Thread.sleep(5000);
        createListButton.click();

        webDriverWait.until(
                ExpectedConditions.presenceOfElementLocated(new CreateListDiarytPage(driver).diaryInfoLocator));
    }

}
