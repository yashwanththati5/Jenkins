import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverAndWebdriverSetup {
    public static WebDriver driver;
    public static boolean isDriverOpen = false;
    static WebDriverWait wait = null;
    public void startTheDriver()
    {
        driver = new ChromeDriver();
        driver.manage().window().minimize();
        isDriverOpen = true;
    }
    public void startTheWebdriver()
    {
        wait = new WebDriverWait(driver, Duration.ofMillis(5000));
    }
    public void stopTheDriver()
    {
        driver.quit();
        isDriverOpen = false;
    }
    public void setupTheDriverAndWebdriver()
    {
        startTheDriver();
        startTheWebdriver();
    }
}
