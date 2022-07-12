package TaskOverrideOverload.Override.OverloadTripConstructor;

public class TripToGreece {

    String cityInGreece;
    String durationOfTrip;
    int starsOfHotel;
    int numberOfPeople;
    int price;
    boolean allInclusive;

    public TripToGreece(String cityInGreece, String durationOfTrip, int starsOfHotel, int numberOfPeople, int price, boolean allInclusive) {
        this.cityInGreece = cityInGreece;
        this.durationOfTrip = durationOfTrip;
        this.starsOfHotel = starsOfHotel;
        this.numberOfPeople = numberOfPeople;
        this.price = price;
        this.allInclusive = allInclusive;
    }

    public TripToGreece(String cityInGreece, String durationOfTrip, int starsOfHotel, int numberOfPeople, int price) {
        this.cityInGreece = cityInGreece;
        this.durationOfTrip = durationOfTrip;
        this.starsOfHotel = starsOfHotel;
        this.numberOfPeople = numberOfPeople;
        this.price = price;
    }

    public TripToGreece(String cityInGreece, String durationOfTrip, int starsOfHotel, int numberOfPeople) {
        this.cityInGreece = cityInGreece;
        this.durationOfTrip = durationOfTrip;
        this.starsOfHotel = starsOfHotel;
        this.numberOfPeople = numberOfPeople;
    }

    public TripToGreece(String cityInGreece, String durationOfTrip, int starsOfHotel) {
        this.cityInGreece = cityInGreece;
        this.durationOfTrip = durationOfTrip;
        this.starsOfHotel = starsOfHotel;
    }

    public TripToGreece(String cityInGreece, String durationOfTrip) {
        this.cityInGreece = cityInGreece;
        this.durationOfTrip = durationOfTrip;
    }

    public TripToGreece(String cityInGreece, int price) {
        this.cityInGreece = cityInGreece;
        this.price = price;
    }

    public void showTripDetails() {
        System.out.println("Trip to Greek city " + cityInGreece + ". Duration of a trip: " + durationOfTrip + ". Number of stars ot the hotel: " + starsOfHotel + ". Number of people: " + numberOfPeople + ". Total price for the trip: " + price + ". Allinclusive: " + allInclusive);
    }

    public void showCityDurationStars() {
        System.out.println("Trip to Greek city " + cityInGreece + ". Duration of a trip: " + durationOfTrip + ". Number of stars ot the hotel: " + starsOfHotel);
    }

    public int show5StarsHotels() {
        if (starsOfHotel == 5) {
            System.out.println("Client prefer the 5 Stars Hotels.");
        } else {
            System.out.println("The number of stars of the hotel doesn't matter for the client.");
        }
        return starsOfHotel;
    }

    public void showAllinclusiveHotels() {
        if (allInclusive) {
            System.out.println("Client prefer allinclusive. \n");
        } else {
            System.out.println("The option 'allinclusive' doesn't matter for the client. \n");
        }
    }

    public void showCityDuration() {
        System.out.println("Trip to Greek city " + cityInGreece + ". Duration of a trip: " + durationOfTrip + ".");
    }

    public void showCityPrice() {
        System.out.println("Trip to Greek city " + cityInGreece + ". Total price for the trip: " + price + ".");
    }

    public void showCityDurationStarsPeople() {
        System.out.println("Trip to Greek city " + cityInGreece + ". Duration of a trip: " + durationOfTrip + ". Number of stars ot the hotel: " + starsOfHotel + ". Number of people: " + numberOfPeople + ". \n" );
    }
}