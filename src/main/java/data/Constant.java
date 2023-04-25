package data;

public class Constant {
    //Credentials
    public static String user_email = "omudritsky@gmail.com";
    public static String username = "ingo4api";
    public static String password = "33b805ff-ef78-4e03-b1ae-c1b8a67c1c29";
    //  public static String bearToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjEwOCwidXNlcm5hbWUiOiJpbmdvNGFwaSIsInNjb3BlIjpbImdlbmVyYWxfdXNlciIsImF3c191c2VyIl0sImVtYWlsIjoib2NoZXJuaXlAaW5nby51YSIsImNvbXBhbnlJZCI6NzAzLCJpbnN1cmFuY2VJZCI6MywicXR5VHlwZSI6MSwicHJpY2VUeXBlIjoyLCJlbXBsb3llZUlkIjowLCJpc0Jsb2NrZWQiOjAsInBheW1lbnRUcnVzdCI6MCwicGF5bWVudENvZGUiOm51bGwsImRlbGl2ZXJ5Q29kZSI6bnVsbCwiaWF0IjoxNjgxMzgxMDIzLCJleHAiOjE2ODE0Njc0MjN9.Kb98xFz7TQaBPI6E3zi1ZSctxy9vN_3JGfS0xjuAEao";
    public static String requestBody = "{\"username\":\"ingo4api\",\"password\":\"33b805ff-ef78-4e03-b1ae-c1b8a67c1c29\"}";

    //Url
    public static String url = "https://api-all.apteka911.com.ua/api/";
    public static String urlbeartoken = "v2/users/login";
    public static String urlGetListPharmacy = "v2/aws/insurancecompanies/3/pharmacies";
    public static String urlFindMedicament = "v2/products/selected/balance";
    public static String urlGetPrice = "v2/aws/insurancecompanies/3/pharmacies/0/products/list/balance"; //Данные об остатках и ценах в аптеке
    public static String urlOrder = "/v2/orders/order"; //Делаем заказ
    public static String urlViewInfo = "/v2/orders/"; //Отмена или просмотр

    //Assert

    public static Integer medicamentId = 1285; //Ищем медикамент
    public static Integer pharmacyId = 412; //Сверяем аптеку
    public static Double pharmacyPrice = 322.5; //Сверяем цену
    public static Integer orderCode = 0; // 0 Успех при создании
    public static String orderMessage = "[:OK] Request CREATE-ORDER received and queued";
    public static String orderRequestId = "AA123AA777"; // Сверяем номер договора
    public static String infoMessage = "[:OK] ORDER ACTION <view> : undefined";
    public static String infoRequestId = "AA123AA777";
    public static String cancelRequestId = "AA123AA777";
    public static String cancelMessage = "[:OK] ORDER ACTION <cancel> : [:OK] PUBLISH TO CHANNEL sync : request";





}
