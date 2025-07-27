package structural.adapter;

public class LegacyLogger {
    public void writeMessage(String severity, String text) {
        System.out.println(String.format("[LEGACY LOG] [%s] %s", severity, text));
    }

    public void outputDebug(String debugInfo) {
        System.out.println("[LEGACY DEBUG] " + debugInfo);
    }
}