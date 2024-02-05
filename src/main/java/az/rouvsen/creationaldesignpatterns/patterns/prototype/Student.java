package az.rouvsen.creationaldesignpatterns.patterns.prototype;

public class Student extends Person{
    private Teacher teacher;
    public Student(String name, Teacher teacher) {
        super(name);
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    protected Student clone() {
        // Deep Copy for Student's Teacher, copy field for field but not the same Teacher Object (not same address)
        Student studentCopy = (Student)super.clone();
        studentCopy.setTeacher(new Teacher(studentCopy.getTeacher().getName(), studentCopy.getTeacher().getCourse()));
        return studentCopy;
    }

    @Override
    public String toString() {
        return "Student{name='%s', Teacher='%s'}".formatted(super.getName(), this.teacher);
    }
}
