package HW2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)  {

         String[][] str = new String[4][4];
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                str[i][j]= String.valueOf(i+j);
            }
        }
        str[2][2]= "1";
        Arrays.stream(str).map(Arrays::toString).forEach(System.out::println);
        try {
            m(str);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }
    public static void m(String[][] t)throws MyArraySizeException,MyArrayDataException {
        if (t.length>4) {
        throw new MyArraySizeException(t);
             }
        else {
            int b = 0;
            for (int i = 0; i < t.length; i++) {
                for (int j = 0; j < t.length; j++) {
                    if(check(t[i][j])){
                        int a = Integer.parseInt(t[i][j]);
                        b = a + b;
                    }
                    else throw new MyArrayDataException(i,j);

                }
            }
            System.out.println(b);
            }
        }
        public static boolean check(String Q){
            return Q.matches("-?\\d+(\\.\\d+)?");
        }

}
