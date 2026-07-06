public class ForecastTest {

    public static void main(String[] args) {

        FinancialForecast company =
                new FinancialForecast(500000, 0.10);

        ForecastCalculator calculator = new ForecastCalculator();

        int years = 5;

        System.out.println("Financial Forecast");
        System.out.println("----------------------------");

        double recursiveRevenue =
                calculator.forecastRecursive(
                        company.getInitialRevenue(),
                        company.getAnnualGrowthRate(),
                        years);

        System.out.printf("Recursive Forecast after %d years : ₹%.2f%n",
                years, recursiveRevenue);

        double memoizedRevenue =
                calculator.forecastMemoized(
                        company.getInitialRevenue(),
                        company.getAnnualGrowthRate(),
                        years);

        System.out.printf("Memoized Forecast after %d years  : ₹%.2f%n",
                years, memoizedRevenue);

    }

}