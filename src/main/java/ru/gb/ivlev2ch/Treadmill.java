package ru.gb.ivlev2ch;

public class Treadmill implements Obstacles {
    int length ;
    public Treadmill(int length){
        this.length=length;
    }

    public int getLength() {
        return length;


    }
    public boolean check(Action a){
        if(a.getRunlimit()>=this.length) {

            return true;
        }
        else return false;

    }
    public int Action(Action a){
        a.run(this.getLength());
        return this.getLength();


    }

}
