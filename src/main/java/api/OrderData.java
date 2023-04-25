package api;

public class OrderData {
    public Integer code;

    public String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public OrderData(Integer code,String message) {
        this.code = code;
        this.message = message;
    }
}
