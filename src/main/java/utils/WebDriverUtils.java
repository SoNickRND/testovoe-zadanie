package utils;

import org.openqa.selenium.WebDriver;

public class WebDriverUtils {

	public static WebDriver getDriver() {
        if (LocalDriverManager.getDriver() != null) {
            return LocalDriverManager.getDriver();
        }
        return createNewDriver();
    }
	
	public static WebDriver createNewDriver() {
        WebDriver webDriver = WebDriverFactory.createInstance();
        LocalDriverManager.setDriver(webDriver);
        return webDriver;
    }
	
}
