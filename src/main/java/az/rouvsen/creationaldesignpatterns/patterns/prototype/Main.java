package az.rouvsen.creationaldesignpatterns.patterns.prototype;

public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Teacher--1", "Teacher--1--Course1");
        Student student1 = new Student("Student--1", teacher1);

        System.out.println(student1);//Teacher -> Teacher--1

        Teacher teacher1_clone = teacher1.clone();//copy field for field, but not the same address
        teacher1_clone.setName("Cloned--Teacher");//changed state of copy

        System.out.println(student1);//Teacher -> Teacher--1

        System.out.println(teacher1_clone);//Teacher name -> Cloned--Teacher

        System.out.println("*********************");

        Student clonedStudent = student1.clone();//different Student, different Teacher Object
        clonedStudent.getTeacher().setName("Random Name");

        System.out.println(student1.getTeacher().getName());//Teacher--1
        System.out.println(clonedStudent.getTeacher().getName());//Random Name

    }
}
