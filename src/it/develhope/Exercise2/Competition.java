package it.develhope.Exercise2;

public class Competition {

    public static void main(String[] args) {
        CompetitionRules.getInstance().printRules();
        Team teamA = new Team();
        Team teamB = new Team();

        teamA.teamName = "AndroidClass";
        teamB.teamName = "FullstackClass";

        teamA.p1 = new Programmer("Mauro","Java", 15);
        teamA.p2 = new Programmer("Gigi","Kotlin",5);
        teamB.p1 = new Programmer("Mattew","Html",10);
        teamB.p2 = new Programmer("Warlup","Javascript",2);

        teamA.printTeamDetail();
        teamB.printTeamDetail();
    }
}
