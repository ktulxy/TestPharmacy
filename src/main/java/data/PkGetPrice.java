package data;

import api.GetPriceData;
import api.Specification;
import org.testng.Assert;

import java.util.List;

import static data.Constant.*;
import static io.restassured.RestAssured.given;
public class PkGetPrice {

    public static void getPrice(){

       List<GetPriceData> price = given()
               .spec(Specification.requestSpec(url))
                .queryParam("cityCode", "64")
                .body("[1285]")
                .when()
                .post(urlGetPrice)
                .then()
                .spec(Specification.responseSpec())
                .log().ifValidationFails()
                .extract().body().jsonPath().getList("data", GetPriceData.class);
        Assert.assertTrue(price.stream().anyMatch(x->x.getInsurancePrice().equals(pharmacyPrice)));

    }
}
