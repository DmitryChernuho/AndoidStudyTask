package screens;

import aquality.appium.mobile.screens.Screen;
import org.openqa.selenium.By;

public abstract class BaseScreen extends Screen {

    protected BaseScreen(By locator, String screenName) {
        super(locator, screenName);
    }
}
