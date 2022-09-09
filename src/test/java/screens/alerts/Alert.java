package screens.alerts;

import aquality.appium.mobile.application.AqualityServices;
import aquality.appium.mobile.elements.interfaces.IButton;
import org.openqa.selenium.By;

public class Alert {
    private static final IButton okBtn = AqualityServices.getElementFactory().getButton(By.id("android:id/button1"), "OkAlertButton");

    public static void tapOk() {
        okBtn.click();
    }
}
