package data;

import domain.Car;
import domain.Filter; // Make sure this is included
import java.util.ArrayList;
import java.util.List;

public class CarDatabase {
    private static CarDatabase instance; // Singleton instance
    private List<Car> cars;

    // Private constructor
    private CarDatabase() {
        this.cars = new ArrayList<>();
        initializeCars();
    }

    // Public method to get the single instance
    public static CarDatabase getInstance() {
        if (instance == null) {
            instance = new CarDatabase();
        }
        return instance;
    }

    // Initialize car data
    private void initializeCars() {
        // Add cars here
        cars.add(new Car(1, "G Wagon", "SUV", 70.0, "Automatic"));
        cars.add(new Car(2, "Fortuner", "SUV", 65.0, "Automatic"));
        cars.add(new Car(3, "Land Cruiser", "SUV", 80.0, "Manual"));
        cars.add(new Car(4, "Honda Civic", "Sedan", 30.0, "Automatic"));
        cars.add(new Car(5, "Toyota Grande", "Sedan", 35.0, "Manual"));
        cars.add(new Car(6, "Toyota Camry", "Sedan", 40.0, "Automatic"));
        cars.add(new Car(7, "Bugatti", "Hyper Car", 200.0, "Automatic"));
        cars.add(new Car(8, "McLaren", "Hyper Car", 180.0, "Manual"));
        cars.add(new Car(9, "BMW i8", "Hyper Car", 150.0, "Automatic"));
    }

    public List<Car> getAvailableCars(Filter filter) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getType().equalsIgnoreCase(filter.getCarType()) && // Use getCarType() here
                    car.getPrice() >= filter.getMinPrice() &&
                    car.getPrice() <= filter.getMaxPrice() &&
                    car.getTransmission().equalsIgnoreCase(filter.getTransmission())) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

}
