package az.rouvsen.creationaldesignpatterns.patterns.prototype.example;

//deep copy
public class Player extends SportProfessional{
    private Coach coach;
    public Player(String name, String sport, Coach coach) {
        super(name, sport);
        this.coach = coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public Coach getCoach() {
        return coach;
    }

    @Override
    public Player clone() {
        Player cloned = (Player)super.clone();
        cloned.setCoach(new Coach(cloned.getCoach().getName(), cloned.getCoach().getSport(), cloned.getCoach().getCoachingStyle()));
        return cloned;
    }
}
