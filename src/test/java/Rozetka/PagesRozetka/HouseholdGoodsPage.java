package Rozetka.PagesRozetka;

import BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HouseholdGoodsPage extends BasePage {
    public HouseholdGoodsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickHomeTextilesBtn() {
        return getElementByXpath("//a[@title='Домашний текстиль' and @class='tile-cats__heading ng-star-inserted']");
    }

    public boolean checkURLHouseholdGoods() {
        return driver.getCurrentUrl().contains("home_textile");
    }

    public WebElement clickBlancetsBtn() {
        return getElementByXpath("//a[@title='Одеяла']");
    }

    public WebElement clickDormeoBlancetsBtn() {
        return getElementByXpath("//a[@data-id='Dormeo']");
    }

    public boolean checkURlDormeoBlancetsList() {
        return driver.getCurrentUrl().contains("producer=dormeo");
    }
}
