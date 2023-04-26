package api;

public class PharmacyData {
    private Integer pharmacyId;
    private Integer count;

    public Integer getPharmacyId() {
        return pharmacyId;
    }

    public Integer getCount() {
        return count;
    }

    public PharmacyData(Integer pharmacyId, Integer count) {
        this.pharmacyId = pharmacyId;
        this.count = count;
    }
}
