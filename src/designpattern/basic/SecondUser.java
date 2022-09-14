package designpattern.basic;

public class SecondUser {
    //we use private access modifier for securing property/field

  private String name;
    public SecondUser(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName (){
        return name;
    }

    public SecondUser(String nameArgument){
        this.name = nameArgument;
    }

    public void sayName () {
        System.out.println("This is my name " + name);
    }
}
