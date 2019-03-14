package by.epum.minchuk.taskLogger;

import org.apache.log4j.Logger;

public class Main {

    private static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    public static void main(String[] args) {

        String string = new String("12344321");
        LOGGER.info("Result is: " + Checker.isPolindrom(string));

    }
}
