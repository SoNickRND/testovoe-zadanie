import java.util.Calendar;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import pageobjects.SearchPage;
import pageobjects.YandexPage;
import steps.YandexSteps;
import utils.WebDriverUtils;

public class NewTest {

	YandexSteps yandexSteps = new YandexSteps();
	YandexPage yandexPage = new YandexPage();
	SearchPage searchPage = new SearchPage();
	
  @Test
  public void searchSomething() {
	  yandexSteps.openYaStartPage();
	  yandexSteps.searchYaText();
	  yandexSteps.clickYaSearchButton();
      Assert.assertTrue(searchPage.isSearchResultDisplayed());
      Assert.assertFalse(searchPage.isMisspellMessageDisplayed());
  }
  
  @Test
  public void checkYandexDate() {
	  yandexSteps.openYandexStartPage();
	  Assert.assertTrue(searchPage.isTopNewsWidgetDisplayed());
      Assert.assertTrue(searchPage.isWeaterWidgetDisplayed());
      Date date = new Date(); 
      Calendar calendar = Calendar.getInstance();
      calendar.setTime(date);
      Assert.assertEquals(searchPage.getDayNumber(), calendar.get(Calendar.DAY_OF_MONTH));
      Assert.assertEquals(searchPage.getMonthNumber(), calendar.get(Calendar.MONTH) + 1);
  }
  
  @AfterSuite()
  public void quitBrowser() {
      WebDriverUtils.getDriver().quit();
  }


}
