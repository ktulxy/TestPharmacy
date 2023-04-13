import data.PkGetBearToken;
import data.PkGetListPharmacy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetListPharmacy {


    @BeforeMethod
    public static void getToken(){
        PkGetBearToken.token();
    }

    @Test
    public static void takePharmacy(){
        Assert.assertEquals(PkGetListPharmacy.pkTakePharmacy(),"3");
    }
}
