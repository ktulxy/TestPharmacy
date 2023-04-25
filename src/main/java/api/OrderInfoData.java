package api;

public class OrderInfoData {
    public String requestId;
    public Integer orderId;
    public String orderType;
    public String statusName;
    public String message;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public OrderInfoData(String requestId, Integer orderId, String orderType, String statusName, String message) {
        this.requestId = requestId;
        this.orderId = orderId;
        this.orderType = orderType;
        this.statusName = statusName;
        this.message = message;
    }
}
