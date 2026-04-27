package test;

import main.UseCase19TrainConsistMgmt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase19TrainConsistMgmtTest {

    @Test
    public void testBinarySearch_BogieFound() {
        String[] arr = {
                "BG101","BG205","BG309","BG412","BG550"
        };

        assertTrue(
                UseCase19TrainConsistMgmt.binarySearch(arr, "BG309")
        );
    }

    @Test
    public void testBinarySearch_BogieNotFound() {
        String[] arr = {
                "BG101","BG205","BG309","BG412","BG550"
        };

        assertFalse(
                UseCase19TrainConsistMgmt.binarySearch(arr, "BG999")
        );
    }

    @Test
    public void testBinarySearch_FirstElementMatch() {
        String[] arr = {
                "BG101","BG205","BG309","BG412","BG550"
        };

        assertTrue(
                UseCase19TrainConsistMgmt.binarySearch(arr, "BG101")
        );
    }

    @Test
    public void testBinarySearch_LastElementMatch() {
        String[] arr = {
                "BG101","BG205","BG309","BG412","BG550"
        };

        assertTrue(
                UseCase19TrainConsistMgmt.binarySearch(arr, "BG550")
        );
    }

    @Test
    public void testBinarySearch_SingleElementArray() {
        String[] arr = {"BG101"};

        assertTrue(
                UseCase19TrainConsistMgmt.binarySearch(arr, "BG101")
        );
    }

    @Test
    public void testBinarySearch_EmptyArray() {
        String[] arr = {};

        assertFalse(
                UseCase19TrainConsistMgmt.binarySearch(arr, "BG101")
        );
    }

    @Test
    public void testBinarySearch_UnsortedInputHandled() {
        String[] arr = {
                "BG309","BG101","BG550","BG205","BG412"
        };

        assertTrue(
                UseCase19TrainConsistMgmt.binarySearch(arr, "BG205")
        );
    }
}
