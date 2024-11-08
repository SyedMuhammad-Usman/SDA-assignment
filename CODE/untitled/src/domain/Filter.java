package domain;

public class Filter {
    private String carType;
    private double minPrice;
    private double maxPrice;
    private String transmission;

    public Filter(String carType, double minPrice, double maxPrice, String transmission) {
        this.carType = carType;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.transmission = transmission;
    }

    public String getCarType() { return carType; }
    public double getMinPrice() { return minPrice; }
    public double getMaxPrice() { return maxPrice; }
    public String getTransmission() { return transmission; }
}
