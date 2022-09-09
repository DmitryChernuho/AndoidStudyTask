package steps;

import aquality.appium.mobile.application.AqualityServices;
import screens.MainScreen;
import screens.SelectCityScreen;
import screens.alerts.Alert;

public class MainScreenSteps {

    public static boolean isMainScreenDisplayed() {
        return new MainScreen().state().waitForDisplayed();
    }

    public static boolean clickOnCityButton() {
        new MainScreen().clickOnCityButton();
        Alert.tapOk();
        return new SelectCityScreen().state().waitForDisplayed();
    }

    public static boolean isSelectedCityDisplayed(String cityName) {
        MainScreen mainScreen = new MainScreen();
        return AqualityServices.getConditionalWait().waitFor(() -> mainScreen.getCityName().equals(cityName));
    }

    public static String clickOnItemWithDiscount() {
        String itemName;
        MainScreen mainScreen = new MainScreen();
        itemName = mainScreen.getNameOfDiscountItemLabel();
        mainScreen.clickOnItemWithDiscount();
        return itemName;
    }
}
