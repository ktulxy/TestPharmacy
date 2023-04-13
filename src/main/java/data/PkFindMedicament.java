package data;

import static data.Constant.url;
import static data.Constant.urlgetmedicament;
import static io.restassured.RestAssured.given;

public class  PkFindMedicament{

    public static String getMedicament(){

    String medicament = given()
            .param(
                    "type", "balance")

            .param(
                    "nameFilter", "Мастодинон")
            .header(
                    "Authorization",
                    "Bearer " + PkGetBearToken.token())
            .when()
            .get(url + urlgetmedicament)
            .then().statusCode(200).extract().jsonPath().getString("data.productName");
    return medicament;
    }
}
