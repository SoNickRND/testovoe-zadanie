package steps;

import pageobjects.SearchPage;
import pageobjects.YandexPage;

public class YandexSteps {
    private YandexPage yandexPage;
    private SearchPage searchPage;

    public void openYandexStartPage() {
    	searchPage = new SearchPage();
    	searchPage.openStartPage();
    }
   
    public void openYaStartPage() {
    	yandexPage = new YandexPage();
    	yandexPage.openStartPage();
    }

    public void searchYaText() {
		yandexPage.enterSearchText("Основы автоматизации тестирования");
	}
    
    public void clickYaSearchButton() {
        yandexPage.clickSearchButton();
    }

}
