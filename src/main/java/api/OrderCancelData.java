package api;

public class OrderCancelData {
    public String id;
    public String message;

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public OrderCancelData(String id, String message) {
        this.id = id;
        this.message = message;
    }
}
