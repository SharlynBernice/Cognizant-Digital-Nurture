// Client
public class StrategyPatternTest {

    public static void main(String[] args) {

        RoutePlanner planner = new RoutePlanner();

        System.out.println("===== Car Journey =====");
        planner.setTravelStrategy(new CarTravel());
        planner.planRoute("Chennai", "Bangalore");

        System.out.println();

        System.out.println("===== Train Journey =====");
        planner.setTravelStrategy(new TrainTravel());
        planner.planRoute("Chennai", "Bangalore");

        System.out.println();

        System.out.println("===== Flight Journey =====");
        planner.setTravelStrategy(new FlightTravel());
        planner.planRoute("Chennai", "Bangalore");
    }
}