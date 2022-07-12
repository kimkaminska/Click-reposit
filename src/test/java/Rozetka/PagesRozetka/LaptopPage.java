package Rozetka.PagesRozetka;

import BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaptopPage extends BasePage {
    public LaptopPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkURLLaptopList() {
        return driver.getCurrentUrl().contains("notebooks");
    }

    public WebElement getLaptopBtn() {
//        return driver.findElement(By.xpath("//img[@alt='laptops']"));
        return getElementByXpath("//a[@class='tile-cats__heading tile-cats__heading_type_center ng-star-inserted' and @title='Ноутбуки']");
    }

    public WebElement getAppleLaptopsBtn() {
        return getElementByXpath("//a[@data-id='Apple']");
    }

    public boolean checkURLAppleLaptops() {
        return driver.getCurrentUrl().contains("apple");
    }

    public WebElement getDellLaptopsBtn() {
        return getElementByXpath("//a[@data-id='Dell']");
    }

    public WebElement getDellLaptops32GB() {
        return getElementByXpath("//a[@data-id='32 ГБ и больше']");
    }

    public boolean checkURLDellLaptops32GB() {
        return driver.getCurrentUrl().contains("producer=dell");
    }

    public WebElement getMacOSLaptops() {
        return getElementByXpath("//a[@data-id='Mac OS']");
    }

    public boolean checkURLMacOSLaptops() {
        return driver.getCurrentUrl().contains("notebooks/c80004/20886=6327");
    }

    public WebElement getAsusLaptopsBtn() {
        return getElementByXpath("//a[@data-id='ASUS']");
    }

    public boolean checkURLAsusLaptops() {
        return driver.getCurrentUrl().contains("producer=asus");
    }

    public WebElement getHPLaptopsBTn() {
        return getElementByXpath("//a[@data-id='HP']");
    }

    public boolean checkURLHPLaptops() {
        return driver.getCurrentUrl().contains("producer=hp-hewlett-packard");
    }

    public WebElement getLenovoLeptopsBtn() {
        return getElementByXpath("//a[@data-id='Lenovo']");
    }

    public boolean checkURLLenovoLeptops() {
        return driver.getCurrentUrl().contains("producer=lenovo");
    }
}