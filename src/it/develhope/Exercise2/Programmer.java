package it.develhope.Exercise2;

public class Programmer {
    public String name;
    public String programmingLanguage;
    public int yearsOfExperience;

    private Programmer() {}

    public Programmer(String name, String programmingLanguage, int yearsOfExperience){
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void printProgrammerDetails(){
        System.out.println("Nome: " + this.name +  " Programming Language: " + this.programmingLanguage + " YearOfExperience: " + this.yearsOfExperience);
    }
}
