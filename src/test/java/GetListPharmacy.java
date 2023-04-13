import data.PkGetListPharmacy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetListPharmacy {

//    @BeforeTest
//    public static void takeToken(){
//        GetToken.token();
//    }

    @Test
    public static void takePharmacy(){
        Assert.assertEquals(PkGetListPharmacy.pkTakePharmacy(),"3");
    }
}
