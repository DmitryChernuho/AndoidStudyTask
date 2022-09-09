package screens;

import aquality.appium.mobile.elements.interfaces.ILabel;
import org.openqa.selenium.By;

public class SellerScreen extends BaseScreen{
    private static final By sellerNameLocator = By.xpath("//android.view.ViewGroup[@resource-id='com.zdv.secretcloset:id/toolbar']/android.widget.TextView");
    private final ILabel sellerNameLabel = getElementFactory().getLabel(sellerNameLocator, "Item price");
    private final ILabel sellerCityLabel = getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvItemSellerCity"), "Item price");

    public SellerScreen() {
        super(sellerNameLocator, "Seller name");
    }

    public String getSellerName() {
        return sellerNameLabel.getText();
    }

    public String getSellerCity() {
        return sellerCityLabel.getText();
    }
}
