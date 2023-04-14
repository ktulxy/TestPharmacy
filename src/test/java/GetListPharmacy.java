import data.PkGetListPharmacy;
import org.testng.Assert;
import org.testng.annotations.Test;

import static data.Constant.insuranceIdent;

public class GetListPharmacy {




    @Test
    public static void takePharmacy(){
        Assert.assertEquals(PkGetListPharmacy.pkTakePharmacy(),insuranceIdent);
    }
}
