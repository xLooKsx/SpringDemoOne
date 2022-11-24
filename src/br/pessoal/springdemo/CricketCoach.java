package br.pessoal.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortune;
    private String emailAddress;
    private String team;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-args constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Pratice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getDailyFortune();
    }

    public void setFortune(FortuneService fortune) {
        System.out.println("CricketCoach: inside the setter method - setFortune");
        this.fortune = fortune;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
}
