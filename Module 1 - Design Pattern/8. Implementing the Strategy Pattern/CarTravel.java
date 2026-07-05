// Concrete Strategy - Car Travel
public class CarTravel implements TravelStrategy {

    @Override
    public void travel(String source, String destination) {

        System.out.println("Travel Mode : Car");
        System.out.println("Route       : " + source + " -> " + destination);
        System.out.println("Estimated Time : 6 Hours");
    }
}