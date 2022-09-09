package screens;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.elements.ElementType;
import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.elements.interfaces.ITextBox;
import org.openqa.selenium.By;

import java.util.List;

public class SelectCityScreen extends BaseScreen {
    private static final By searchFieldByIdLocator = By.id("com.zdv.secretcloset:id/etSearchTest");
    private final String cityXpath = "//android.widget.TextView[@text = '%s']";
    private final By someCityXpathLocator = By.xpath("//android.widget.TextView[@resource-id='com.zdv.secretcloset:id/tvCityItemName']");
    private final ITextBox citySearchTextBox = AqualityServices.getElementFactory().getTextBox(searchFieldByIdLocator, "Text field");

    public SelectCityScreen() {
        super(searchFieldByIdLocator, "Country screen");
    }

    public List<IButton> getCountryElementsList() {
        return AqualityServices.getElementFactory().findElements(someCityXpathLocator, ElementType.BUTTON);
    }

    public void enterCityInSearchFiled(String city) {
        citySearchTextBox.sendKeys(city);
    }

    public void clearSearchField() {
        citySearchTextBox.clear();
    }

    public boolean clickOnCityByName(String cityName) {
        String xpath = String.format(cityXpath, cityName);
        AqualityServices.getElementFactory().getLabel(By.xpath(xpath), "City label").click();
        return new MainScreen().state().waitForDisplayed();
    }

    public String getSearchFieldValue() {
        return citySearchTextBox.getText();
    }
}
