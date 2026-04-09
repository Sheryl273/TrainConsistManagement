package main;

import java.util.*;
import java.util.stream.Collectors;

public class UseCase8TrainConsistMgmt {
    // Bogie class nested or separate if already exists
    public static class Bogie {
        private String name;
        private int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String getName() { return name; }
        public int getCapacity() { return capacity; }

        @Override
        public String toString() {
            return name + " (Capacity: " + capacity + ")";
        }
    }

    // Method to filter bogies by capacity
    public static List<Bogie> filterHighCapacityBogies(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > threshold)
                .collect(Collectors.toList());
    }

    // Optional main for manual testing
    public static void main(String[] args) {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 50),
                new Bogie("Executive Chair", 80)
        );

        List<Bogie> filtered = filterHighCapacityBogies(bogies, 60);
        System.out.println("Filtered Bogies (Capacity > 60):");
        filtered.forEach(System.out::println);
    }
}
