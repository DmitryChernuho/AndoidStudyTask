package steps;

import screens.ItemScreen;
import utils.Constants;

public class ItemScreenSteps {

    public static boolean isItemScreenDisplayed() {
        return new ItemScreen().state().waitForDisplayed();
    }

    public static boolean isItemSelected(String itemName) {
        ItemScreen itemScreen = new ItemScreen();
        return itemScreen.getNameOfItem().equals(itemName);
    }

    public static boolean isItemDiscountPriceCorrect() {
        ItemScreen itemScreen = new ItemScreen();
        int discountPrice = itemScreen.getItemOrdinalPrice() - (int) Math.ceil((double) itemScreen.getItemOrdinalPrice() * itemScreen.getItemDiscount() / Constants.ONE_HUNDRED_PERCENT);
        return itemScreen.getItemPrice() == discountPrice;
    }

    public static String clickOnSeller() {
        String sellerName;
        ItemScreen itemScreen = new ItemScreen();
        sellerName = itemScreen.getSellerName();
        itemScreen.clickOnSellerName();
        return sellerName;
    }
}
