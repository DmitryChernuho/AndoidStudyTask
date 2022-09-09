package screens;

import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.elements.interfaces.ILabel;
import org.openqa.selenium.By;

public class MainScreen extends BaseScreen {
    private static final By cityButtonByIdLocator = By.id("com.zdv.secretcloset:id/tvToolbarCity");
    private final IButton cityButton = getElementFactory().getButton(cityButtonByIdLocator, "Country");

    private final ILabel nameOfDiscountItemLabel = getElementFactory().getLabel(By.xpath(
            "//android.widget.TextView[@resource-id='com.zdv.secretcloset:id/tvDiscount']" +
                    "/ancestor::android.widget.RelativeLayout[@resource-id='com.zdv.secretcloset:id/rlBanner']" +
                    "//android.widget.TextView[@resource-id='com.zdv.secretcloset:id/tvBrand']"), "Name of item");

    public MainScreen() {
        super(cityButtonByIdLocator, "Main screen");
    }

    public void clickOnCityButton() {
        cityButton.click();
    }

    public void clickOnItemWithDiscount() {
        nameOfDiscountItemLabel.click();
    }

    public String getCityName() {
        return cityButton.getText();
    }

    public String getNameOfDiscountItemLabel() {
        return nameOfDiscountItemLabel.getText();
    }
}
