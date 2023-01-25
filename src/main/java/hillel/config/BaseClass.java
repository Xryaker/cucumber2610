package hillel.config;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    static public WebDriver driver;
    @BeforeClass
    public static void starT() {
        BaseClass.driver = DriverConfig.createDriver(Browsers.CHROMEINCOGNITO);
    }
    @AfterClass
    public static void enD() throws InterruptedException {
        Thread.sleep(3000);
        BaseClass.driver.quit();
    }
}
