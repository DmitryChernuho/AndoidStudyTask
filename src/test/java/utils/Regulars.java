package utils;

public class Regulars {

    public static int getOnlyNumbers(String value) {
        return Integer.parseInt(value.replaceAll("[^0-9]", ""));
    }
}
