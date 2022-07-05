package Rozetka.PagesRozetka;

import BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PhonesTVPage extends BasePage {
    public PhonesTVPage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickCellphones() {
        return getElementByXpath("//a[@class='tile-cats__heading tile-cats__heading_type_center ng-star-inserted' and @title='Мобильные телефоны']");
    }

    public WebElement clickApplePhonesBtn() {
        return getElementByXpath("//a[@data-id='Apple']");
    }

    public WebElement clickApple13ProMaxBtn() {
        return getElementByXpath("//a[@data-id='iPhone 13 Pro Max']");
    }

    public boolean checkURLApplePhones13ProMax() {
        return driver.getCurrentUrl().contains("producer=apple;series=113083");
    }
}
