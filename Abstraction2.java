public class Abstraction2 {
    public static void main(String[] args) {
        // Animal -> Mammals -> Human

        Human man =new Human();
        //when subclass's constractor called all the parent's constractor called first
    }
}
abstract class Animal {
    Animal(){
        System.out.println("Parent constractor called");
    }
}
class Mammals extends Animal{
    Mammals(){
        System.out.println("Subclass mammal's constractor called");
    }
}
class Human extends Mammals{
    Human(){
        System.out.println("Subclass human's constractor called");
    }
}
