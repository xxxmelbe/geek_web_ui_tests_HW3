package ru.geekbrains.lesson6.CRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.lesson6.CRMProject.BaseView;
import ru.geekbrains.lesson6.CRMProject.CreateProjectOrContactPage;

public class ProjectPage extends BaseView {

    public ProjectPage(WebDriver driver) {
        super(driver);
    }

    //Test-case 1
    @FindBy(xpath = "//a[text()='Создать проект']")
    public WebElement createProjectButton;

    public void CreateProject() throws InterruptedException {
        Thread.sleep(10000);
        createProjectButton.click();

        webDriverWait.until(
                ExpectedConditions.presenceOfElementLocated(new CreateProjectOrContactPage(driver).generalInfoLocator));
    }

    public By createProjectButtonLocator = By.xpath("//a[text()='Создать проект']");


    //Test-case 2
    @FindBy(xpath = "//a[text()='Создать контактное лицо']")
    public WebElement createContactButton;

    public void CreateContact() {
        createContactButton.click();
        webDriverWait.until(
                ExpectedConditions.presenceOfElementLocated(new CreateProjectOrContactPage(driver).generalInfoLocator));
    }

    public By createContactButtonLocator = By.xpath("//a[text()='Создать контактное лицо']");

}
