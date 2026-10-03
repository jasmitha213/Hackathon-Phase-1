import java.util.Scanner;

public class WasteCollectionStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read waste collected from the user
        System.out.print("Enter waste collected in kg: ");
        double wasteCollected = scanner.nextDouble();

        // Check condition using if-else
        if (wasteCollected >= 100.0) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        scanner.close();
    }
}  }
}
    
  