package Week7.labs.task1;

public class ClassLogger implements Logger{
    private String loggerName;

    public ClassLogger(String loggerName){
        this.loggerName=loggerName;
    }

    @Override
    public void logMessage(LogMessageProvider messageProvider){
        System.out.println("Class Logger [" + loggerName + "]: " + messageProvider.provideMessage());
    }
}
