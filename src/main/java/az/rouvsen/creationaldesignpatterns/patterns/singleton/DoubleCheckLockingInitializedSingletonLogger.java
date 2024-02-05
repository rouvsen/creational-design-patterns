package az.rouvsen.creationaldesignpatterns.patterns.singleton;

public class DoubleCheckLockingInitializedSingletonLogger {
    private static DoubleCheckLockingInitializedSingletonLogger instance;
    private DoubleCheckLockingInitializedSingletonLogger() {}

    public static DoubleCheckLockingInitializedSingletonLogger getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockingInitializedSingletonLogger.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockingInitializedSingletonLogger();
                }
            }
        }
        return instance;
    }
}
