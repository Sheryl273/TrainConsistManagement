import java.util.LinkedList;

public class UseCase4MaintainOrderedBogieID {
    public static void main(String[] args) {

        // Create LinkedList to maintain train consist
        LinkedList<String> train = new LinkedList<>();

        System.out.println("Adding bogies...\n");

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        // Insert Pantry Car at position 2 (index starts from 0)
        System.out.println("Inserting Pantry Car at position 2...\n");
        train.add(2, "Pantry");

        // Remove first and last bogie
        System.out.println("Removing first and last bogies...\n");
        train.removeFirst();
        train.removeLast();

        // Display final train consist
        System.out.println("Final Train Consist:");
        for (String bogie : train) {
            System.out.println(bogie);
        }
    }
}