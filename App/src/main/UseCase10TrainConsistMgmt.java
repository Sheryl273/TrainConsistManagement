package main;

import java.util.*;

public class UseCase10TrainConsistMgmt {

    // Bogie class (reuse from UC9)
    public static class Bogie {
        private String name;
        private String type; // Passenger or Goods
        private int capacity;

        public Bogie(String name, String type, int capacity) {
            this.name = name;
            this.type = type;
            this.capacity = capacity;
        }

        public String getName() { return name; }
        public String getType() { return type; }
        public int getCapacity() { return capacity; }

        @Override
        public String toString() {
            return name + " (Type: " + type + ", Capacity: " + capacity + ")";
        }
    }

    // Method to calculate total seats in all passenger bogies
    public static int calculateTotalSeats(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.getType().equals("Passenger"))
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);
    }

    // Optional main method for manual testing
    public static void main(String[] args) {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", "Passenger", 72),
                new Bogie("AC Chair", "Passenger", 56),
                new Bogie("First Class", "Passenger", 50),
                new Bogie("Rectangular", "Goods", 200),
                new Bogie("Cylindrical", "Goods", 150)
        );

        int totalSeats = calculateTotalSeats(bogies);
        System.out.println("Total Passenger Seats in Train: " + totalSeats);
    }
}
