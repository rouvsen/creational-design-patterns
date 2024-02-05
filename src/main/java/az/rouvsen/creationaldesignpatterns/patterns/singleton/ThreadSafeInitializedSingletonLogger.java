package az.rouvsen.creationaldesignpatterns.patterns.singleton;

public class ThreadSafeInitializedSingletonLogger {
    private static ThreadSafeInitializedSingletonLogger instance;

    private ThreadSafeInitializedSingletonLogger() {}

    public static synchronized ThreadSafeInitializedSingletonLogger getInstance() {
        if (instance == null){
            instance = new ThreadSafeInitializedSingletonLogger();
        }
        return instance;
    }
}
