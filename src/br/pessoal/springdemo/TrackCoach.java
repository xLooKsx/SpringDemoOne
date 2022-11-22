package br.pessoal.springdemo;

public class TrackCoach implements Coach {

    private Fortune fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(Fortune fortuneService){
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
