package Homework3;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Directory {
    HashSet<PhoneBook> directory = new HashSet<>();
    public  void add(PhoneBook a, HashSet b){
        b.add(a);
    }

    public  void get(HashSet s, String name){
        List<PhoneBook> Skw = directory.stream().filter((PhoneBook) -> PhoneBook.getName().equals(name)).collect(Collectors.toList());
        Skw.forEach(System.out::println);

    }
    public static void main(String[] args) {
        Directory dir = new Directory();
        dir.add(new PhoneBook("Скайвокер","111"),dir.directory);
        dir.add(new PhoneBook("Петров","333"),dir.directory);
        dir.add(new PhoneBook("Скайвокер","666"),dir.directory);
        dir.add(new PhoneBook("Сидоров","222"),dir.directory);
        dir.add(new PhoneBook("Скайвокер","123"),dir.directory);
        dir.add(new PhoneBook("Еримеев","444"),dir.directory);
        System.out.println(dir.directory);
        dir.get(dir.directory,"Скайвокер");

    }


}
