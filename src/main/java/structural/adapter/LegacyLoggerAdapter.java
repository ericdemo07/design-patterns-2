package structural.adapter;

public class LegacyLoggerAdapter implements IModernLogger {
    private LegacyLogger legacyLogger;

    public LegacyLoggerAdapter(LegacyLogger legacyLogger) {
        this.legacyLogger = legacyLogger;
    }

    @Override
    public void logInfo(String message) {
        legacyLogger.writeMessage("INFO", message);
    }

    @Override
    public void logWarning(String message) {
        legacyLogger.writeMessage("WARNING", message);
    }

    @Override
    public void logError(String message) {
        legacyLogger.writeMessage("ERROR", message);
        legacyLogger.outputDebug("Error detail for: " + message);
    }
}
