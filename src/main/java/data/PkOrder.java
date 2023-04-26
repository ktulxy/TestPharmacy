package data;

import api.OrderData;
import api.Specification;
import org.testng.Assert;

import java.util.List;

import static data.BodyOrder.bodyOrder;
import static data.Constant.*;
import static io.restassured.RestAssured.given;

public class PkOrder {

    public static void MakeOrder(){

        List<OrderData> order = given()
                .spec(Specification.requestSpec(url))
                .body(bodyOrder)
                .when()
                .post(urlOrder)
                .then()
                .spec(Specification.responseSpec200())
                .log().all()//ifValidationFails()
                .extract().jsonPath().getList("orders",OrderData.class);
        Assert.assertTrue(order.stream().allMatch(x->x.getCode().equals(orderCode)));
        Assert.assertTrue(order.stream().allMatch(x->x.getMessage().equals(orderMessage)));
        Assert.assertTrue(order.stream().allMatch(x->x.getMessage().equals(orderRequestId)));
    }
}
