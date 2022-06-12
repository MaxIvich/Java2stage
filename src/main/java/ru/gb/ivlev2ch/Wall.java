package ru.gb.ivlev2ch;


public class Wall implements Obstacles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public boolean check(Action a) {
        if (a.getJumplimit() >= this.height) {
            return true;
        } else return false;

    }

    public int Action(Action a) {
        a.jump(this.getHeight());
        return this.getHeight();

    }
}

