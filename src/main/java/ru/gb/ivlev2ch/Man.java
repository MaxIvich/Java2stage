package ru.gb.ivlev2ch;

public class Man implements Action{
    private String name;
    private int runlimit;
    public Man(String name,int runlimit){
        this.name=name;
        this.runlimit=runlimit;
    }
    public String getName() {
        return name;
    }

    public int getRunlimit() {
        return runlimit;
    }

    @Override
    public int run(int i) {
        if (i >= 0) {
             if (i <= this.runlimit) {

                System.out.println(this.name + " пробежал " + i + " метров.");
                return i;
            } else System.out.println(this.name+ " Устал на "+ this.runlimit+ " метрах");
        }
        return 0;
    }

    @Override
    public int jump(int j) {
        return 0;
    }
}
