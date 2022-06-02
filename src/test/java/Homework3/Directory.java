package Homework3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Directory {



    public static void main(String[] args) {


        HashSet<PhoneBook> directory = new HashSet<>();
        directory.add(new PhoneBook("Скайвокер","111"));
        directory.add(new PhoneBook("Петров","333"));
        directory.add(new PhoneBook("Сидоров","222"));
        directory.add(new PhoneBook("Еримеев","444"));
        directory.add(new PhoneBook("Скайвокер","555"));
        System.out.println(directory);


        List<PhoneBook> Skw = directory.stream().filter((PhoneBook) -> PhoneBook.getName().equals("Скайвокер")).collect(Collectors.toList());
         Skw.forEach(System.out::println);

    }
}
