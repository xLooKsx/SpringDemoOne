package br.pessoal.springdemo;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting pratice";
    }
}
