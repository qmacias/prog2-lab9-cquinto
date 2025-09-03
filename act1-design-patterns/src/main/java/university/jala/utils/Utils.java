package university.jala.utils;

import java.util.Scanner;
import java.util.logging.*;

/**
 * @author Cristian Quinto
 */
public class Utils {
    private static Scanner scanner = new Scanner(System.in);
    private static Logger logger = Logger.getLogger(Utils.class.getName());

    public static String readString() {
        String result = "";

        try {
            result = scanner.nextLine();
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage());
        }

        return result;
    }

    public static int readInteger() {
        int result = -1;

        try {
           result = Integer.parseInt(readString());
        } catch (Exception ex) {
            logger.log(Level.SEVERE, ex.getMessage());
        }

        return result;
    }

    public static void close() {
        scanner.close();
    }

}
