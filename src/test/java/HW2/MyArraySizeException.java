package HW2;

public class MyArraySizeException extends Exception {
    public static String MSG =" Не верный размер массива  ";
    public MyArraySizeException(String[][] t){
        super(MSG+  t.length+ " " + t[0].length);


    }



}
