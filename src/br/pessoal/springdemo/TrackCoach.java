package br.pessoal.springdemo;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run a Hard 5K";
    }
}
