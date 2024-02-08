package entities;

public class Customer {
    private int id;
    private String City;

    public Customer() {
    }
    public Customer(int id, String city) {
        this.id = id;
        this.City = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
