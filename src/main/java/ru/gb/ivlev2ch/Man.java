package ru.gb.ivlev2ch;

public class Man implements Action {
    private String name;
    private int runlimit;
    private int jumplimit;

    @Override
    public int getRunlimit() {
        return runlimit;
    }

    public int getJumplimit() {
        return jumplimit;
    }

    @Override
    public void run(int i) {
        System.out.println(this.name + " пробежал " + i + " метров");

    }

    @Override
    public void jump(int j) {
        System.out.println(this.name + " прыгнул на  " + j + " метров");

    }

    public Man(String name, int runlimit, int jumplimit) {
        this.name = name;
        this.runlimit = runlimit;
        this.jumplimit = jumplimit;








    }
}