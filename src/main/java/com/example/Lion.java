package com.example;

import java.util.List;

public class Lion {
    boolean hasMane;
    private final Feline feline;

    // Новый конструктор с DI
    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    // Старый конструктор (оставлен для совместимости)
    public Lion(String sex) throws Exception {
        this(sex, new Feline());
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}