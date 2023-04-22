public class Human {
    void printData () {
        System.out.println("Method of super class.");
    }
}
class Man extends Human{
    void printData (){
        System.out.println("Method of sub class.");
    }
}
class Test {
    public static void main(String[] args) {
        Human h= new Man();
        Human h1=new Man();
        h.printData();
        h1.printData();
    }
}