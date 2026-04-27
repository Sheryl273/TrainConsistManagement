package test;

import main.UseCase16TrainConsistMgmt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase16TrainConsistMgmtTest {

    @Test
    public void testSort_BasicSorting() {
        int[] arr = {72, 56, 24, 70, 60};
        UseCase16TrainConsistMgmt.bubbleSort(arr);
        assertArrayEquals(new int[]{24, 56, 60, 70, 72}, arr);
    }

    @Test
    public void testSort_AlreadySortedArray() {
        int[] arr = {24, 56, 60, 70, 72};
        UseCase16TrainConsistMgmt.bubbleSort(arr);
        assertArrayEquals(new int[]{24, 56, 60, 70, 72}, arr);
    }

    @Test
    public void testSort_DuplicateValues() {
        int[] arr = {72, 56, 56, 24};
        UseCase16TrainConsistMgmt.bubbleSort(arr);
        assertArrayEquals(new int[]{24, 56, 56, 72}, arr);
    }

    @Test
    public void testSort_SingleElementArray() {
        int[] arr = {50};
        UseCase16TrainConsistMgmt.bubbleSort(arr);
        assertArrayEquals(new int[]{50}, arr);
    }

    @Test
    public void testSort_AllEqualValues() {
        int[] arr = {40, 40, 40};
        UseCase16TrainConsistMgmt.bubbleSort(arr);
        assertArrayEquals(new int[]{40, 40, 40}, arr);
    }
}