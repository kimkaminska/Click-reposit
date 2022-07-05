package Rozetka.Rozetka.Tests;

import BasePage.TestInit;
import Rozetka.PagesRozetka.HomePageRozetka;
import Rozetka.PagesRozetka.PhonesTVPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckAppleIPhones13ProMaxList extends TestInit {

    @Test
    public void checkAppleIPhones13ProMaxList() {
        HomePageRozetka homePageRozetka = new HomePageRozetka(driver);
        openUrl("https://rozetka.com.ua/");
        sleep(4);
        if (driver.findElements(By.xpath("//span[@class='exponea-close-cross']")).size()>0) {
            driver.findElements(By.xpath("//span[@class='exponea-close-cross']")).get(0).click();
        }
        sleep(4);
        homePageRozetka.clickMenuBtn().click();
        sleep(4);
        homePageRozetka.clickCatalogBtn().click();
        sleep(4);
        homePageRozetka.clickPhones_TVBtn().click();
        sleep(4);
        PhonesTVPage phonesTVPage = new PhonesTVPage(driver);
        phonesTVPage.clickCellphones().click();
        sleep(4);
        phonesTVPage.clickApplePhonesBtn().click();
        sleep(4);
        phonesTVPage.clickApple13ProMaxBtn().click();
        sleep(4);

        Assert.assertTrue(phonesTVPage.checkURLApplePhones13ProMax());
    }
}
