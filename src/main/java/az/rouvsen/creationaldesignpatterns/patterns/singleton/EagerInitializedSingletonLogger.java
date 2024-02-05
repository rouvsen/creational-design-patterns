package az.rouvsen.creationaldesignpatterns.patterns.singleton;

public class EagerInitializedSingletonLogger extends SingletonBase{
    private static final EagerInitializedSingletonLogger instance = new EagerInitializedSingletonLogger();
    private EagerInitializedSingletonLogger() {}

    public static EagerInitializedSingletonLogger getInstance() {
        return instance;
    }
}
