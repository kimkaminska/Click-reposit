package TaskOverrideOverload.Override.OverloadMethods;

public class FlowerInCity {
    String flower;
    int price;
    int number;
    String location;
    int gardener;
    int numberOnSquareMeter;

    public void showSumOfMoneyForPlantingFlowers(int price, int number, String location) {
        System.out.println("For planting flowers in the area " + location + " we will spend " + (price * number) + " UAH. \n") ;
    }

    public void showTulipsFlowerbed(String flower, int price, int number, String location, int gardener, int numberOnSquareMeter) {
        System.out.println("For planting " + flower + " in the " + location + " we will spend " + (price * number) + " UAH and need " + gardener + " gardener. \n") ;
        System.out.println("Productivity of the gardener is: " + ((price * number)/gardener) + " UAH/gardener. \n");
        System.out.println("The area of the tulips flowerbed is: " + (number/numberOnSquareMeter) +  " square meters.");
    }
}