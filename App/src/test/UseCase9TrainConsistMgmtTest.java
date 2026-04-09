package test;

import main.UseCase9TrainConsistMgmt;
import main.UseCase9TrainConsistMgmt.Bogie;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase9TrainConsistMgmtTest {

    @Test
    public void testGroupBogiesByType() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", "Passenger", 72),
                new Bogie("AC Chair", "Passenger", 56),
                new Bogie("First Class", "Passenger", 50),
                new Bogie("Rectangular", "Goods", 200),
                new Bogie("Cylindrical", "Goods", 150)
        );

        Map<String, List<Bogie>> grouped = UseCase9TrainConsistMgmt.groupBogiesByType(bogies);

        // Assertions
        assertEquals(2, grouped.size(), "There should be 2 types of bogies");

        // Passenger checks
        assertTrue(grouped.containsKey("Passenger"), "Passenger group should exist");
        assertEquals(3, grouped.get("Passenger").size(), "Passenger group should have 3 bogies");

        // Goods checks
        assertTrue(grouped.containsKey("Goods"), "Goods group should exist");
        assertEquals(2, grouped.get("Goods").size(), "Goods group should have 2 bogies");

        // Original list remains unchanged
        assertEquals(5, bogies.size(), "Original list size should remain 5");
    }

    @Test
    public void testEmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();
        Map<String, List<Bogie>> grouped = UseCase9TrainConsistMgmt.groupBogiesByType(bogies);
        assertTrue(grouped.isEmpty(), "Grouping an empty list should return an empty map");
    }
}
