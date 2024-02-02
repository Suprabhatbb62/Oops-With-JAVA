//One subclass extending parent class, and that subclass becomes parent of another derived class
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Human man = new Human();
        // all properties/methods of prev two class is inherited
        man.eat();
        man.drinkMilk();
        man.speak();
        man.color="brown";
        System.out.println(man.color);
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
    int eyes;
    void drinkMilk(){
        System.out.println("Drink Milk");
    }
}
//subclass of mammals
class Human extends Mammals{
    int legs;
    void speak(){
        System.out.println("Speak english");
    }
}