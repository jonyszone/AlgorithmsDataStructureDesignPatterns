package designpattern.basic;

public class User {
    //Fields
    public String name;

    //constructor
    public User(String name){
        this.name = name;
    }

    // Methods
    public void greet(){
        System.out.println("Hello "+this.name);
    }


}
