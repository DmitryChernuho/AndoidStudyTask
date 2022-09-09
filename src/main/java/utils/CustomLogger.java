package utils;

import aquality.selenium.core.logging.Logger;

import static java.lang.String.format;

public class CustomLogger {
    private static final Logger LOGGER = Logger.getInstance();

    public static void step(int step, String message) {
        LOGGER.info(format("Step %s - %s", step, message));
    }
}
