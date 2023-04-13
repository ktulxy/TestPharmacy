import data.PkFindMedicament;
import data.PkGetBearToken;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static data.Constant.productName;

public class FindMedicament {

    @BeforeMethod
    public static void getToken(){
        PkGetBearToken.token();
    }
    @Test
    public static void medicament(){
        Assert.assertEquals(PkFindMedicament.getMedicament(),productName);
    }
}
