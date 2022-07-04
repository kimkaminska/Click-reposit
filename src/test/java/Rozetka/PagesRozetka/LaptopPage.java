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
}
