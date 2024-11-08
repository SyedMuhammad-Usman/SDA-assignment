package presentation;

import domain.Car;
import domain.Filter;
import service.SearchService;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private SearchService searchService;
    private Scanner scanner;

    public UserInterface() {
        this.searchService = new SearchService();
        this.scanner = new Scanner(System.in);
    }

    public void displayCarSearchPage() {
        System.out.println("Welcome to the Car Search Page. Please select your filter options.");
    }


    public Filter getFilterFromUser() {
        System.out.print("Enter Car Type (e.g., SUV, Sedan, Hyper Car): "); // Include Hyper Car
        String carType = scanner.nextLine();

        System.out.print("Enter Minimum Price: ");
        double minPrice = scanner.nextDouble();

        System.out.print("Enter Maximum Price: ");
        double maxPrice = scanner.nextDouble();

        scanner.nextLine(); // consume newline left-over

        System.out.print("Enter Transmission Type (Automatic/Manual): ");
        String transmission = scanner.nextLine();

        return new Filter(carType, minPrice, maxPrice, transmission);
    }


    public void displayFilteredCars(Filter filter) {
        List<Car> filteredCars = searchService.applyFilter(filter);
        if (filteredCars.isEmpty()) {
            System.out.println("No cars found matching the criteria.");
        } else {
            System.out.println("Filtered Car Results:");
            filteredCars.forEach(car -> System.out.println(car.getDetails()));
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
