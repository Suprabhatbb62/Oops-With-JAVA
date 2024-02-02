//bydefault java supports super

public class SuperKeyword {
    public static void main(String[] args) {
        Human man=new Human();
        man.color="black";
        System.out.println(man.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal's const called");
    }
}
class Human extends Animal{
    Human(){
        super();  //to take parent's constractor
        super.color="red";  //access pasrent's variable with super
        System.out.println("Human's const. called");
    }
}