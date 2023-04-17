package data;

import api.MedicamentData;
import api.Specification;
import org.testng.Assert;

import java.util.List;

import static data.Constant.url;
import static data.Constant.urlgetmedicament;
import static io.restassured.RestAssured.given;

public class  PkFindMedicament{

    public static void getMedicament(){

        Specification.installSpec(Specification.requestSpec(url),Specification.responseSpec());

        List<MedicamentData> medicament = given()
            .param(
                    "type", "balance")
            .param(
                    "nameFilter", "Мастодинон")
            .when()
            .get(urlgetmedicament)
            .then()
//            .log().all()
            .extract().jsonPath().getList("data",MedicamentData.class);

        Assert.assertTrue(medicament.stream().anyMatch(x->x.getProductId().equals(1285)));
        Assert.assertTrue(medicament.stream().anyMatch(x->x.getProductName().endsWith("Мастодинон краплі оральні флакон 50 мл ")));
        Assert.assertTrue(medicament.stream().anyMatch(x->x.getNetPrice().equals(249.9)));

    }
}
