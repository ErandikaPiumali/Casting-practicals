public class Animal {
    String name;
    void setName(){
        System.out.println("Elephant");
    }
}
class Fish extends Animal{
    String color;
    void setName(){
        System.out.println("Blue Fish");
    }
}
class Run {
    public static void main(String[] args) {
        Animal a = new Fish();
        a.name= "Alagoduwa";
        Fish f = new Fish();
        f.name = "Linna";
        f.color = "Grey";
        System.out.println("Name:-" + a.name);
        a.setName();
        System.out.println("Name :-"+ f.name);
        System.out.println("Color:-" +f.color);
    }
}