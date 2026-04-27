package test;

import main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase14TrainConsistMgmtTest {

    @Test
    public void testException_ValidCapacityCreation() throws Exception {
        PassengerBogie bogie = new PassengerBogie("Sleeper", 72);
        assertEquals(72, bogie.getCapacity());
    }

    @org.junit.Test
    @Test
    public void testException_NegativeCapacityThrowsException() {
        Exception e = assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("Sleeper", -10);
        });
        assertEquals("Capacity must be greater than zero", e.getMessage());
    }

    @Test
    public void testException_ZeroCapacityThrowsException() {
        Exception e = assertThrows(InvalidCapacityException.class, () -> {
            new PassengerBogie("AC Chair", 0);
        });
        assertEquals("Capacity must be greater than zero", e.getMessage());
    }

    @Test
    public void testException_ObjectIntegrityAfterCreation() throws Exception {
        PassengerBogie bogie = new PassengerBogie("First Class", 30);
        assertEquals("First Class", bogie.getBogieType());
        assertEquals(30, bogie.getCapacity());
    }
}
