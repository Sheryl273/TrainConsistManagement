package test;

import main.UseCase8TrainConsistMgmt;
import main.UseCase8TrainConsistMgmt.Bogie;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase8TrainConsistMgmtTest {

    @Test
    public void testFilterHighCapacityBogies() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 50),
                new Bogie("Executive Chair", 80)
        );

        List<Bogie> filtered = UseCase8TrainConsistMgmt.filterHighCapacityBogies(bogies, 60);

        assertEquals(2, filtered.size());
        assertTrue(filtered.stream().anyMatch(b -> b.getName().equals("Sleeper")));
        assertTrue(filtered.stream().anyMatch(b -> b.getName().equals("Executive Chair")));

        // Original list should remain unchanged
        assertEquals(4, bogies.size());
    }
}
