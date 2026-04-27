package main;

public class UseCase20TrainConsistMgmt {

    public static boolean searchBogie(String[] bogieIds, String key) {

        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        try {
            String[] bogieIds = {
                    "BG101",
                    "BG205",
                    "BG309"
            };

            boolean found = searchBogie(bogieIds, "BG205");

            if (found) {
                System.out.println("Bogie Found");
            } else {
                System.out.println("Bogie Not Found");
            }

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
