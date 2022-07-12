package Rozetka.PagesRozetka;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageRozetka extends BasePage {
    public HomePageRozetka(WebDriver driver) {
        super(driver);
    }

    public WebElement getMenuBtn() {
        return driver.findElement(By.xpath("//button[@class='header__button ng-tns-c94-1']"));
    }

    public WebElement getCatalogBtn() {
        return driver.findElement(By.xpath("//button[@id='fat-menu' and @class='button button--large side-menu__button ng-tns-c94-1']"));
    }

    public WebElement getLaptop_CompBtn() {
        return getElementByXpath("//*[text()= 'Ноутбуки и компьютеры']");
    }

    public WebElement getPhones_TVBtn() {
        return driver.findElement(By.xpath("//a[text()= 'Смартфоны, ТВ и электроника']"));
    }

    public WebElement getBeautyHealthBtn() {
        return getElementByXpath("//a[text()= 'Красота и здоровье']");
    }

    public WebElement getHouseholdGoodsBtn() {
        return getElementByXpath("//a[text()= 'Товары для дома']");
    }
}
