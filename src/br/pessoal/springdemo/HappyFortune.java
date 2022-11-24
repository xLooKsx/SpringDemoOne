package br.pessoal.springdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HappyFortune implements FortuneService {

    private final List<String> fortunes;

    public HappyFortune() {
        this.fortunes = Arrays.asList("Today is your luck day, be happy =}", "Today is going to be a fantastic day", "Today you will receive a good news");
    }

    @Override
    public String getDailyFortune() {
        return "Today is your luck day, be happy =}";
    }

    @Override
    public String getARandomFortune() {
        return getFortune();
    }

    public String getFortune() {
        Random r = new Random();
        return fortunes.get(r.nextInt(fortunes.size()));
    }
}
