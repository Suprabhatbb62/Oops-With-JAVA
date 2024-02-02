//many subclass extending same parent class
public class HierarchialInheritance {
    public static void main(String[] args) {
        Mammals m = new Mammals();
        m.eat();
        m.walk();
        Bird b = new Bird();
        b.eat();
        b.fly();
        Fish f = new Fish();
        f.eat();
        f.swim();

    }
}

//parent class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats..");
    }
}
//subclass of animal
class Mammals extends Animal{
    void walk(){
        System.out.println("Walk...");
    }
}
//subclass of animal
class Bird extends Animal{
    void fly(){
        System.out.println("Fly..");
    }
}
//subclass of animal
class Fish extends Animal{
    void swim(){
        System.out.println("Swim..");
    }
}