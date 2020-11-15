package pageobjects;

import org.openqa.selenium.WebDriver;
import utils.WebDriverUtils;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {

    protected WebDriver driver;

    public BasePage() {
        this.driver = WebDriverUtils.getDriver(); // instance check
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // 10 seconds Implicit Wait
        this.driver.manage().window().maximize();
    }

    public void navigate(String url) {
        driver.get(url);
    }

}