package Rozetka.Rozetka.Tests;

import BasePage.TestInit;
import Rozetka.PagesRozetka.HomePageRozetka;
import Rozetka.PagesRozetka.HouseholdGoodsPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckDormeoBlancetsLists extends TestInit {

    @Test
    public void checkDormeoBlancetsLists() {

        HomePageRozetka homePageRozetka = new HomePageRozetka(driver);
        HouseholdGoodsPage householdGoodsPage = new HouseholdGoodsPage(driver);

        openUrl("https://rozetka.com.ua/");
        sleep(4);
        if (driver.findElements(By.xpath("//span[@class='exponea-close-cross']")).size() > 0) {
            driver.findElements(By.xpath("//span[@class='exponea-close-cross']")).get(0).click();
        }
        sleep(4);
        homePageRozetka.getMenuBtn().click();
        sleep(4);
        homePageRozetka.getCatalogBtn().click();
        sleep(3);
        homePageRozetka.getHouseholdGoodsBtn().click();
        sleep(4);
        householdGoodsPage.getBlancetsBtn().click();
        sleep(4);
        householdGoodsPage.getDormeoBlancetsBtn().click();
        sleep(4);

        Assert.assertTrue(householdGoodsPage.checkURlDormeoBlancetsList());
    }
}