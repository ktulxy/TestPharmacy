package data;


import api.PharmacyData;
import api.Specification;
import org.testng.Assert;

import java.util.List;

import static data.Constant.*;
import static io.restassured.RestAssured.given;

public class PkGetListPharmacy {


    public static void pkTakePharmacy(){


        List<PharmacyData> pharmacy = given()
                .spec(Specification.requestSpec(url))
                .param("isApiOnly","true")
                .when()
                .get(urlGetListPharmacy)
                .then()
                .spec(Specification.responseSpec())
                .log().ifValidationFails()
                .extract().body().jsonPath().getList("data", PharmacyData.class);
        Assert.assertTrue(pharmacy.stream().allMatch(x->x.getPharmacyId().equals(pharmacyId)));
    }
}
