package data;

import api.OrderCancelData;
import api.Specification;
import org.testng.Assert;

import java.util.List;

import static data.Constant.*;
import static io.restassured.RestAssured.given;

public class PkOrderCancel {

    public static void orderCancel() {

        List<OrderCancelData> cancel = given()
                .spec(Specification.requestSpec(url))
                .param("action", "view")
                .when()
                .put(urlViewInfo + orderRequestId)
                .then()
                .spec(Specification.responseSpec())
                .log().ifValidationFails()
                .extract().jsonPath().getList("info", OrderCancelData.class);
        Assert.assertTrue(cancel.stream().allMatch(x->x.getId().equals(orderRequestId)));
        Assert.assertTrue(cancel.stream().allMatch(x->x.getMessage().equals(cancelMessage)));
    }
}
