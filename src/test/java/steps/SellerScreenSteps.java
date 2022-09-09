package steps;

import screens.SellerScreen;

public class SellerScreenSteps {

    public static boolean isSellerScreenDisplayed() {
        return new SellerScreen().state().waitForDisplayed();
    }

    public static boolean isSellerInformationCorrect(String sellerName) {
        SellerScreen sellerScreen = new SellerScreen();
        return sellerScreen.getSellerName().equals(sellerName) && sellerScreen.getSellerName().equals(sellerName);
    }
}
