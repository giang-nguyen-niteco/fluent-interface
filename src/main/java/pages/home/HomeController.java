package pages.home;

import static pages.home.HomeElement.getHomeElement;

public class HomeController {

    HomeElement homeElement = getHomeElement();

    public void goToLoginPage() {
        homeElement.LOGIN_BUTTON.click();
    }

}
