package utils;

import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;

public class JsonUtil {

    public static String getJsonValue(String file, String value) {
        ISettingsFile environment = new JsonSettingsFile(file + ".json");
        return environment.getValue("/" + value).toString();
    }
}
