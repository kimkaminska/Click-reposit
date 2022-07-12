package Rozetka.PagesRozetka;

import BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HouseholdGoodsPage extends BasePage {
    public HouseholdGoodsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getHomeTextilesBtn() {
        return getElementByXpath("//a[@title='Домашний текстиль' and @class='tile-cats__heading ng-star-inserted']");
    }

    public boolean checkURLHouseholdGoods() {
        return driver.getCurrentUrl().contains("home_textile");
    }

    public WebElement getBlancetsBtn() {
        return getElementByXpath("//a[@title='Одеяла']");
    }

    public WebElement getDormeoBlancetsBtn() {
        return getElementByXpath("//a[@data-id='Dormeo']");
    }

    public boolean checkURlDormeoBlancetsList() {
        return driver.getCurrentUrl().contains("producer=dormeo");
    }

    public WebElement getCoffeeTeaMakingFacilieties() {
        return getElementByXpath("//a[@title='Посуда для чая и кофе']");
    }

    public WebElement getPorcelainCoffeeTeaMakingFacilitiesBtn() {
        return getElementByXpath("//a[@data-id='Фарфор']");
    }

    public boolean checkURLPorcelainCoffeeTeaMakingFacilities() {
        return driver.getCurrentUrl().contains("material-88504=farfor");
    }
}
