package shippingcosts;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class GetDistanceFactorTest {
    
    @Parameterized.Parameter(0)
    public double distance;
    @Parameterized.Parameter(1)
    public double distanceFactor;
    
    //test data for testAdd
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
            {50.0, 2.0}, // test case 1
            {250.0, 5.0}, // test case 8
            {550.0, 10.0}, // test case 15
            {55.0, 2.0}, // test case 22
            {255.0, 5.0}, // test case 23
            {555.0, 10.0}, // test case 24
            {99.9, 2.0}, // test case 25
            {100.0, 5.0}, // test case 26
            {499.9, 5.0}, // test case 27
            {500.0, 10.0}, // test case 28
            {512.3, 10.0}, // test case 43
            {253.3, 5.0}, // test case 44
            {98.6, 2.0}, // test case 45
            {102.3, 5.0}, // test case 46
            {952.0, 10.0}, // test case 47
            {78.0, 2.0}, // test case 48
            {3500.0, 10.0} // test case 49
        };
        return Arrays.asList(data);
    } //end Collection--data

    @Test
    public void testGetCost() {
        System.out.println("getDistanceFactor");
        assertEquals(distanceFactor, ShippingCosts.getDistanceFactor(distance), 0.0);
    } //end testGetWeightFactor

} //end class GetDistanceFactorTest

