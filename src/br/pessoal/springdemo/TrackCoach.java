package br.pessoal.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a Hard 5K";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getDailyFortune();
    }
}
