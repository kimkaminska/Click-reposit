package Rozetka.PagesRozetka;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaptopPage extends BasePage {
    public LaptopPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkURLLaptopList() {
        return driver.getCurrentUrl().contains("notebooks");
    }

    public WebElement clickLaptopBtn() {
//        return driver.findElement(By.xpath("//img[@alt='laptops']"));
        return getElementByXpath("//a[@class='tile-cats__heading tile-cats__heading_type_center ng-star-inserted' and @title='Ноутбуки']");
    }

    public WebElement clickAppleLaptopsBtn() {
        return getElementByXpath("//a[@data-id='Apple']");
    }

    public boolean checkURLAppleLaptops() {
        return driver.getCurrentUrl().contains("apple");
    }

    public WebElement clickDellLaptopsBtn() {
        return getElementByXpath("//a[@data-id='Dell']");
    }

    public WebElement cklickDellLaptops32GB() {
        return getElementByXpath("//a[@data-id='32 ГБ и больше']");
    }

    public boolean checkURLDellLaptops32GB() {
        return driver.getCurrentUrl().contains("producer=dell");
    }

    public WebElement clickMacOSLaptops() {
        return getElementByXpath("//a[@data-id='Mac OS']");
    }

    public boolean checkURLMacOSLaptops() {
        return driver.getCurrentUrl().contains("notebooks/c80004/20886=6327");
    }

    public WebElement clickAsusLaptopsBtn() {
        return getElementByXpath("//a[@data-id='ASUS']");
    }

    public boolean checkURLAsusLaptops() {
        return driver.getCurrentUrl().contains("producer=asus");
    }
}
