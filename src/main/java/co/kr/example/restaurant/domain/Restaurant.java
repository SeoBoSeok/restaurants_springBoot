package co.kr.example.restaurant.domain;

public class Restaurant {

    private final Long id;
    private final String name;
    private final String address;

    public Object getId() {
        return id;
    }

    public Restaurant(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getInformation() {
        return name + " in " + address;
    }

}
