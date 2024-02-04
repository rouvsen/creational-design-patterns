package az.rouvsen.creationaldesignpatterns.patterns.builder;

public class Main {
    public static void main(String[] args) {
        Email.builder()
                .addFrom("rouvsen@test.com")
                .addTo("test@test.com")
                .withSubject("Builder Pattern")
                .addAttachments("attachment-1")
                .addCc("test-cc")
                .addBcc("test-bcc")
                .withBody("Hello guys")
                .build().send();
    }
}
