package ru.gb.ivlev2ch;

public class Robot implements  Action{
    private  String name;

    public String getName() {
        return name;
    }

    @Override
    public int run(int i) {
        return 0;
    }

    @Override
    public int jump(int j) {
        return 0;
    }
}
