package data;


import api.PharmacyData;
import api.Specification;
import org.testng.Assert;

import java.util.List;

import static data.Constant.url;
import static data.Constant.urlGetListPharmacy;
import static io.restassured.RestAssured.given;

public class PkGetListPharmacy {


    public static void pkTakePharmacy(){
        Specification.installSpec(Specification.requestSpec(url),Specification.responseSpec());

        List<PharmacyData> pharmacy = given()
                .param("isApiOnly","true")
                .when()
                .get(urlGetListPharmacy)
                .then()
                //.log().all()
                .extract().body().jsonPath().getList("data", PharmacyData.class);
        Assert.assertTrue(pharmacy.stream().allMatch(x->x.getPharmacyId().equals(412)));
    }
}
