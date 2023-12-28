package Week13.task1;

public class Start {
    public static void main(String[] args) {
        Logger logger=Logger.getInstance();

        logger.logInfo("Application started");

        logger.log("This is a general message");
        logger.logWarning("This is a warning message");
        logger.logError("This is an error message");

        Logger anotherLogger=Logger.getInstance();
        anotherLogger.logInfo("Another logger instance");
    }
}
