package data;

import api.MedicamentData;
import api.Specification;
import org.testng.Assert;

import java.util.List;

import static data.Constant.*;
import static io.restassured.RestAssured.given;

public class  PkFindMedicament{


    public static void getMedicament(){

        List<MedicamentData> medicament = given()
                .spec(Specification.requestSpec(url))
                .queryParams(
                        "name", "Мастодинон")
                .when()
                .get(urlFindMedicament)
                .then()
                .spec(Specification.responseSpec())
                .log().ifValidationFails()
                .extract().jsonPath().getList("data", MedicamentData.class);
          Assert.assertTrue(medicament.stream().anyMatch(x->x.getProductId().equals(medicamentId)));
    }
}
