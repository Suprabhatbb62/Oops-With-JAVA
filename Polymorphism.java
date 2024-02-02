// 2 types: Compile Time -> method overloading, Run time -> method overriding
public class Polymorphism {
    public static void main(String[] args) {
        Clalculator cal =new Clalculator();
        System.out.println(cal.sum(2, 5));
        System.out.println(cal.sum((float)2.3, (float)5.1));  //need typecasting
        System.out.println(cal.sum(2, 5, 6));

        Animal an = new Animal();
        an.eat();
        Cow cw = new Cow();
        cw.eat();
        cw.legs();  
    }
}

//method overloading : same func. name with differ parameters.
class Clalculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}

//method overriding: same func differ work
class Animal{
    void eat(){
        System.out.println("Eat anything");
    }
    void legs(){
        System.out.println("Have legs");
    }
}
class Cow extends Animal{
    void eat(){
        System.out.println("Eat grass");
    }
    void legs(){
        System.out.println("Have 4 legs");
    }
}