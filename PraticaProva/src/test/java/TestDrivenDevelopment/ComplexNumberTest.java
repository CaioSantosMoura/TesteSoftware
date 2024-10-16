package TestDrivenDevelopment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexNumberTest {

    @Test
    public void testAddition() {
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(1, 1);
        ComplexNumber result = c1.add(c2);
        assertEquals(3, result.getReal());
        assertEquals(4, result.getImaginary());
    }

    @Test
    public void testSubtration() {
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(1, 1);
        ComplexNumber result = c1.add(c2);
        assertEquals(3, result.getReal());
        assertEquals(4, result.getImaginary());
    }
}
