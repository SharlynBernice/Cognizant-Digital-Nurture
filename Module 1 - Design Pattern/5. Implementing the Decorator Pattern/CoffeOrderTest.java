// Client
public class CoffeeOrderTest {

    public static void main(String[] args) {

        // Basic Coffee
        Coffee coffee = new SimpleCoffee();

        System.out.println("Base Order");
        System.out.println("--------------------------");
        System.out.println("Coffee : " + coffee.getDescription());
        System.out.println("Cost   : ₹" + coffee.getCost());

        System.out.println();

        // Add Milk
        coffee = new MilkDecorator(coffee);

        // Add Sugar
        coffee = new SugarDecorator(coffee);

        // Add Whipped Cream
        coffee = new WhippedCreamDecorator(coffee);

        System.out.println("Customized Order");
        System.out.println("--------------------------");
        System.out.println("Coffee : " + coffee.getDescription());
        System.out.println("Cost   : ₹" + coffee.getCost());
    }
}