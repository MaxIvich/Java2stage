package HW2;

public class MyArrayDataException extends NumberFormatException{
    public static String MSG = "Не вернный символ В ячейке :  ";
    public MyArrayDataException(int a,int b){
        super(MSG+ a+ " " + b);


    }
}
