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
public class GetCostTest {
    
    @Parameterized.Parameter(0)
    public double weightFactor;
    @Parameterized.Parameter(1)
    public double distanceFactor;
    @Parameterized.Parameter(2)
    public double cost;
    
    //test data for testAdd
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
            { 2.5,  2.0,   5.0}, // test case 1
            {10.0,  2.0,  20.0}, // test case 2
            {25.0,  2.0,  50.0}, // test case 3
            { 2.5,  2.0,   5.0}, // test case 4
            {10.0,  2.0,  20.0}, // test case 5
            {10.0,  2.0,  20.0}, // test case 6
            {25.0,  2.0,  50.0}, // test case 7
            { 2.5,  5.0,  12.5}, // test case 8
            {10.0,  5.0,  50.0}, // test case 9
            {25.0,  5.0, 125.0}, // test case 10
            { 2.5,  5.0,  12.5}, // test case 11
            {10.0,  5.0,  50.0}, // test case 12
            {10.0,  5.0,  50.0}, // test case 13
            {25.0,  5.0, 125.0}, // test case 14
            { 2.5, 10.0,  25.0}, // test case 15
            {10.0, 10.0, 100.0}, // test case 16
            {25.0, 10.0, 250.0}, // test case 17
            { 2.5, 10.0,  25.0}, // test case 18
            {10.0, 10.0, 100.0}, // test case 19
            {10.0, 10.0, 100.0}, // test case 20
            {25.0, 10.0, 250.0}, // test case 21
            { 2.5,  2.0,   5.0}, // test case 22
            { 2.5,  5.0,  12.5}, // test case 23
            { 2.5, 10.0,  25.0}, // test case 24
            { 2.5,  2.0,   5.0}, // test case 25
            { 2.5,  5.0,  12.5}, // test case 26
            { 2.5,  5.0,  12.5}, // test case 27
            { 2.5, 10.0,  25.0}, // test case 28
            {10.0,  2.0,  20.0}, // test case 29
            {10.0,  5.0,  50.0}, // test case 30
            {10.0, 10.0, 100.0}, // test case 31
            {10.0,  2.0,  20.0}, // test case 32
            {10.0,  5.0,  50.0}, // test case 33
            {10.0,  5.0,  50.0}, // test case 34
            {10.0, 10.0, 100.0}, // test case 35
            {25.0,  2.0,  50.0}, // test case 36
            {25.0,  5.0, 125.0}, // test case 37
            {25.0, 10.0, 250.0}, // test case 38
            {25.0,  2.0,  50.0}, // test case 39
            {25.0,  5.0, 125.0}, // test case 40
            {25.0,  5.0, 125.0}, // test case 41
            {25.0, 10.0, 250.0}, // test case 42
            { 2.5, 10.0,  25.0}, // test case 43
            {10.0,  5.0,  50.0}, // test case 44
            {25.0,  2.0,  50.0}, // test case 45
            { 2.5,  5.0,  12.5}, // test case 46
            {10.0, 10.0, 100.0}, // test case 47
            {25.0,  2.0,  50.0}, // test case 48
            {25.0, 10.0, 250.0}  // test case 49       
        };
        return Arrays.asList(data);
    } //end Collection--data

    @Test
    public void testGetCost() {
        System.out.println("getCost");
        assertEquals(cost, ShippingCosts.getCost(weightFactor, distanceFactor), 0.0);
    } //end testGetCost

} //end class GetCostTest

