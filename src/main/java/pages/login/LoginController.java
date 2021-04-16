package pages.login;

import static pages.login.LoginElement.getLoginElement;

public class LoginController {

    LoginElement loginElement = getLoginElement();

    public LoginController withUsername(String username) {
        loginElement.USER_NAME.sendKeys(username);
        return this;
    }

    public LoginController password(String password) {
        loginElement.PASSWORD.sendKeys(password);
        return this;
    }

    public void submit() {
        loginElement.SUBMIT.click();
    }
}
