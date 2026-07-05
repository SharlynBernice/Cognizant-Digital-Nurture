// Concrete Strategy - Train Travel
public class TrainTravel implements TravelStrategy {

    @Override
    public void travel(String source, String destination) {

        System.out.println("Travel Mode : Train");
        System.out.println("Route       : " + source + " -> " + destination);
        System.out.println("Estimated Time : 4 Hours");
    }
}