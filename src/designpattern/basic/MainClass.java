package designpattern.basic;

public class MainClass {

    public static void main(String[] args) {
        /*var user = new User("Shafi");
        user.name = "Shafi";
        System.out.println(user.name);
        user.greet();*/

        var secondWithConstructor = new SecondUser();
        secondWithConstructor.setName("Shafi Ul Islam");
        System.out.println( secondWithConstructor.getName());
    }
}
