package br.pessoal.springdemo;

public class FootballCoach implements Coach{

    private final FortuneService fortune;

    public FootballCoach(FortuneService fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkout() {
        return "kick a ball for 10 minutes";
    }

    @Override
    public String getRandomDailyFortune() {
        return fortune.getARandomFortune();
    }

    @Override
    public String getDailyFortune() {
        return "Let's do an 7x1 'cause "+fortune.getDailyFortune();
    }
}
