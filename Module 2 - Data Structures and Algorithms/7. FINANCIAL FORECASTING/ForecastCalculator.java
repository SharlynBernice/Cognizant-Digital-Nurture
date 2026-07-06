import java.util.HashMap;

public class ForecastCalculator {

    private HashMap<Integer, Double> memo = new HashMap<>();

    // Recursive Forecast
    public double forecastRecursive(double revenue, double growthRate, int years) {

        if (years == 0)
            return revenue;

        return forecastRecursive(revenue * (1 + growthRate), growthRate, years - 1);
    }

    // Dynamic Programming (Memoization)
    public double forecastMemoized(double revenue, double growthRate, int years) {

        if (memo.containsKey(years))
            return memo.get(years);

        double result;

        if (years == 0)
            result = revenue;
        else
            result = forecastMemoized(revenue, growthRate, years - 1) * (1 + growthRate);

        memo.put(years, result);

        return result;
    }

}