package ru.gb.ivlev2ch;

public class Cat implements Action {
    private String name;
    private int runlimit;
    private int jumplimit;

    @Override
    public int getJumplimit() {
        return jumplimit;
    }
    public String getName() {
        return name;
    }
    public Cat(String name,int runlimit,int jumplimit) {
        this.name = name;
        this.runlimit=runlimit;
        this.jumplimit=jumplimit;
    }

    public void run(int i) {
        System.out.println(this.name+ " пробежал "+ i+ " метров");
    }
    public void jump(int j) {
        System.out.println(this.name+ " прыгнул на  "+ j+ " метров");
    }
    @Override
    public int getRunlimit() {
        return runlimit;


    }
}
