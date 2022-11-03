package it.develhope.Exercise2;

public class CompetitionRules {

    private static CompetitionRules instance;

    private String competitionRule1 = "Do not copy and paste from StackOverflow!";
    private String competitionRule2 = "Learn every day!";
    private String competitionRule3 = "Be the best team!";
    private CompetitionRules () {}

    public static CompetitionRules getInstance(){
        if(instance == null){
            instance = new CompetitionRules();
        }
        return instance;
    }

    public void printRules(){
        System.out.println("Rules \n" + competitionRule1 + "\n" + competitionRule2 + "\n" + competitionRule3);
    }
}
