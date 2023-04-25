package api;

public class OrderInfoData {
    public String requestId;
    public String message;

    public String getRequestId() {
        return requestId;
    }

    public String getMessage() {
        return message;
    }

    public OrderInfoData(String requestId,String message) {
        this.requestId = requestId;
        this.message = message;
    }
}
