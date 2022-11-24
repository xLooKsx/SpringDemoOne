package br.pessoal.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortune;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService){
        this.fortune = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a Hard 5K";
    }

    @Override
    public String getRandomDailyFortune() {
        return fortune.getARandomFortune();
    }

    @Override
    public String getDailyFortune() {
        return this.fortune.getDailyFortune();
    }

    private void doMyStartupStuff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    private void doMyCleanUpStuff(){
        System.out.println("TrackCoach: inside method doMyCleanUpStuff");
    }
}
