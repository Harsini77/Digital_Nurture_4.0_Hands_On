
import java.util.*;

class FinancialForecast {


    static HashMap<Integer, Double> memo = new HashMap<>();

    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) return presentValue;


        if (memo.containsKey(years)) {
            return memo.get(years);
        }


        double future = calculateFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
        memo.put(years, future);
        return future;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Financial Forecasting Tool");

        System.out.print("Enter present value: ");
        double presentValue = scanner.nextDouble();

        System.out.print("Enter annual growth rate (in %): ");
        double growthRatePercent = scanner.nextDouble();
        double growthRate = growthRatePercent / 100;

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double forecast = calculateFutureValue(presentValue, growthRate, years);

        System.out.printf("Forecasted value after %d years: %.2f\n", years, forecast);
        scanner.close();
    }
}
