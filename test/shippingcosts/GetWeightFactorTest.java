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
public class GetWeightFactorTest {
    
    @Parameterized.Parameter(0)
    public double weight;
    @Parameterized.Parameter(1)
    public double weightFactor;
    
    //test data for testAdd
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
            { 5.0,  2.5},    // test case 1
            {15.0, 10.0},    // test case 2
            {30.0, 25.0},    // test case 3
            { 9.9,  2.5},    // test case 4
            {10.0, 10.0},    // test case 5
            {24.9, 10.0},    // test case 6
            {25.0, 25.0},    // test case 7
            { 6.5,  2.5},    // test case 22
            {16.5, 10.0},    // test case 29
            {31.5, 25.0},    // test case 36
            { 4.3,  2.5},    // test case 43
            {12.6, 10.0},    // test case 44
            {26.3, 25.0},    // test case 45
            { 2.5,  2.5},    // test case 46
            {11.6, 10.0},    // test case 47
            {29.9, 25.0},    // test case 48
            {26.5, 25.0}     // test case 49
        };
        return Arrays.asList(data);
    } //end Collection--data

    @Test
    public void testGetWeightFactor() {
        System.out.println("getWeightFactor");
        assertEquals(weightFactor, ShippingCosts.getWeightFactor(weight), 0.0);
    } //end testGetWeightFactor

} //end class GetWeightFactorTest

