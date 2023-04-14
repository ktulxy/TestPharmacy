package data;

import static data.Constant.*;
import static io.restassured.RestAssured.given;
public class PkGetPrice {

    public static String getPrice(){
        String price = given()
                .queryParam("cityCode", "64")
                .header("Content-type", "application/json")
                .header("Authorization", "Bearer " + PkGetBearToken.token())
                .body("[1285]")
                .when()
                .post(url + urlGetPrice)
                .then().statusCode(200).extract().jsonPath().getString("data");
        return price;
    }

    public static String getProductAndPrice(){

        String getData = getPrice();
        String subData = getData.substring(120,137);
        return subData;
    }

}
