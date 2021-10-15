package ru.geekbrains.lesson6.CRMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.lesson6.CRMProject.BaseView;

import java.util.List;

public class NavigationMenu extends BaseView {

    public NavigationMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[@class='nav nav-multilevel main-menu']/li")
    public List<WebElement> NavigationMenuItems;

    public void openNavigationMenuItem(String menuName) {
        Actions actions = new Actions(driver);
        actions.moveToElement(
                        NavigationMenuItems.stream().filter(element -> element.getText().equals(menuName)).findFirst().get())
                .perform();
    }
}
