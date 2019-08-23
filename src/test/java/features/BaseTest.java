package features;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static driver.manager.DriverFactory.getChromeDriver;
import static driver.manager.DriverFactory.getWebDriverWait;

public class BaseTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeEach
    public void setUp(){
        driver = getChromeDriver();
        driver.get("https://portal-rga.niteco.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        wait = getWebDriverWait();
    }

    @AfterEach
    public void tearDown(){
        if (driver != null) {
            driver.close();
        }
    }

}
