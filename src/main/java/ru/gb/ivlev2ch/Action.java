package ru.gb.ivlev2ch;

    public interface Action {


       int getRunlimit();
       int getJumplimit();

        void run(int i);
        void jump(int j);

    }



