package main;

import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;   // e.g., "Cylindrical", "Rectangular", "Box"
    String cargo;  // e.g., "Petroleum", "Coal", "Grain"

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " Bogie carrying " + cargo;
    }
}

public class UseCase12TrainConsistMgmt {
    public static void main(String[] args) {
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal")); // invalid for demo

        // Safety check: Cylindrical bogies must carry Petroleum only
        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> !b.type.equalsIgnoreCase("Cylindrical") || b.cargo.equalsIgnoreCase("Petroleum"));

        // Display results
        System.out.println("Goods Bogies in the train:");
        goodsBogies.forEach(System.out::println);

        if (isSafe) {
            System.out.println("\nTrain is SAFE: All cylindrical bogies carry Petroleum only.");
        } else {
            System.out.println("\nTrain is UNSAFE: Some cylindrical bogies carry invalid cargo!");
        }
    }
}