package az.rouvsen.creationaldesignpatterns.patterns.prototype.example;

public class Main {
    public static void main(String[] args) {
        Coach coach1 = new Coach("Coach-1=name", "Coach-1=sport", "Coach-1=style");
        Coach coachCopy = (Coach)coach1.clone();
        System.out.println("Equal? " + (coach1 == coachCopy));

        Player player1 = new Player("Player-1=name", "Player-1=sport", coach1);
        Player cloned = player1.clone();

        player1.getCoach().setName("Updated Coach Name");
        System.out.println(cloned.getCoach().getName());//Coach-1=name
    }
}
