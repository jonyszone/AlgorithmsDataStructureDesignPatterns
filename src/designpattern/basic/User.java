package designpattern.basic;

public class User {
    //Fields
    public String name;

    //constructor
    public User(String name, Another another){
        this.name = name;
        another = new Another();
        another.greet();
    }

    // Methods
    public void greet(){
        System.out.println("Hello "+this.name);
    }


}

class Another {
    public void greet(){
        System.out.println("Hello Another");
    }
}
