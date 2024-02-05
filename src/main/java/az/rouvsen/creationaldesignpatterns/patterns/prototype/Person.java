package az.rouvsen.creationaldesignpatterns.patterns.prototype;

public abstract class Person implements Cloneable {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Person clone() {
        try {
            return (Person)super.clone();
        } catch (CloneNotSupportedException exception) {
            System.err.println(exception.getMessage());
            return null;
        }
    }
}
