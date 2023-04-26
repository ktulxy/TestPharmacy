package api;

public class MedicamentData {
    private Integer productId;
    private Integer count;
    private Integer statusCode;

    public Integer getProductId() {
        return productId;
    }

    public Integer getCount() {
        return count;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public MedicamentData(Integer productId, Integer count, Integer statusCode) {
        this.productId = productId;
        this.count = count;
        this.statusCode = statusCode;
    }
}
