package az.rouvsen.creationaldesignpatterns.patterns.exams.builder;

public class Examination {
    private final String name;
    private final String field;
    private final String teacher;
    private final String department;
    private final String time;

    public Examination(Builder builder) {
        this.name = builder.name;
        this.field = builder.field;
        this.teacher = builder.teacher;
        this.department = builder.department;
        this.time = builder.time;
    }

    public static Builder builder(String name, String field) {
        return new Builder(name, field);
    }

    public static class Builder {
        private final String name;
        private final String field;
        private String teacher;
        private String department;
        private String time;

        private Builder(String name, String field) {
            this.name = name;
            this.field = field;
        }

       public Builder teacher(String teacher) {
            this.teacher = teacher;
            return this;
       }
        public Builder department(String department) {
            this.department = department;
            return this;
        }
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public Examination build() {
            return new Examination(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getField() {
        return field;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getDepartment() {
        return department;
    }

    public String getTime() {
        return time;
    }
}