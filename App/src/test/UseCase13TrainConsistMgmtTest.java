package test;

import main.UseCase13TrainConsistMgmt;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase13TrainConsistMgmtTest {

    @Test
    public void testExecutionTimeMeasurement() {
        List bogies = new ArrayList();

        long loopTime = UseCase13TrainConsistMgmt.measureLoopTime(bogies);
        long streamTime = UseCase13TrainConsistMgmt.measureStreamTime(bogies);

        assertTrue(loopTime >= 0);
        assertTrue(streamTime >= 0);
    }

    @Test
    public void testMethodsNotNull() {
        List bogies = new ArrayList();

        assertNotNull(UseCase13TrainConsistMgmt.filterUsingLoop(bogies));
        assertNotNull(UseCase13TrainConsistMgmt.filterUsingStream(bogies));
    }

    @Test
    public void testSameResultSize() {
        List bogies = new ArrayList();

        assertEquals(
                UseCase13TrainConsistMgmt.filterUsingLoop(bogies).size(),
                UseCase13TrainConsistMgmt.filterUsingStream(bogies).size()
        );
    }
}