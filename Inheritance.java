//pass all properties & methods to parent class to child class
// 4 types: Single level, multi level, hierarchical, multiple
public class Inheritance {
    public static void main(String[] args) {
        Fish f=new Fish();
        f.legs=5;   //accessed parent's prop. through subclass
        System.out.println(f.legs);
        f.eat();
    }
}

//base/parent class
class Animal{
    String color;
    int legs;

    void eat(){
        System.out.println("eats");
    }
}
//derived/subclass
class Fish extends Animal{
    //took all the properties and func. from parent class
    int eyes;
    void swim(){
        System.out.println("Can swim!");
    }
}