package utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.HashMap;
import java.util.Map;

public class WebDriverFactory {

    private static ChromeOptions createChromeOptions() { 
        ChromeOptions chromeOptions = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_settings.popups", 0);
        chromeOptions.setExperimentalOption("prefs", prefs);

        return chromeOptions;
    }

    public static WebDriver createInstance() {
        WebDriver webDriver = null;
        String desiredBrowserName = "Chrome";

        System.out.println("Creating webDriver");
        switch(desiredBrowserName) {
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
                webDriver = new ChromeDriver(createChromeOptions());
                break;
            
            case "Edge":
                System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
                webDriver = new EdgeDriver();
                break;
            default:
                //work out what to do when a browser isn't needed
                throw new IllegalStateException("Browser is not supported");
        }
        return webDriver;


    }
}
