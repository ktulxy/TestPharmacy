package data;

import api.OrderCancelData;
import api.Specification;
import org.testng.Assert;

import java.util.List;

import static data.Constant.url;
import static data.Constant.urlViewInfo;
import static io.restassured.RestAssured.given;

public class PkOrderCancel {

    public static void orderCancel() {

        List<OrderCancelData> cancel = given()
                .spec(Specification.requestSpec(url))
                .header("action", "cancel")
                .when()
                .put(urlViewInfo)
                .then()
                .spec(Specification.responseSpec())
                .log().ifValidationFails()
                .extract().jsonPath().getList("info", OrderCancelData.class);
        Assert.assertTrue(cancel.stream().allMatch(x->x.getId().equals("cancelRequestId")));
        Assert.assertTrue(cancel.stream().allMatch(x->x.getMessage().equals("cancelMessage")));
    }
}
