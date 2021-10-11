package ru.geekbrains.lesson6.CRMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.lesson6.CRMProject.BaseView;
import ru.geekbrains.lesson6.CRMProject.ProjectPage;

public class ProjectPageSubMenu extends BaseView {

    public ProjectPageSubMenu(WebDriver driver) {
        super(driver);
    }

    //Test-case 1
    @FindBy(xpath = "//span[text()='Мои проекты']")
    public WebElement myProjectButton;


    public void createProject() throws InterruptedException {
        myProjectButton.click();
        webDriverWait.until(
                ExpectedConditions.presenceOfElementLocated(new ProjectPage(driver).createProjectButtonLocator));
    }

    //Test-case 2
    @FindBy(xpath = "//span[text()='Контактные лица']")
    public WebElement myContactButton;


    public void createContact() {
        myContactButton.click();
        webDriverWait.until(
                ExpectedConditions.presenceOfElementLocated(new ProjectPage(driver).createContactButtonLocator));
    }
}

