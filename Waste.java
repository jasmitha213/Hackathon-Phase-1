import java.util.Scanner;

public class Waste {

    // Method to calculate total waste
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double point1Waste = sc.nextDouble();
        double point2Waste = sc.nextDouble();

        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);

        System.out.println(totalWaste);
    }
}
