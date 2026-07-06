public class FinancialForecast {

    private double initialRevenue;
    private double annualGrowthRate;

    public FinancialForecast(double initialRevenue, double annualGrowthRate) {
        this.initialRevenue = initialRevenue;
        this.annualGrowthRate = annualGrowthRate;
    }

    public double getInitialRevenue() {
        return initialRevenue;
    }

    public double getAnnualGrowthRate() {
        return annualGrowthRate;
    }
}