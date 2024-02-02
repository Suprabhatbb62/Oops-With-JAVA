//only one parent class and one derived class
public class SingleInheritance {
    public static void main(String[] args) {
        Human man = new Human();
        man.eat();
        man.speak();
    }
}

//parent class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats..");
    }
}

//derived class
class Human extends Animal{
    int legs;
    void speak(){
        System.out.println("Speak english");
    }
}