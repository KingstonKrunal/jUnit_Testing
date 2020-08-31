import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest extends Calculation {
    @Test
    public void testFindMax(){
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
        assertEquals(-2,Calculation.findMax(new int[]{-12,-3,-4,-2}));
    }
    @Test
    public void testCube(){
        assertEquals(27,Calculation.cube(3));
    }
    @Test
    public void testReverseWord(){
        assertEquals("ym eman si nahk ",Calculation.reverseWord("my name is khan"));
    }
}