package domain;

import presentation.UserInterface;
import service.SearchService;

public class User {
    private String name;
    private String userId;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public void navigateToSearchPage(UserInterface ui) {
        ui.displayCarSearchPage();
    }

    public void applyFilters(Filter filter, SearchService searchService) {
        searchService.applyFilter(filter);
    }
}
