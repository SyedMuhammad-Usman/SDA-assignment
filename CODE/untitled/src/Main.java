import domain.Filter;
import domain.User;
import presentation.UserInterface;

public class Main {
    public static void main(String[] args) {
        // Instantiate User and UserInterface
        User user = new User("Alice", "U123");
        UserInterface ui = new UserInterface();

        // User navigates to the search page
        user.navigateToSearchPage(ui);

        // Capture filter criteria from user input
        Filter filter = ui.getFilterFromUser();

        // Display filtered cars based on user input
        ui.displayFilteredCars(filter);

        // Close the scanner to prevent resource leak
        ui.closeScanner();
    }
}
