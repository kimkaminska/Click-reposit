package Rozetka.Rozetka.Tests;

import BasePage.TestInit;
import Rozetka.PagesRozetka.HomePageRozetka;
import Rozetka.PagesRozetka.PhonesTVPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckSumsungGalaxyAPhonesList extends TestInit {

    @Test
    public void checkSumsungGalaxyAPhonesList() {

        HomePageRozetka homePageRozetka = new HomePageRozetka(driver);
        PhonesTVPage phonesTVPage = new PhonesTVPage(driver);

        openUrl("https://rozetka.com.ua");
        sleep(4);
        if (driver.findElements(By.xpath("//span[@class='exponea-close-cross']")).size() > 0) {
            driver.findElements(By.xpath("//span[@class='exponea-close-cross']")).get(0).click();
        }
        sleep(4);
        homePageRozetka.getMenuBtn().click();
        sleep(4);
        homePageRozetka.getCatalogBtn().click();
        sleep(4);
        homePageRozetka.getPhones_TVBtn().click();
        sleep(4);
        phonesTVPage.getCellphones().click();
        sleep(4);
        phonesTVPage.getSumsungPhonesBtn().click();
        sleep(4);
        phonesTVPage.getSumsungGalaxyAPhonesBtn().click();
        sleep(4);

        Assert.assertTrue(phonesTVPage.checkURLSumsungGlaxyAPhones());
    }
}