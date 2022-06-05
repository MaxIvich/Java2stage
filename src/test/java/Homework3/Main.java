package Homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String[] str = new String[16];
        str[0]= "Создать ";
        str[1]= " массив";
        str[2]= "  c ";
        str[3]= "набором ";
        str[4]= "слов ";
        str[5]= " должны ";
        str[6]= "встречаться ";
        str[7]= " повторяющиеся ";
        str[8]= " повторяющиеся ";
        str[9]= " повторяющиеся ";
        str[10]= " повторяющиеся ";
        str[11]= " Найти";
        str[12]= "вывести";
        str[13]= " список ";
        str[14]= " уникальных";
        str[15]= " слов.";

        HashSet<String> hashSet = new HashSet<>(Arrays.asList(str));

        System.out.println(hashSet);
        ArrayList<String> arrayList= new ArrayList<>(Arrays.asList(str));

        for (int i = 0; i < arrayList.size() ; i++) {

          long a = arrayList.stream().filter(arrayList.get(i)::equals).count();
            System.out.println( "Слово " + " < "+arrayList.get(i)+">"+ " встречается "+ a +" раз. " );

        }







      //  var freq= Arrays.stream(str)
      //          .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
      //  System.out.println(freq);














    }

}
