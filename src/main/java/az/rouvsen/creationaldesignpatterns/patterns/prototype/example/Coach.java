package az.rouvsen.creationaldesignpatterns.patterns.prototype.example;

//swallow copy
public class Coach extends SportProfessional{
    private String coachingStyle;

    public Coach(String name, String sport, String coachingStyle) {
        super(name, sport);
        this.coachingStyle = coachingStyle;
    }

    public void setCoachingStyle(String coachingStyle) {
        this.coachingStyle = coachingStyle;
    }

    public String getCoachingStyle() {
        return coachingStyle;
    }
}
