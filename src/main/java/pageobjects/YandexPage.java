package pageobjects;

import org.openqa.selenium.By;

public class YandexPage extends BasePage {

    private static final String startPageSearchButton = "//div[@class='search2__button']//button";
    private static final String startPageSearchInput = "//*[@id='text']";

    public String getStartPageUrl() {
            return "https://ya.ru/";
        }

    public void openStartPage() {
        super.navigate(getStartPageUrl()); //from basepage
        }

    public void clickSearchButton() {
    	driver.findElement(By.xpath(startPageSearchButton)).click();
    }

    public void enterSearchText(String searchText) {
    	driver.findElement(By.xpath(startPageSearchInput)).sendKeys(searchText);
	}

}
