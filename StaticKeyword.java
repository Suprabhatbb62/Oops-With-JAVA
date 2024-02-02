//used to share same variable or method || changes within one obj reflects for every object
public class StaticKeyword {
    public static void main(String[] args) {
        Animal a1=new Animal();
        a1.setColor("red");
        System.out.println(a1.getColor());
        
        //when obj1 set the value, obj gets the value
        Animal a2 = new Animal();
        a2.setColor("black");
        System.out.println(a2.getColor());

        System.out.println(a1.getColor());
    }
}
class Animal{
    static String color;  //shareable variable(static variable)
    static int returnAvg(int a, int b, int c){      //static method: for all values method remains same. so created once in memory
        return (a+b+c)/3;
    }
    //setter
    void setColor(String color){
        this.color=color;
    }
    //getter
    String getColor(){
        return color;
    }
}
