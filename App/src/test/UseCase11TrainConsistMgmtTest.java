package test;

import main.UseCase11TrainConsistMgmt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase11TrainConsistMgmtTest {

    @Test
    public void testRegex_ValidTrainID() {
        assertTrue(UseCase11TrainConsistMgmt.validateTrainID("TRN-1234"));
    }

    @Test
    public void testRegex_InvalidTrainIDFormat() {
        assertFalse(UseCase11TrainConsistMgmt.validateTrainID("TRAIN12"));
        assertFalse(UseCase11TrainConsistMgmt.validateTrainID("TRN12A"));
        assertFalse(UseCase11TrainConsistMgmt.validateTrainID("1234-TRN"));
    }

    @Test
    public void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(UseCase11TrainConsistMgmt.validateTrainID("TRN-123"));
        assertFalse(UseCase11TrainConsistMgmt.validateTrainID("TRN-12345"));
    }

    @Test
    public void testRegex_ValidCargoCode() {
        assertTrue(UseCase11TrainConsistMgmt.validateCargoCode("PET-AB"));
    }

    @Test
    public void testRegex_InvalidCargoCodeFormat() {
        assertFalse(UseCase11TrainConsistMgmt.validateCargoCode("PET-ab"));
        assertFalse(UseCase11TrainConsistMgmt.validateCargoCode("PET123"));
        assertFalse(UseCase11TrainConsistMgmt.validateCargoCode("AB-PET"));
    }

    @Test
    public void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(UseCase11TrainConsistMgmt.validateCargoCode("PET-aB"));
    }

    @Test
    public void testRegex_EmptyInputHandling() {
        assertFalse(UseCase11TrainConsistMgmt.validateTrainID(""));
        assertFalse(UseCase11TrainConsistMgmt.validateCargoCode(""));
    }

    @Test
    public void testRegex_ExactPatternMatch() {
        assertFalse(UseCase11TrainConsistMgmt.validateTrainID("TRN-1234XYZ"));
        assertFalse(UseCase11TrainConsistMgmt.validateCargoCode("PET-ABCD"));
    }
}
