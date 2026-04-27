package test;

import main.UseCase18TrainConsistMgmt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase18TrainConsistMgmtTest {

    @Test
    public void testSearch_BogieFound() {
        String[] arr = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        assertTrue(
                UseCase18TrainConsistMgmt.linearSearch(arr, "BG309")
        );
    }

    @Test
    public void testSearch_BogieNotFound() {
        String[] arr = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        assertFalse(
                UseCase18TrainConsistMgmt.linearSearch(arr, "BG999")
        );
    }

    @Test
    public void testSearch_FirstElementMatch() {
        String[] arr = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        assertTrue(
                UseCase18TrainConsistMgmt.linearSearch(arr, "BG101")
        );
    }

    @Test
    public void testSearch_LastElementMatch() {
        String[] arr = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        assertTrue(
                UseCase18TrainConsistMgmt.linearSearch(arr, "BG550")
        );
    }

    @Test
    public void testSearch_SingleElementArray() {
        String[] arr = {"BG101"};

        assertTrue(
                UseCase18TrainConsistMgmt.linearSearch(arr, "BG101")
        );
    }
}