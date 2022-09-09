package steps;

import aquality.appium.mobile.elements.interfaces.IButton;
import screens.SelectCityScreen;
import utils.RandomUtil;

import java.util.List;

public class SelectCityScreenSteps {

    public static boolean isEnteredCityNameInSearchField(String cityName) {
        SelectCityScreen selectCityScreen = new SelectCityScreen();
        selectCityScreen.enterCityInSearchFiled(cityName);
        return selectCityScreen.getSearchFieldValue().equals(cityName);
    }

    public static boolean selectCityByName(String cityName) {
        SelectCityScreen selectCityScreen = new SelectCityScreen();
        selectCityScreen.enterCityInSearchFiled(cityName);
        if(selectCityScreen.getCountryElementsList().isEmpty()) {
            selectCityScreen.clearSearchField();
            return false;
        }
        return selectCityScreen.clickOnCityByName(cityName);
    }

    public static String getRandomCityFromList() {
        SelectCityScreen selectCityScreen = new SelectCityScreen();
        List<IButton> cityList = selectCityScreen.getCountryElementsList();
        return RandomUtil.getRandomItemFromList(cityList).getText();
    }
}
