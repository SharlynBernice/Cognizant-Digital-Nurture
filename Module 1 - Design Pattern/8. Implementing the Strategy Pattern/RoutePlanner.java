// Context
public class RoutePlanner {

    private TravelStrategy travelStrategy;

    // Set the strategy at runtime
    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    // Execute the selected strategy
    public void planRoute(String source, String destination) {

        if (travelStrategy == null) {
            System.out.println("Please select a travel mode.");
            return;
        }

        travelStrategy.travel(source, destination);
    }
}