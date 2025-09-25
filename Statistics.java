import java.util.*;
import java.util.stream.*;
import java.util.Arrays;
class MeanDeviation{
    private Scanner sc = new Scanner(System.in);
    double[] takeInput(int size, String label){
        double[] arr = new double[size];
        System.out.println("Enter Data "+label+" :");
        for(int i=0; i<size; i++) arr[i] = sc.nextDouble();
        return arr;
    }

}
class StatisticsCalculator {
    private Scanner sc = new Scanner(System.in);

    // 1. Take input for one dataset
    double[] takeInput(int size, String label) {
        double[] arr = new double[size];
        System.out.println("Enter Data " + label + ":");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextDouble();
        }
        return arr;
    }

    // 2. Calculate mean of dataset
    double calculateMean(double[] arr) {
        double sum = 0.0;
        for (double val : arr) sum += val;
        return sum / arr.length;
    }

    // 3. Print table with deviations
    void printTable(double[] dataA, double[] dataB, double meanA, double meanB) {
        double sumSqA = 0.0;
        double sumSqB = 0.0;

        System.out.println("\nFinding (x-x̄),(x - x̄)²,(y - ȳ), and (y - ȳ)² ...................");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("|    x    |  (x - x̄)  |    (x - x̄)²   |    y    |  (y - ȳ)  |    (y - ȳ)²   |");
        System.out.println("--------------------------------------------------------------------------------------");

        for (int i = 0; i < dataA.length; i++) {
            double dx = dataA[i] - meanA;
            double dy = dataB[i] - meanB;
            double dx2 = dx * dx;
            double dy2 = dy * dy;

            sumSqA += dx2;
            sumSqB += dy2;

            System.out.printf("| %7.2f | %9.2f | %13.2f | %7.2f | %9.2f | %13.2f |\n",
                    dataA[i], dx, dx2, dataB[i], dy, dy2);
        }

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.printf("Σ(x - x̄)² = %.2f\n", sumSqA);
        System.out.printf("Σ(y - ȳ)² = %.2f\n", sumSqB);

        double sigmaA = Math.sqrt(sumSqA / dataA.length);
        double sigmaB = Math.sqrt(sumSqB / dataB.length);

        System.out.printf("Standard Deviation of A : %.2f\n", sigmaA);
        System.out.printf("Standard Deviation of B : %.2f\n", sigmaB);
    }

    // 4. Main workflow
    void run() {
        System.out.print("Enter the size of the data: ");
        int size = sc.nextInt();

        double[] dataA = takeInput(size, "A");
        double[] dataB = takeInput(size, "B");

        double meanA = calculateMean(dataA);
        double meanB = calculateMean(dataB);

        System.out.printf("Σx = %.2f,  x̄ = %.2f\n", Arrays.stream(dataA).sum(), meanA);
        System.out.printf("Σy = %.2f,  ȳ = %.2f\n", Arrays.stream(dataB).sum(), meanB);

        printTable(dataA, dataB, meanA, meanB);

        sc.close();
    }
}

public class Statistics {
    public static void main(String[] args) {
        MeanDeviation me = new MeanDeviation();
        StatisticsCalculator calc = new StatisticsCalculator();
        calc.run();
    }
}
