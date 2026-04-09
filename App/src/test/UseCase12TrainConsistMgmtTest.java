package test;

import main.UseCase12TrainConsistMgmt.GoodsBogie;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase12TrainConsistMgmtTest {

    @Test
    public void testSafety_AllBogiesValid() {
        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Rectangular", "Coal")
        );

        boolean isSafe = bogies.stream()
                .allMatch(b -> !b.type.equalsIgnoreCase("Cylindrical") || b.cargo.equalsIgnoreCase("Petroleum"));

        assertTrue(isSafe, "All cylindrical bogies carry Petroleum. Train should be safe.");
    }

    @Test
    public void testSafety_CylindricalWithInvalidCargo() {
        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Coal"),
                new GoodsBogie("Rectangular", "Grain")
        );

        boolean isSafe = bogies.stream()
                .allMatch(b -> !b.type.equalsIgnoreCase("Cylindrical") || b.cargo.equalsIgnoreCase("Petroleum"));

        assertFalse(isSafe, "Cylindrical bogie carrying Coal is invalid. Train should be unsafe.");
    }

    @Test
    public void testSafety_EmptyBogieList() {
        List<GoodsBogie> bogies = Arrays.asList();

        boolean isSafe = bogies.stream()
                .allMatch(b -> !b.type.equalsIgnoreCase("Cylindrical") || b.cargo.equalsIgnoreCase("Petroleum"));

        assertTrue(isSafe, "Empty bogie list should be considered safe.");
    }
}
