import java.util.HashMap;
import java.util.Map;

public class TrainConsistUC6 {
    public static void main(String[] args) {

        // Step 1: Create a HashMap to store bogie-capacity pairs
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        System.out.println("Adding bogies and their capacities...\n");

        // Step 2: Insert bogie-capacity values
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 54);
        bogieCapacity.put("First Class", 36);
        bogieCapacity.put("Cargo Rectangular", 1000); // in kg
        bogieCapacity.put("Cargo Cylindrical", 1200); // in kg

        // Step 3: Iterate and display bogie capacities
        System.out.println("Train Bogie Capacities:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            String bogie = entry.getKey();
            int capacity = entry.getValue();

            if (bogie.startsWith("Cargo")) {
                System.out.println(bogie + " → Load Capacity: " + capacity + " kg");
            } else {
                System.out.println(bogie + " → Seating Capacity: " + capacity + " seats");
            }
        }
    }
}
