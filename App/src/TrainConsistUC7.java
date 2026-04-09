import java.util.*;

// Bogie class representing a passenger bogie
class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistUC7 {
    public static void main(String[] args) {
        // Step 1: Create a list to store bogies
        List<Bogie> passengerBogies = new ArrayList<>();

        // Step 2: Add bogies
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 50));

        // Step 3: Display original list
        System.out.println("Original Bogie List:");
        passengerBogies.forEach(System.out::println);

        // Step 4: Sort bogies by capacity using Comparator
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity).reversed());

        // Step 5: Display sorted bogies
        System.out.println("\nSorted Bogie List (by capacity descending):");
        passengerBogies.forEach(System.out::println);
    }
}
