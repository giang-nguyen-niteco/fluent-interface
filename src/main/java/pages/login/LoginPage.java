package pages.login;

public class LoginPage {

    LoginController loginController;

    private LoginPage() {
    }

    public LoginPage(LoginController loginController) {
        this.loginController = loginController;
    }

    public static LoginPage getLoginPage() {
        return new LoginPage( new LoginController());
    }

    public LoginController act() {
        return loginController;
    }
}
