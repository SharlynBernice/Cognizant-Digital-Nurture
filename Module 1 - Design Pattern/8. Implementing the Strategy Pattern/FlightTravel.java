// Concrete Strategy - Flight Travel
public class FlightTravel implements TravelStrategy {

    @Override
    public void travel(String source, String destination) {

        System.out.println("Travel Mode : Flight");
        System.out.println("Route       : " + source + " -> " + destination);
        System.out.println("Estimated Time : 1 Hour");
    }
}