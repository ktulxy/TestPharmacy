import api.MedicamentData;
import api.Specification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static data.Constant.url;
import static data.Constant.urlFindMedicament;
import static io.restassured.RestAssured.given;

public class FindMedicament {

    @Test
    public static void Test1Status200() {
        List<MedicamentData> medicament = (List<MedicamentData>) makeQuery("Мастодинон", "data", Specification.responseSpec200(), true);
        Assert.assertTrue(medicament.stream().anyMatch(x -> x.getProductId().equals(medicamentId1)));
    }

    @Test
    public static void Test2Status200() {
        List<MedicamentData> medicament = (List<MedicamentData>) makeQuery("Парацетамол", "data", Specification.responseSpec200(), true);
        Assert.assertTrue(medicament.stream().anyMatch(x -> x.getProductId().equals(medicamentId2)));
    }

    @Test
    public static void Test3Status400() {
        Integer status = (Integer) makeQuery("M", "statusCode", Specification.responseSpec400(), false);
        Assert.assertEquals(medicamentStatus, status);
    }

    @Test
    public static void Test4StatusNotFind() {
        Integer count = (Integer) makeQuery("Абрг", "count", Specification.responseSpec200(), false);
        Assert.assertEquals(medicamentCount, count);
    }

    public static Integer medicamentId1 = 1285;
    public static Integer medicamentId2 = 1612;
    public static Integer medicamentStatus = 400;
    public static Integer medicamentCount = 0;

    public static List<MedicamentData> makeQuery(String name, String path, ResponseSpecification responseSpecification) {
        return given()
                .spec(Specification.requestSpec(url))
                .queryParams("name", name)
                .when()
                .get(urlFindMedicament)
                .then()
                .spec(responseSpecification)
                .log().all()
                .extract().jsonPath().getList(path, MedicamentData.class);
    }

    public static Object makeQuery(String name, String path, ResponseSpecification responseSpecification, boolean useList) {
        if (useList) {
            return makeQuery(name, path, responseSpecification);
        } else {
            return given()
                    .spec(Specification.requestSpec(url))
                    .queryParams("name", name)
                    .when()
                    .get(urlFindMedicament)
                    .then()
                    .spec(responseSpecification)
                    .log().all()
                    .extract().jsonPath().get(path);
        }
    }
}

