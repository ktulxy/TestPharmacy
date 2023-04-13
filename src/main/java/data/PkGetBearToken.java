package data;

import static data.Constant.requestBody;
import static data.Constant.urlbeartoken;
import static io.restassured.RestAssured.given;

public class PkGetBearToken {

    public static void token(){

        String responce = given()
                .header("Content-type", "application/json")
                .body(requestBody).when().post(Constant.url + urlbeartoken)
                .then().statusCode(200).extract().response().asString();
        System.out.println(responce);
        //  return responce;
    }
}
