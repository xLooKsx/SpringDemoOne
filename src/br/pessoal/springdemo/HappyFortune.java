package br.pessoal.springdemo;

public class HappyFortune implements Fortune{
    @Override
    public String getDailyFortune() {
        return "Today is your luck day, be happy =}";
    }
}
