package structural.adapter;

public class ModernLogger implements IModernLogger{
    @Override
    public void logInfo(String message) {
        System.out.println(String.format("[MODERN INFO] %s", message));
    }

    @Override
    public void logWarning(String message) {
        System.out.println(String.format("[MODERN WARNING] %s", message));
    }

    @Override
    public void logError(String message) {
        System.out.println(String.format("[MODERN ERROR] %s", message));
    }
}
