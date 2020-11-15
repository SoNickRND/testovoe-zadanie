package utils;

import org.openqa.selenium.WebDriver;

public class LocalDriverManager {
    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        System.out.println("Getting webDriver");
        return webDriver.get();
    }

    public static void setDriver(WebDriver driver) {
        System.out.println("Setting webDriver");
        webDriver.set(driver);
    }

}
