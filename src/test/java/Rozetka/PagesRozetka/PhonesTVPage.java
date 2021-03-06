package Rozetka.PagesRozetka;

import BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhonesTVPage extends BasePage {
    public PhonesTVPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCellphones() {
        return getElementByXpath("//a[@class='tile-cats__heading tile-cats__heading_type_center ng-star-inserted' and @title='Мобильные телефоны']");
    }

    public WebElement getApplePhonesBtn() {
        return getElementByXpath("//a[@data-id='Apple']");
    }

    public WebElement getApple13ProMaxBtn() {
        return getElementByXpath("//a[@data-id='iPhone 13 Pro Max']");
    }

    public boolean checkURLApplePhones13ProMax() {
        return driver.getCurrentUrl().contains("producer=apple;series=113083");
    }

    public WebElement getSumsungPhonesBtn() {
        return getElementByXpath("//a[@data-id='Samsung']");
    }

    public WebElement getSumsungGalaxyAPhonesBtn() {
        return getElementByXpath("//a[@data-id='Galaxy A']");
    }

    public boolean checkURLSumsungGlaxyAPhones() {
        return driver.getCurrentUrl().contains("producer=samsung;series=galaxy_a");
    }
}
