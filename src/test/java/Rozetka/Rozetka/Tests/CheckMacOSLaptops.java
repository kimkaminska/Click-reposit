package Rozetka.Rozetka.Tests;

import BasePage.TestInit;
import Rozetka.PagesRozetka.HomePageRozetka;
import Rozetka.PagesRozetka.LaptopPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckMacOSLaptops extends TestInit {

    @Test
    public void checkMacOSLaptops () {
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
        homePageRozetka.clickLaptop_CompBtn().click();
        sleep(3);
        LaptopPage laptopPage = new LaptopPage(driver);
        sleep(4);
        laptopPage.clickLaptopBtn().click();
        sleep(4);
        laptopPage.clickMacOSLaptops().click();
        sleep(4);

        Assert.assertTrue(laptopPage.checkURLMacOSLaptops());
    }
}
