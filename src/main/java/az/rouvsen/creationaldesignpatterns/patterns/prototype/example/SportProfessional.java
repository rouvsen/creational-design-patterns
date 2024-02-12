package az.rouvsen.creationaldesignpatterns.patterns.prototype.example;

public abstract class SportProfessional implements Cloneable {

    private String name;
    private String sport;

    public SportProfessional(String name, String sport) {
        this.name = name;
        this.sport = sport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    public SportProfessional clone() {
        try {
            return (SportProfessional)super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("Logging: " + ex.getMessage());
            //the best practice is: Write to log file or distributed system - your Log with Exception Object
            //like: Logger.error("Some error occurred", ex);
        }
        return null;
    }
}
