package features;

import org.junit.jupiter.api.Test;
import pages.home.HomePage;
import pages.login.LoginPage;

import static pages.home.HomePage.getHomePage;
import static pages.login.LoginPage.getLoginPage;

public class LoginSpec extends BaseTest{

    HomePage home = getHomePage();
    LoginPage login = getLoginPage();

    @Test
    public void admin_login_successfully(){
        home.act().goToLoginPage();
        login.act().withUsername("god")
                .password("12345678")
                .submit();

        home.verify().verifyUserImageDisplayed();
    }

}
