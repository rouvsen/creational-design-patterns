package az.rouvsen.creationaldesignpatterns.patterns.prototype;

public class Teacher extends Person{
    private final String course;
    public Teacher(String name, String course) {
        super(name);
        this.course = course;
    }

    public String getCourse() {
        return this.course;
    }

    protected Teacher clone() {
        return (Teacher)super.clone();
    }

    @Override
    public String toString() {
        return "Teacher{name='%s', course='%s'}".formatted(super.getName(), course);
    }
}
