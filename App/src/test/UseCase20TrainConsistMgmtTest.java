package test;

import main.UseCase20TrainConsistMgmt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase20TrainConsistMgmtTest {

    @Test
    public void testSearch_ThrowsExceptionWhenEmpty() {
        String[] arr = {};

        Exception e = assertThrows(
                IllegalStateException.class,
                () -> UseCase20TrainConsistMgmt.searchBogie(arr, "BG101")
        );

        assertEquals("No bogies available for search", e.getMessage());
    }

    @Test
    public void testSearch_AllowsSearchWhenDataExists() {
        String[] arr = {"BG101", "BG205"};

        assertDoesNotThrow(
                () -> UseCase20TrainConsistMgmt.searchBogie(arr, "BG101")
        );
    }

    @Test
    public void testSearch_BogieFoundAfterValidation() {
        String[] arr = {"BG101", "BG205", "BG309"};

        assertTrue(
                UseCase20TrainConsistMgmt.searchBogie(arr, "BG205")
        );
    }

    @Test
    public void testSearch_BogieNotFoundAfterValidation() {
        String[] arr = {"BG101", "BG205", "BG309"};

        assertFalse(
                UseCase20TrainConsistMgmt.searchBogie(arr, "BG999")
        );
    }

    @Test
    public void testSearch_SingleElementValidCase() {
        String[] arr = {"BG101"};

        assertTrue(
                UseCase20TrainConsistMgmt.searchBogie(arr, "BG101")
        );
    }
}
