import org.testng.Assert;
import org.testng.annotations.Test;

import static data.Constant.pharmacyPrice;
import static data.PkGetPrice.getProductAndPrice;

public class GetPrice {



    @Test
    public static void price(){

        Assert.assertEquals(getProductAndPrice(),pharmacyPrice);;
    }
}
