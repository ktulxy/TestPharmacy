package data;


import static data.Constant.*;
import static io.restassured.RestAssured.given;

public class PkGetListPharmacy {


    public static String pkTakePharmacy(){
        String response = given().param(
                        "isApiOnly","true").
                headers(
                        "Authorization",
                        "Bearer " + bearToken).
                when().get(
                      url + urlgetlistpharmacy).
              //  then().statusCode(200).extract().response().asString();
                then().statusCode(200).extract().jsonPath().getString("insuranceId");

        System.out.println(response);

        return response;
    }
}
