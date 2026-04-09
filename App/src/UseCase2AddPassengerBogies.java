import java.util.ArrayList;
import java.util.List;

public class UseCase2AddPassengerBogies {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after adding
        System.out.println("Passenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        System.out.println("After removing AC Chair:");
        System.out.println(passengerBogies);

        // Check if Sleeper exists
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Is Sleeper present? " + exists);

        // Final state
        System.out.println("Final Passenger Bogies:");
        System.out.println(passengerBogies);
    }
}