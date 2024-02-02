//hierarchial + multiple
public class HybridInheritance {
    public static void main(String[] args) {
        Human man = new Human();
        man.legs();
        Cat c = new Cat();
        c.legs();
        Shark s = new Shark();
        s.size();
    }
}

//parent class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats..");
    }
}
// subclass of animal
class Mammals extends Animal{
    void drinkMilk(){
        System.out.println("Drink milk...");
    }
}
//subclass of animal
class Fish extends Animal{
    void swim(){
        System.out.println("swim..");
    }
}
//subclass of mammals
class Human extends Mammals{
    void legs(){
        System.out.println("2 legs..");
    }
}
//subclass of mammals
class Cat extends Mammals{
    void legs(){
        System.out.println("4 legs");
    }
}
//subclass of fish
class Tuna extends Fish{
    void size(){
        System.out.println("Small size");
    }
}
//subclass of fish
class Shark extends Fish{
    void size(){
        System.out.println("Big in size");
    }
}