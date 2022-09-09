package screens;

import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.elements.interfaces.ILabel;
import org.openqa.selenium.By;
import utils.Regulars;

public class ItemScreen extends BaseScreen {
    private static final By nameOfItemById = By.id("com.zdv.secretcloset:id/tvItemBrand");
    private final IButton nameOfItemButton = getElementFactory().getButton(nameOfItemById, "Name of item");
    private final ILabel itemPriceLabel = getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvItemPrice"), "Item price");
    private final ILabel itemDiscountLabel= getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvItemDiscount"), "Item discount");
    private final ILabel itemOrdinalPriceLabel = getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvItemOriginalPrice"), "Item ordinal price");
    private final ILabel sellerName = getElementFactory().getLabel(By.id("com.zdv.secretcloset:id/tvItemSellerName"), "Seller name");

    public ItemScreen() {
        super(nameOfItemById, "Name of item");
    }

    public String getNameOfItem() {
        return nameOfItemButton.getText();
    }

    public int getItemPrice() {
        return Regulars.getOnlyNumbers(itemPriceLabel.getText());
    }

    public int getItemDiscount() {
        return Regulars.getOnlyNumbers(itemDiscountLabel.getText());
    }

    public int getItemOrdinalPrice() {
        return Regulars.getOnlyNumbers(itemOrdinalPriceLabel.getText());
    }

    public String getSellerName() {
        return sellerName.getText();
    }

    public void clickOnSellerName() {
        sellerName.click();
    }

}
