package az.rouvsen.creationaldesignpatterns.patterns.builder;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Email {

    private String from;
    private final List<String> to;
    private final List<String> cc;
    private final List<String> bcc;
    private String subject;
    private String body;
    private final List<String> attachments;

    private Email() {
        this.to = new ArrayList<>();
        this.cc = new ArrayList<>();
        this.bcc = new ArrayList<>();
        this.attachments = new ArrayList<>();
    }

    public void send() {
        System.out.println(
                MessageFormat.format("Email successfully sent from {0} to {1} with subject {2}, and the message is: {3}",
                        this.from, this.to, this.subject, this.body)
        );
    }

    public static EmailBuilder builder() {
        return new EmailBuilder();
    }

    public static class EmailBuilder {
        private final Email email = new Email();

        public EmailBuilder addFrom(String from) {
            this.email.from = from;
            return this;
        }

        public EmailBuilder withSubject(String subject) {
            this.email.subject = subject;
            return this;
        }

        public EmailBuilder withBody(String body) {
            this.email.body = body;
            return this;
        }

        public EmailBuilder addTo(String to) {
            this.email.to.add(to);
            return this;
        }

        public EmailBuilder addCc(String cc) {
            this.email.cc.add(cc);
            return this;
        }

        public EmailBuilder addBcc(String bcc) {
            this.email.bcc.add(bcc);
            return this;
        }

        public EmailBuilder addAttachments(String attachment) {
            this.email.attachments.add(attachment);
            return this;
        }

        public Email build() {
            return this.email;
        }

    }
}
