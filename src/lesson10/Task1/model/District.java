package lesson10.Task1.model;

/**
 * Created by: Umar
 * DateTime: 8/24/2024 2:49 PM
 */
public class District {
    private String districtName;

    private Regionn region;


    public District(String districtName, Regionn region) {
        this.districtName = districtName;
        this.region = region;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public Regionn getRegion() {
        return region;
    }

    public void setRegion(Regionn region) {
        this.region = region;
    }



    @Override
    public String toString() {
        return "District{" +
                "districtName='" + districtName + '\'' +
                ", region=" + region +
                '}';
    }
}
