// Animal -> Human  : When human's obj created, 1st Parent's constractor called then it's own
// Animal -> Cat    t
public class Abstraction {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.walk();
        c.changeColor("White"); // changing the constractor value of parent class
        System.out.println(c.color);
        Human h = new Human();
        h.eat();
        h.walk();

    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "red"; // bydefault all subclass gets this value
    }

    void eat() {
        System.out.println("Can eat");
    }

    abstract void walk(); // abstract func.
}

class Cat extends Animal {
    void walk() { // subclass must needs implement the abstract function
        System.out.println("Walk in 4 legs");
    }

    void changeColor(String color) {
        this.color = color;
    }
}

class Human extends Animal {
    void walk() {
        System.out.println("Walk in 3 legs");
    }
}
