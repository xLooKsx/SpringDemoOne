package br.pessoal.springdemo;

public class BaseballCoach implements Coach {

    private final FortuneService fortune;

    public BaseballCoach(FortuneService fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting pratice";
    }

    @Override
    public String getDailyFortune() {
        return "Just do It: "+fortune.getDailyFortune();
    }
}
