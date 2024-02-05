package az.rouvsen.creationaldesignpatterns.patterns.singleton;

public class StaticBlockInitializedSingletonLogger {
    private static final StaticBlockInitializedSingletonLogger instance;

    static {
        try {
            instance = new StaticBlockInitializedSingletonLogger();
        } catch (Exception ex) {
            throw new RuntimeException("Exception occurred while creating singleton instance.");
        }
    }

    private StaticBlockInitializedSingletonLogger() {}

    public static StaticBlockInitializedSingletonLogger getInstance() {
        return instance;
    }
}
