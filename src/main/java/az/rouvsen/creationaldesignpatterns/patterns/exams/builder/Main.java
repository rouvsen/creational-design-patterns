package az.rouvsen.creationaldesignpatterns.patterns.exams.builder;

public class Main {
    public static void main(String[] args) {
        Examination exam1 = Examination.builder("Java Programming Language", "Computer Science").build();
        System.out.println(
                "exam name: " + exam1.getName() + ", exam field: " + exam1.getField()
        );
    }
}
