package api;

public class MedicamentData {
    private Integer productId;
    public String productName;
    public Double netPrice;

    public MedicamentData(Integer productId, String productName, Double netPrice) {
        this.productId = productId;
        this.productName = productName;
        this.netPrice = netPrice;
    }
    public MedicamentData() {

    }

    public Integer getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public Double getNetPrice() {
        return netPrice;
    }
}
