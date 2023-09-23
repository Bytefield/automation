package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseSteps {

    protected static WebDriver driver;
    protected static WebDriverWait wait;
    public BaseSteps() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        System.setProperty("webdriver.chrome.driver", "/home/papi/workspace/automation/src/main/resources/drivers/chromedriver");
    }

}
