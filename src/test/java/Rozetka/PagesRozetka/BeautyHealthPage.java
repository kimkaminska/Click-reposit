package Rozetka.PagesRozetka;

import BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BeautyHealthPage extends BasePage {
    public BeautyHealthPage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickPerfumesBtn() {
        return getElementByXpath("//a[@title='Женская парфюмерия']");
    }

    public WebElement clickChanelPerfumes() {
        return getElementByXpath("//a[@data-id='Chanel']");
    }

    public boolean checkURLChanelPerfumes() {
        return driver.getCurrentUrl().contains("producer=chanel");
    }

    public WebElement clickMenPerfumesBtn() {
        return getElementByXpath("//a[@title='Мужская парфюмерия']");
    }

    public WebElement clickMenPerfumesHermesBtn() {
        return getElementByXpath("//a[@data-id='Hermes']");
    }

    public boolean checkURLMenPerfumesHermes() {
        return driver.getCurrentUrl().contains("producer=hermes");
    }

    public WebElement clickCosmeticsSetsBtn() {
        return getElementByXpath("//a[@title='Наборы декоративной косметики']");
    }

    public boolean checkURLCosmeticsSets() {
        return driver.getCurrentUrl().contains("nabori-kosmetiki");
    }
}
