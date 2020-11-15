package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class SearchPage extends BasePage {

    private static final String searchResult = "search-result";
    private static final String misspellMessage = "//div[@class='misspell__message']"; 
    private static final String topNewsWidget = "wd-_topnews"; 
    private static final String weatherWidget = "wd-_weather";
    private static final String yandexDateDay = "//span[@class='datetime__day']";
    private static final String yandexDateMonth = "//span[@class='datetime__month']";
    
    public String getDayText() {
      return driver.findElement(By.xpath(yandexDateDay)).getText();
    }
    public String getMonthText() {
      return driver.findElement(By.xpath(yandexDateMonth)).getText();
    }
    
    private int getNumberFromText(String text) {
      return Integer.parseInt(text.replaceAll("\\D+", ""));
      }
    
    public Number getDayNumber() {
      return getNumberFromText(getDayText());
    
    }
    
    public int getMonthNumber() {
      return getNumberFromText(getMonthText());
      }
    
    public boolean isWeaterWidgetDisplayed() {
        try {  return driver.findElement(By.id(weatherWidget)).isDisplayed();}
          catch (NoSuchElementException e) {return false;}
    }
    
    public boolean isTopNewsWidgetDisplayed() {
    try {  return driver.findElement(By.id(topNewsWidget)).isDisplayed();}
      catch (NoSuchElementException e) {return false;}
    }
    
    public boolean isMisspellMessageDisplayed() {
    try {  return driver.findElement(By.xpath(misspellMessage)).isDisplayed();}
      catch (NoSuchElementException e) {return false;}
    }
    
    public boolean isSearchResultDisplayed() {
      try {  return driver.findElement(By.id(searchResult)).isDisplayed();}
      catch (NoSuchElementException e) {return false;}
    }

    public String getStartPageUrl() {
            return "https://yandex.ru/";
        }

    public void openStartPage() {
        super.navigate(getStartPageUrl());
        }
}