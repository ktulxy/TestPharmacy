package data;

import api.OrderInfoData;
import api.Specification;
import org.testng.Assert;

import java.util.List;

import static data.Constant.*;
import static io.restassured.RestAssured.given;

public class PkOrderInfo {

    public static void OrderInfo(){

        List<OrderInfoData> info = given()
                .spec(Specification.requestSpec(url))
                .param("action", "view")
                .when()
                .put(urlViewInfo)
                .then()
                .spec(Specification.responseSpec())
                .log().ifValidationFails()
                .extract().jsonPath().getList("info",OrderInfoData.class);
        Assert.assertTrue(info.stream().allMatch(x->x.getMessage().equals(infoMessage)));
        Assert.assertTrue(info.stream().allMatch(x->x.getRequestId().equals(infoRequestId)));
    }
}
