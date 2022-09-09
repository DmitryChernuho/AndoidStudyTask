package utils;

public class Configuration {

    public static String getCityName() {
        return JsonUtil.getJsonValue("testdata", "city");
    }
}
