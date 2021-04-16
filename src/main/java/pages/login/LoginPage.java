package pages.login;

public class LoginPage {

    LoginController loginController;

    public LoginPage(LoginController loginController) {
        this.loginController = loginController;
    }

    public static LoginPage getLoginPage() {
        return new LoginPage(new LoginController());
    }

    public LoginController act() {
        return loginController;
    }
}
