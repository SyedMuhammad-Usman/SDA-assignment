package domain;

public class Car {
    private int id;
    private String name;  // Added name for the car
    private String type;
    private double price;
    private String transmission;

    public Car(int id, String name, String type, double price, String transmission) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.transmission = transmission;
    }

    public String getDetails() {
        return "Car ID: " + id + ", Name: " + name + ", Type: " + type + ", Price: " + price + ", Transmission: " + transmission;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getTransmission() {
        return transmission;
    }
}
