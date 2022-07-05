package Rozetka.Rozetka.Tests;

import BasePage.TestInit;
import Rozetka.PagesRozetka.BeautyHealthPage;
import Rozetka.PagesRozetka.HomePageRozetka;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckChanelPerfumesList extends TestInit {

    @Test
    public void checkChanelPerfumesList() {
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
        homePageRozetka.clickBeautyHealthBtn().click();
        sleep(4);
        BeautyHealthPage beautyHealthPage = new BeautyHealthPage(driver);
        sleep(4);
        beautyHealthPage.clickPerfumesBtn().click();
        sleep(4);
        beautyHealthPage.clickChanelPerfumes().click();
        sleep(4);

        Assert.assertTrue(beautyHealthPage.checkURLChanelPerfumes());
    }
}
