package BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public abstract class BasePage {

    int BASIC_TIME = 15;

    public static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitElementToBeClickable(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, BASIC_TIME);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    public WebElement getElementByXpath(String locator){
        WebDriverWait wait = new WebDriverWait(driver, BASIC_TIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        return driver.findElement(By.xpath(locator));
    }

    public void goToTheSecondWindowTab(WebDriver driver, Integer seconds) {
        waitForNewTabOpened(seconds);
        ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public void waitForNewTabOpened(Integer seconds) {
        for (int a = 0; a < seconds * 2; a++) {
            ArrayList<String> tabs2 = new ArrayList(driver.getWindowHandles());
            if (tabs2.size() > 1) {
                break;
            }
        }
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
