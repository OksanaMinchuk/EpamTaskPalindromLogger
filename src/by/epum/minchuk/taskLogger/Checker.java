package by.epum.minchuk.taskLogger;



import org.apache.log4j.Logger;

import java.util.Stack;

public class Checker {

    private static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    public static boolean isPolindrom(String string) {
        int count = string.length()/2;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < count; i++) {
            stack.push(string.charAt(i));
            LOGGER.info("stack.push " + string.charAt(i));
        }
         //count += string.length()%2 == 0 ? 0 : 1;
        if (string.length()%2 != 0) {
            count++;
            LOGGER.info("increase count by 1");
        }

        for (int i = count; i < string.length(); i++) {
            char ch = stack.pop();
            LOGGER.info("stack.pop " + ch + " - char value " + string.charAt(i));
            if (ch != string.charAt(i)) {
                return false;
            }
        }
        LOGGER.info("stack is empty");

        return true;

    }
}
