// constructor: 3types -> parameterized, non-parameterized, copy constructor
public class Constructors {
    public static void main(String[] args) {
        Pen p = new Pen("black");  //initialize obj through const.
        System.out.println(p.color);

        Student std=new Student();
    }
}

class Pen {
    String color;
    int tip;

    // function
    void setColor(String color) {
        this.color = color;
    }

    // constructor: can have same name as class, no return type,called once when obj created.
    //  memory allocated when constructor called
    // when this constructor not defined, java automatically create a
    // constructor..But auto created constructor can't be initialized
    Pen(String color) {
        this.color=color;
        System.out.println("constructor called");
    }
}
class Student{
    int age;
    Student(){
        System.out.println("student const called");
    }
}