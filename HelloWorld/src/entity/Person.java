package entity;
public class Person {
    private int age;
    private String name;
    public Person(String name,int age){
        set_age(age);
        set_name(name);
    }
    public void set_age(int age){
        if(age>0){
            this.age = age;
        }
        else{
            System.out.println("请输入正确的年龄");
        }
        
    }
    public int get_age(){
        return this.age;
    }
    public void set_name(String name){
        this.name = name;
    }
    public String get_name(){
        return this.name;
    }
}
