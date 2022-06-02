package Homework3;

public class PhoneBook {
    String name;
    String phoneNum;
    public PhoneBook(String name,String phoneNum){
        this.name = name;
        this.phoneNum = phoneNum;

    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }
    public String toString(){
        return this.name + "  "+ this.phoneNum;


    }
}
