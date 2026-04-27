package main;

import java.util.Arrays;

public class UseCase19TrainConsistMgmt {

    public static boolean binarySearch(String[] bogieIds, String key) {

        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = key.compareTo(bogieIds[mid]);

            if (compare == 0) {
                return true;
            } else if (compare < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        String key = "BG309";

        boolean found = binarySearch(bogieIds, key);

        if (found) {
            System.out.println(key + " Found");
        } else {
            System.out.println(key + " Not Found");
        }
    }
}
