public class Parent {
    String name;
    void display(){
        System.out.println("Super class is Running!");
    }
}
class Child extends Parent {
    int age;

    @Override
    void display() {
        System.out.println("Sub class is Running!");
    }
}
class Downcasting{
    public static void main(String[] args) {
        Parent p = new Child();// Upcasting
        p.name = "Erandika";
        Child c= (Child)p;// downcasting
        c.age= 25;
        System.out.println(c.name);
        System.out.println(c.age);
        c.display();
        }
}