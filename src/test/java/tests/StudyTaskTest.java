package tests;

import org.junit.jupiter.api.Test;
import org.testng.Assert;
import steps.*;
import utils.Configuration;
import utils.CustomLogger;

public class StudyTaskTest {

    @Test
    public void androidAppAutomationTest() {
        String cityName;
        String itemName;
        String sellerName;

        CustomLogger.step(1, "Click on city label");
        Assert.assertTrue(MainScreenSteps.clickOnCityButton(), "Select city screen is not open");

        CustomLogger.step(2, "Type 'Los Angeles' in search field");
        cityName = Configuration.getCityName();
        Assert.assertTrue(SelectCityScreenSteps.isEnteredCityNameInSearchField(cityName),
                "'Los Angeles' is not typed in search field");

        CustomLogger.step(3, "Click on search result 'Los Angeles, CA'");
        if(!SelectCityScreenSteps.selectCityByName(cityName)) {
            cityName = SelectCityScreenSteps.getRandomCityFromList();
            Assert.assertTrue(SelectCityScreenSteps.selectCityByName(cityName),
                    "Not was type random city in search field and not was click on search result");
        }
        Assert.assertTrue(MainScreenSteps.isMainScreenDisplayed(),
                "Not was type 'Los Angeles' in search field and not was click on search result 'Los Angeles, CA'");

        CustomLogger.step(4, "Check selected region");
        Assert.assertTrue(MainScreenSteps.isSelectedCityDisplayed(cityName),
                "Selected region is invalid");

        CustomLogger.step(5, "Select first item with discount");
        itemName = MainScreenSteps.clickOnItemWithDiscount();
        Assert.assertTrue(ItemScreenSteps.isItemScreenDisplayed(),
                "First item is not selected");

        CustomLogger.step(6, "Check that selected item is displaying");
        Assert.assertTrue(ItemScreenSteps.isItemSelected(itemName),
                "Selected item is not displaying");

        CustomLogger.step(7, "Check that old price, discount and price with discount are correct");
        Assert.assertTrue(ItemScreenSteps.isItemDiscountPriceCorrect(),
                "old price, discount and price with discount are correct are invalid");

        CustomLogger.step(8, "Click on seller");
        sellerName = ItemScreenSteps.clickOnSeller();
        Assert.assertTrue(SellerScreenSteps.isSellerScreenDisplayed(),
                "Seller was not be clicked");

        CustomLogger.step(9, "Check that seller information is correct (name, city)");
        Assert.assertTrue(SellerScreenSteps.isSellerInformationCorrect(sellerName),
                "Seller information is invalid");
    }
}
