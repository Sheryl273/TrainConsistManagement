package main;

public class UseCase18TrainConsistMgmt {

    public static boolean linearSearch(String[] bogieIds, String key) {

        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
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

        String searchKey = "BG309";

        boolean found = linearSearch(bogieIds, searchKey);

        if (found) {
            System.out.println(searchKey + " Found");
        } else {
            System.out.println(searchKey + " Not Found");
        }
    }
}
