import data.PkFindMedicament;
import org.testng.Assert;
import org.testng.annotations.Test;

import static data.Constant.productName;

public class FindMedicament {


    @Test
    public static void medicament(){
        Assert.assertEquals(PkFindMedicament.getMedicament(),productName);
    }
}
