package TaskOverrideOverload.Override.OverloadMethods;

import org.testng.annotations.Test;

public class TestFlowerInCity {

    @Test
    public void testFlowerInCity() {
        FlowerInCity flowerInCity = new FlowerInCity();
        flowerInCity.showSumOfMoneyForPlantingFlowers(20, 5000, "Voronikhina Street");

        FlowerInCity flowerInCity1 = new FlowerInCity();
        flowerInCity1.showSumOfMoneyForPlantingFlowers(35, 2100, "Rivnenska Street");
    }

    @Test
    public void testTulipsFlowerbedInCity() {
        FlowerInCity flowerInCity2 = new FlowerInCity();
        flowerInCity2.showTulipsFlowerbed("tulips", 15, 12000, "center", 20, 25);
    }
}