package Week7.labs.task1;

import Week7.labs.task1.ClassLogger;
import Week7.labs.task1.Logger;
import Week7.labs.task1.RecordLogger;

public class Start {
    public static void main(String[] args) {
        Logger recordLogger=new RecordLogger("RecordLogger");
        recordLogger.logMessage(()->"Logging with lambda function in a record");
        Logger classLogger=new ClassLogger("ClassLogger");
        classLogger.logMessage(()->"Logging with lambda function in a class");
    }
}
