package service;

import data.CarDatabase;
import domain.Car;
import domain.Filter;
import java.util.List;

public class SearchService {
    private CarDatabase carDatabase;

    public SearchService() {
        this.carDatabase = CarDatabase.getInstance();
    }

    public List<Car> applyFilter(Filter filter) {
        List<Car> filteredCars = carDatabase.getAvailableCars(filter);
        return filteredCars;
    }
}
