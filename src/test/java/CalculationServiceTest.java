import org.junit.jupiter.api.Test;
import service.CalculationService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationServiceTest {

    private final CalculationService calculationService = new CalculationService();

    @Test
    public void testMultiply() {
        assertEquals(20.0, calculationService.multiply(4.0, 5.0));
        assertEquals(0.0, calculationService.multiply(0.0, 5.0));
        assertEquals(-20.0, calculationService.multiply(-4.0, 5.0));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculationService.divide(10.0, 5.0));
        assertEquals(0.0, calculationService.divide(0.0, 5.0));
        assertEquals(-2.0, calculationService.divide(-10.0, 5.0));
    }
}