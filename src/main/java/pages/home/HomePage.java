package pages.home;

public class HomePage {

    HomeController homeController;
    HomeVerifier homeVerifier;

    private HomePage(HomeController homeController, HomeVerifier homeVerifier) {
        this.homeController = homeController;
        this.homeVerifier = homeVerifier;
    }

    public static HomePage getHomePage() {
        return new HomePage(new HomeController(), new HomeVerifier());
    }

    public HomeController act() {
        return homeController;
    }

    public HomeVerifier verify() {
        return homeVerifier;
    }
}
