import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    // Create Logger object
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        logger.info("Application Started");

        int age = 20;

        if (age >= 18) {
            logger.info("User is eligible to vote.");
        } else {
            logger.warn("User is not eligible to vote.");
        }

        try {

            int result = 10 / 0;

        } catch (ArithmeticException e) {

            logger.error("Exception occurred: Division by zero.");

        }

        logger.info("Application Ended");
    }
}