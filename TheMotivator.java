public class TheMotivator {
    public void scoreFeedback(int score) {
        printScore(score)
        if (score == 100)
            System.out.println("You're awesome");
        else if (score > 90)
            System.out.println("That's great");
        else if (score > 75)
            System.out.println("That's better");
        else if (score > 60)
            System.out.println("That's good ");

        else{

            System.out.println("Needs Improvement !!");
            System.out.println("What can I say!!");

        }
    }
    public static void main(String[] args) {
        TheMotivator tm = new TheMotivator();
        System.out.println("Hello There !!!");
        tm.feedback(60);
        System.out.println("Good byye !!!");
    }
    puplic void printScore(int score){
        System.out.println("Score : " +score);
    }

}
