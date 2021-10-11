package ru.geekbrains.lesson6.CRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CreateProjectOrContactPage extends BaseView {

    public CreateProjectOrContactPage(WebDriver driver) {
        super(driver);
    }

    //Test-case 1

    @FindBy(name = "crm_project[name]")
    public WebElement requestDescription;

    public CreateProjectOrContactPage FillDescription(String description) {
        requestDescription.sendKeys(description);
        return this;
    }

    @FindBy(xpath = "//span[text()='Укажите организацию']//ancestor::a")
    public WebElement businessUnitOrgButton;

    @FindBy(xpath = "//input[@class='select2-input select2-focused']")
    public WebElement businessUnitOrgSelect;

    public CreateProjectOrContactPage SelectBusinessUnitOrg(String orgName) {
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader-overlay")));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(businessUnitOrgButton));
        businessUnitOrgButton.click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(businessUnitOrgSelect));
        businessUnitOrgSelect.sendKeys(orgName);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(businessUnitOrgSelect));
        businessUnitOrgSelect.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(name = "crm_project[contactMain]")
    public WebElement ContactSelect;

    public CreateProjectOrContactPage SelectContact(String contact) throws InterruptedException {
        Thread.sleep(10000);
        new Select(ContactSelect).selectByVisibleText(contact);
        return this;
    }

    @FindBy(name = "crm_project[businessUnit]")
    public WebElement businessUnitSelect;

    public CreateProjectOrContactPage SelectBusinessUnit(String businessUnit) {
        new Select(businessUnitSelect).selectByVisibleText(businessUnit);
        return this;
    }

    @FindBy(name = "crm_project[curator]")
    public WebElement CuratorSelect;

    public CreateProjectOrContactPage SelectCurator(String curator) {
        new Select(CuratorSelect).selectByVisibleText(curator);
        return this;
    }

    @FindBy(name = "crm_project[rp]")
    public WebElement projectRPSelect;

    public CreateProjectOrContactPage SelectProjectRP(String projectRP) {
        new Select(projectRPSelect).selectByVisibleText(projectRP);
        return this;
    }

    @FindBy(name = "crm_project[administrator]")
    public WebElement administratorSelect;

    public CreateProjectOrContactPage SelectAdministrator(String administrator) {
        new Select(administratorSelect).selectByVisibleText(administrator);
        return this;
    }

    @FindBy(name = "crm_project[manager]")
    public WebElement managerSelect;

    public CreateProjectOrContactPage SelectManager(String Manager) {
        new Select(managerSelect).selectByVisibleText(Manager);
        return this;
    }

    @FindBy(xpath = "//button[contains(text(),'Сохранить и закрыть')]")
    public WebElement saveAndCloseButton;

    @FindBy(xpath = "//*[text()='Проект сохранен']")
    public WebElement requestSuccess;

    public By requestSuccessLocator = By.xpath("//*[text()='Проект сохранен']");

    public By generalInfoLocator = By.xpath("//*[text()='Основная информация']");

    //Test-case 2

    @FindBy(name = "crm_contact[lastName]")
    public WebElement lastName;

    public CreateProjectOrContactPage FillLastName(String lastNameLastName) throws InterruptedException {
        Thread.sleep(10000);
        lastName.sendKeys(lastNameLastName);
        return this;
    }

    @FindBy(name = "crm_contact[firstName]")
    public WebElement firstName;

    public CreateProjectOrContactPage FillFirstName(String firstNamefirstName) {
        firstName.sendKeys(firstNamefirstName);
        return this;
    }

    @FindBy(name = "crm_contact[jobTitle]")
    public WebElement jobTitle;

    public CreateProjectOrContactPage FillJobTitle(String jobTitlejobTitle) {
        jobTitle.sendKeys(jobTitlejobTitle);
        return this;
    }

    @FindBy(xpath = "//span[text()='Укажите организацию']//ancestor::a")
    public WebElement businessUnitOrgButtonContact;

    @FindBy(xpath = "//input[@class='select2-input select2-focused']")
    public WebElement businessUnitOrgSelectContact;

    public CreateProjectOrContactPage SelectBusinessUnitOrgContact(String orgNameContact) {
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader-overlay")));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(businessUnitOrgButtonContact));
        businessUnitOrgButtonContact.click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(businessUnitOrgSelectContact));
        businessUnitOrgSelectContact.sendKeys(orgNameContact);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(businessUnitOrgSelectContact));
        businessUnitOrgSelectContact.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(xpath = "//button[contains(text(),'Сохранить и закрыть')]")
    public WebElement SaveAndCloseButtonContact;

    @FindBy(xpath = "//*[text()='Контактное лицо сохранено']")
    public WebElement RequestContactSuccess;

    public By RequestContactSuccessLocator = By.xpath("//*[text()='Контактное лицо сохранено']");
}
