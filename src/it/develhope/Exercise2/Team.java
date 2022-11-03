package it.develhope.Exercise2;

public class Team {

    public String teamName;
    public Programmer p1,p2;

    public void printTeamDetail(){
        System.out.println("Team Name: " + this.teamName);
        p1.printProgrammerDetails();
        p2.printProgrammerDetails();
    }
}
