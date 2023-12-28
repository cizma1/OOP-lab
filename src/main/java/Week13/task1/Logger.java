package Week13.task1;

import java.util.logging.Level;

public class Logger {
    private static Logger instance;

    private Logger(){

    }

    public static synchronized Logger getInstance(){
        if(instance==null){
            instance=new Logger();
        }
        return instance;
    }

    public void log(String message){
        logMessage(Level.INFO, message);
    }

    public void logInfo(String message){
        logMessage(Level.INFO, message);
    }

    public void logWarning(String message){
        logMessage(Level.WARNING, message);
    }

    public void logError(String message){
        logMessage(Level.SEVERE, message);
    }

    private void logMessage(Level level, String message){
        System.out.println("[" + level + "] " + message);
    }
}
