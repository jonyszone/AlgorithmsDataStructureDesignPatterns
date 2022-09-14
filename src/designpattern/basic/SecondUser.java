package designpattern.basic;

public class SecondUser {
    String name;
    public SecondUser(){

    }

    public SecondUser(String nameArgument){
        this.name = nameArgument;
    }

    public void sayName () {
        System.out.println("This is my name " + name);
    }
}
