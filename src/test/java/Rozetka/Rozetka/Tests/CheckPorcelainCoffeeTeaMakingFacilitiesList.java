package Rozetka.Rozetka.Tests;

import BasePage.TestInit;
import Rozetka.PagesRozetka.HomePageRozetka;
import Rozetka.PagesRozetka.HouseholdGoodsPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckPorcelainCoffeeTeaMakingFacilitiesList extends TestInit {

    @Test
    public void checkPorcelainCoffeeTeaMakingFacilitiesList () {
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
        sleep(3);
        homePageRozetka.clickHouseholdGoodsBtn().click();
        sleep(4);
        HouseholdGoodsPage householdGoodsPage = new HouseholdGoodsPage(driver);
        householdGoodsPage.clickCoffeeTeaMakingFacilieties().click();
        sleep(4);
        householdGoodsPage.clickPorcelainCoffeeTeaMakingFacilitiesBtn().click();
        sleep(4);

        Assert.assertTrue(householdGoodsPage.checkURLPorcelainCoffeeTeaMakingFacilities());
    }
}