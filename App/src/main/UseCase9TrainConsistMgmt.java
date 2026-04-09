package main;

import java.util.*;
import java.util.stream.Collectors;

public class UseCase9TrainConsistMgmt {

    // Bogie class (can be reused from UC8)
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

    // Method to group bogies by type
    public static Map<String, List<Bogie>> groupBogiesByType(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));
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

        Map<String, List<Bogie>> grouped = groupBogiesByType(bogies);

        grouped.forEach((type, list) -> {
            System.out.println(type + " Bogies:");
            list.forEach(System.out::println);
            System.out.println();
        });
    }
}