package az.rouvsen.creationaldesignpatterns.patterns.singleton;

public abstract class SingletonBase {
    public void log(String message) {
        System.out.println(message);
    }
    public void log(Exception ex) {
        System.out.println(ex.getMessage());
    }
}
