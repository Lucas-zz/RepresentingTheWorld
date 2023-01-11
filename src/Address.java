public class Address {
    private String state;
    private String city;
    private String district;
    private String street;
    private int number;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return this.street;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }
}
