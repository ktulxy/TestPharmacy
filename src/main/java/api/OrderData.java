package api;

public class OrderData {
    public Integer code;
    public String requestId;
    public String message;

    public Integer getCode() {
        return code;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getMessage() {
        return message;
    }

    public OrderData(Integer code, String requestId, String message) {
        this.code = code;
        this.requestId = requestId;
        this.message = message;
    }
}
