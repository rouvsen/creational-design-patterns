package az.rouvsen.creationaldesignpatterns.patterns.singleton;

public class BillPughInitializedSingletonLogger extends SingletonBase {
    private BillPughInitializedSingletonLogger() {}
    private static class InnerStaticInitializerSingletonHelper {
        private static final BillPughInitializedSingletonLogger INSTANCE = new BillPughInitializedSingletonLogger();
    }
    public static BillPughInitializedSingletonLogger getInstance() {
        return InnerStaticInitializerSingletonHelper.INSTANCE;
    }
}
