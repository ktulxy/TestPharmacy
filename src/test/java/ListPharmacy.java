import api.PharmacyData;
import api.Specification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static data.Constant.*;
import static io.restassured.RestAssured.given;

public class ListPharmacy {


    @Test
    public static void FindPharmacyIsApiTrue(){
        List<PharmacyData> pharmacyList = takePharmacy("true","data",Specification.responseSpec200());
        Assert.assertTrue(pharmacyList.stream().allMatch(x->x.getPharmacyId().equals(pharmacyId)));
    }

    @Test
    public static void FindPharmacyIsApiFalse(){
        Integer count = (Integer) takePharmacy("false", "count", "0",false,Specification.responseSpec200());
        Assert.assertTrue(count > pharmacyCount);
    }

    @Test
    public static void isApiFalseCity(){
        Integer count = (Integer) takePharmacy("false","count","64", false, Specification.responseSpec200());
        Assert.assertTrue(count > pharmacyCountCityCode);
    }

    @Test
    public static void ifCityCodeNotValid(){
        Integer count = (Integer) takePharmacy("false","count","A64", false, Specification.responseSpec200());
        Assert.assertEquals(count,null);
    }


    public static Integer pharmacyId = 412; // if api true
    public static Integer pharmacyCount = 1000; // if cityCode = 0
    public static Integer pharmacyCountCityCode = 100; // if cityCode = 64

    public static List<PharmacyData> takePharmacy(String isApi, String path, ResponseSpecification responseSpecification) {
        return given()
                .spec(Specification.requestSpec(url))
                .queryParams("isApiOnly", isApi)
                .when()
                .get(urlGetListPharmacy)
                .then()
                .log().ifValidationFails()
                .extract().jsonPath().getList(path, PharmacyData.class);
    }

    public static Object takePharmacy(String isApi, String path, String cityCode, boolean useList, ResponseSpecification responseSpecification) {
        if (useList) {
            return takePharmacy(isApi,path,responseSpecification);
        } else {
            return given()
                    .spec(Specification.requestSpec(url))
                    .queryParams("isApiOnly", isApi)
                    .queryParams("cityCode", cityCode)
                    .when()
                    .get(urlGetListPharmacy)
                    .then()
                    .log().ifValidationFails()
                    .extract().jsonPath().get(path);
        }
    }
}
