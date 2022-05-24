package ru.gb.ivlev2ch;

public class Cat implements Action{
    private String name;
    public String getName() {
        return name;
    }
    @Override
    public int run() {
        return 0;
    }

    @Override
    public int jump() {
        return 0;
    }
}
