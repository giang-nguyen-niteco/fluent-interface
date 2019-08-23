package pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static driver.manager.DriverFactory.getChromeDriver;

public class HomeElement {

    WebDriver driver;
    private HomeElement() {
        this.driver = getChromeDriver();
        PageFactory.initElements(driver, this);
    }

    public static HomeElement getHomeElement() {
        return new HomeElement();
    }

    @FindBy(xpath = "//a[@class='ui button login']")
    WebElement LOGIN_BUTTON;

    @FindBy(xpath = "//i[@class='user circle large icon']")
    WebElement USER_IMAGE;



}
