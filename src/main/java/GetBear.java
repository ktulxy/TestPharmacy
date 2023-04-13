//import static io.restassured.RestAssured.given;
//
//public class GetBear {
//
//    private static String requestBody = "{\"username\":\"ingo4api\",\"password\":\"33b805ff-ef78-4e03-b1ae-c1b8a67c1c29\"}";
//    private static String beartoken = "users/login";
//
//
//
//    public static void ttt(){
//
//        String responce = given()
//                .header("Content-type", "application/json")
//                .body(requestBody).when().post(Constant.url + beartoken)
//                .then().statusCode(200).extract().response().asString();
//        System.out.println(responce);
//        //  return responce;
//    }
//}
