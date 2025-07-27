package structural.adapter;

public class Demo {
    public static void main(String[] args) {
        IModernLogger modernLogger = new ModernLogger();

        processActivity(modernLogger);

        LegacyLogger legacyLogger = new LegacyLogger();
        modernLogger = new LegacyLoggerAdapter(legacyLogger);

        processActivity(modernLogger);
    }

    private static void processActivity(IModernLogger modernLogger){
        modernLogger.logError("Failed with error");
        modernLogger.logInfo("Failed with info");
        modernLogger.logWarning("Failed with warning");
    }
}
