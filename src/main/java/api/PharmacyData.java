package api;

public class PharmacyData {
    private Integer pharmacyId;


    public PharmacyData(Integer pharmacyId, String pharmacyName, String orgCode) {
        this.pharmacyId = pharmacyId;

    }

    public Integer getPharmacyId() {
        return pharmacyId;
    }

}
