package data;

import io.restassured.response.Response;

import static data.Constant.url;
import static data.Constant.urlgetmedicament;
import static io.restassured.RestAssured.given;

public class  PkFindMedicament{

    public static String medicament(){

    String medicament = given()
            .param(
                    "type", "balance")

            .param(
                    "nameFilter", "Мастодинон")
            .header(
                    "Autorization",
                    "Bearer " + PkGetBearToken.token())
            .when()
            .get(url + urlgetmedicament)
            .then().statusCode(200).extract().jsonPath().getString("data");
    return medicament;
    }
}
