package api;

public class GetPriceData {
    public Integer pharmacyId;
    public Integer productId;
    public Double insurancePrice;

    public Integer getPharmacyId() {
        return pharmacyId;
    }

    public Integer getProductId() {
        return productId;
    }

    public Double getInsurancePrice() {
        return insurancePrice;
    }

    public GetPriceData(Integer pharmacyId, Integer productId, Double insurancePrice) {
        this.pharmacyId = pharmacyId;
        this.productId = productId;
        this.insurancePrice = insurancePrice;

    }
}
