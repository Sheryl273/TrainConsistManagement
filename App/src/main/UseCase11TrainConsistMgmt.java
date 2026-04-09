package main;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class UseCase11TrainConsistMgmt {

    // Method to validate Train ID format: TRN-1234
    public static boolean validateTrainID(String trainID) {
        String regex = "TRN-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(trainID);
        return matcher.matches();
    }

    // Method to validate Cargo Code format: PET-AB
    public static boolean validateCargoCode(String cargoCode) {
        String regex = "PET-[A-Z]{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainID = scanner.nextLine();
        System.out.println("Train ID " + trainID + " is " +
                (validateTrainID(trainID) ? "VALID" : "INVALID"));

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();
        System.out.println("Cargo Code " + cargoCode + " is " +
                (validateCargoCode(cargoCode) ? "VALID" : "INVALID"));

        scanner.close();
    }
}
