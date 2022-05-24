package ru.gb.ivlev2ch;

public class Robot implements Action {
    private  String name;
    private int runlimit;
    int jumplimit;

    public String getName() {
        return name;
    }

    public Robot(String name,int runlimit,int jumplimit) {
        this.name = name;
        this.runlimit=runlimit;
        this.jumplimit=jumplimit;
    }


    public void run(int i) {
        System.out.println(this.name+ " пробежал "+ i+ " метров");

    }


    public void jump(int j){
        System.out.println(this.name+ " прыгнул на  "+ j+ " метров");
    }

    @Override
    public int getRunlimit() {
        return runlimit;
    }

    @Override
    public int getJumplimit() {
        return jumplimit;
    }


}
