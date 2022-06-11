package HW5;


import java.util.concurrent.atomic.AtomicInteger;

public class Main extends Thread {
    final int size = 10000000;
    final int h = size / 2;
    float[] arr = new float[size];
    long startTime = System.currentTimeMillis();







    public  void firstMethod() {

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = 1.0f;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time: " + (System.currentTimeMillis() - startTime) + " ms.");


    }

         public void secondMethod() {
             for (int i = 0; i < arr.length; i++) {
                 arr[i] = 1.0f;
             }
             long startTime = System.currentTimeMillis();
             float[] arr1 = new float[h];
             float[] arr2 = new float[h];
             float[] arrUnity = new float[size];
             AtomicInteger t = new AtomicInteger();


             System.arraycopy(arr, 0, arr1, 0, h);
             System.arraycopy(arr, h, arr2, 0, h);
             System.out.println("Резделение на 2 массива  " + (System.currentTimeMillis() - startTime) + " ms.");


             Thread thread1 = new Thread(() -> {
                 for (int i = 0; i < arr1.length; i++) {
                     arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                 }
                 t.getAndIncrement();
                 System.out.println("1 поток   " + (System.currentTimeMillis() - startTime) + " ms.");

             });

             Thread thread2 = new Thread(() -> {
                 for (int i = 0; i < arr2.length; i++) {
                     arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                 }
                 t.getAndIncrement();


                 System.out.println("2  поток   " + (System.currentTimeMillis() - startTime) + " ms.");


             });



             thread1.start();
             thread2.start();
             System.arraycopy(arr2, 0, arrUnity, h, h);
             System.arraycopy(arr1, 0, arrUnity, 0, h);
             boolean isAllive1= thread1.isAlive();
             boolean isAllive2= thread2.isAlive();
             while (true) {

             if (t.get() ==2){
                 System.out.println("В 2 потока     " + (System.currentTimeMillis() - startTime) + " ms.");
                 break;
             }
             }

    }


         public static void main(String[] args)  {
        Main main= new Main();
        main.firstMethod();
        main.secondMethod();



    }



}
