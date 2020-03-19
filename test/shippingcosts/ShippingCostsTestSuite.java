package shippingcosts;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    shippingcosts.GetWeightFactorTest.class,
    shippingcosts.GetDistanceFactorTest.class,
    shippingcosts.GetCostTest.class
})

public class ShippingCostsTestSuite {
    
}
