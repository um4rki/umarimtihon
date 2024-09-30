package lesson10.Task1.model;

/**
 * Created by: Umar
 * DateTime: 8/24/2024 2:48 PM
 */
public class Address {
    private String streetName;
    private Integer homeNumber;

    private District district;

    public Address(String streetName, Integer homeNumber, District district) {
        this.streetName = streetName;
        this.homeNumber = homeNumber;
        this.district = district;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Integer getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(Integer homeNumber) {
        this.homeNumber = homeNumber;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }


    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                ", district=" + district +
                '}';
    }
}
