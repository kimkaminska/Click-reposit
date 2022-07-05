package Rozetka.PagesRozetka;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

public class HomePageRozetka extends BasePage {
    public HomePageRozetka(WebDriver driver) {
        super(driver);
    }

    public WebElement clickMenuBtn() {
        return driver.findElement(By.xpath("//button[@class='header__button ng-tns-c94-1']"));
    }

    public WebElement clickCatalogBtn() {
        return driver.findElement(By.xpath("//button[@id='fat-menu' and @class='button button--large side-menu__button ng-tns-c94-1']"));
    }

    public WebElement clickLaptop_CompBtn() {
        return getElementByXpath("//*[text()= 'Ноутбуки и компьютеры']");
    }

    public WebElement clickPhones_TVBtn() {
        return driver.findElement(By.xpath("//a[text()= 'Смартфоны, ТВ и электроника']"));
    }
}
