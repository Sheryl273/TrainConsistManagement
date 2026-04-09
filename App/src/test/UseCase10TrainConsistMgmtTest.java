package test;

import main.UseCase10TrainConsistMgmt;
import main.UseCase10TrainConsistMgmt.Bogie;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase10TrainConsistMgmtTest {

    @Test
    public void testReduce_TotalSeatCalculation() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", "Passenger", 72),
                new Bogie("AC Chair", "Passenger", 56),
                new Bogie("First Class", "Passenger", 50)
        );
        int totalSeats = UseCase10TrainConsistMgmt.calculateTotalSeats(bogies);
        assertEquals(178, totalSeats, "Total seats should be 178");
    }

    @Test
    public void testReduce_MultipleBogiesAggregation() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", "Passenger", 72),
                new Bogie("AC Chair", "Passenger", 56),
                new Bogie("First Class", "Passenger", 50),
                new Bogie("Rectangular", "Goods", 200)
        );
        int totalSeats = UseCase10TrainConsistMgmt.calculateTotalSeats(bogies);
        assertEquals(178, totalSeats, "Only passenger seats should be counted");
    }

    @Test
    public void testReduce_SingleBogieCapacity() {
        List<Bogie> bogies = Collections.singletonList(
                new Bogie("Sleeper", "Passenger", 72)
        );
        int totalSeats = UseCase10TrainConsistMgmt.calculateTotalSeats(bogies);
        assertEquals(72, totalSeats, "Total seats should match single bogie capacity");
    }

    @Test
    public void testReduce_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();
        int totalSeats = UseCase10TrainConsistMgmt.calculateTotalSeats(bogies);
        assertEquals(0, totalSeats, "Total seats should be 0 for empty list");
    }

    @Test
    public void testReduce_OriginalListUnchanged() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", "Passenger", 72),
                new Bogie("AC Chair", "Passenger", 56)
        );
        int originalSize = bogies.size();
        UseCase10TrainConsistMgmt.calculateTotalSeats(bogies);
        assertEquals(originalSize, bogies.size(), "Original list size should remain unchanged");
    }
}