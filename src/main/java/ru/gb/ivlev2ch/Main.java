package ru.gb.ivlev2ch;

public class Main {
    public static void main(String[] args) {




        Action[] participants = new Action[3];
        participants[0]= new Man("Иван",500,5);
        participants[1]= new Robot("С3PO",1000,100);
        participants[2]= new Cat("Мурзик",100,2);
        Obstacles[] obstacles= new Obstacles[2];
        obstacles[0]=new Wall(5);
        obstacles[1]=new Treadmill(100);

            for (int j = 0; j < participants.length; j++) {
                for (int i = 0; i < obstacles.length; i++) {
                    if(obstacles[i].check(participants[j])){
                        obstacles[i].Action(participants[j]);
                    }
                    else break;




                }



            }
    }







    }




