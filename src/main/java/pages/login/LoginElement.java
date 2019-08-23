package pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static driver.manager.DriverFactory.getChromeDriver;

public class LoginElement {

    WebDriver driver;

    private LoginElement() {
        this.driver = getChromeDriver();
        PageFactory.initElements(driver, this);
    }

    public static LoginElement getLoginElement() {
        return new LoginElement();
    }

    @FindBy(xpath = "//input[@placeholder='Email / Username']")
    WebElement USER_NAME;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement PASSWORD;

    @FindBy(xpath = "//button[@class='ui red large fluid button']")
    WebElement SUBMIT;



}
