import entity.Person;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        var xiaoming = new Person("xiaoming",14);
        var name = xiaoming.get_name();
        System.out.println(name);
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
    }
}
