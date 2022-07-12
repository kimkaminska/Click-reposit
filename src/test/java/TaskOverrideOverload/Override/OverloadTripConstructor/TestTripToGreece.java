package TaskOverrideOverload.Override.OverloadTripConstructor;

import org.testng.annotations.Test;

public class TestTripToGreece {

    @Test
    public void testTripToGreece() {
        TripToGreece tripToGreece = new TripToGreece("Malia", "10 days", 5, 2, 1300, true);
        tripToGreece.showTripDetails();

        TripToGreece tripToGreece1 = new TripToGreece("Heraclion", "7 days", 5, 2, 1100);
        tripToGreece1.showTripDetails();
    }

    @Test
    public void testTripToGreece3Conditions() {
        TripToGreece tripToGreece2 = new TripToGreece("Iraclion", "5 days", 3);
        tripToGreece2.showCityDurationStars();

        TripToGreece tripToGreece3 = new TripToGreece("Mykonos", "6 days", 2);
        tripToGreece3.showCityDurationStars();
    }

    @Test
    public void testTripToGreece2Conditions() {
        TripToGreece tripToGreece4 = new TripToGreece("Volos", "9 days");
        tripToGreece4.showCityDuration();

        TripToGreece tripToGreece5 = new TripToGreece("Parga", "11 days");
        tripToGreece5.showCityDuration();
    }

    @Test
    public void testTripToGreeceCityPrice() {
        TripToGreece tripToGreece6 = new TripToGreece("Serres", 1600);
        tripToGreece6.showCityPrice();

        TripToGreece tripToGreece7 = new TripToGreece("Kalambaka", 1500);
        tripToGreece7.showCityPrice();
    }

    @Test
    public void testTripToGreeceCityDurationStarsPeople() {
        TripToGreece tripToGreece8 = new TripToGreece("Lamia", "4 days", 5, 4);
        tripToGreece8.showCityDurationStarsPeople();

        TripToGreece tripToGreece9 = new TripToGreece("Santorini", "14 days", 5, 3);
        tripToGreece9.showCityDurationStarsPeople();
    }

    @Test
    public void testTripToAthens() {
        TripToGreece tripToGreece = new TripToGreece("Athens", "12 days", 4, 2, 1600, true);
        tripToGreece.showTripDetails();
        tripToGreece.show5StarsHotels();
    }

    @Test
    public void testTripToCorfu() {
        TripToGreece tripToGreece = new TripToGreece("Corfu", "9 days", 5, 3, 1800, false);
        tripToGreece.showTripDetails();
        tripToGreece.showAllinclusiveHotels();
    }
}