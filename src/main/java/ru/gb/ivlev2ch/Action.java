package ru.gb.ivlev2ch;

    public interface Action {
        void run(int i);
        void jump(int j);
       int getRunlimit();
       int getJumplimit();

    }



