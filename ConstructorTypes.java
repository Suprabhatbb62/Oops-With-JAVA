//java only creates default const when no const exists.
// constructor: 3types -> parameterized, non-parameterized, copy constructor
public class ConstructorTypes {
    public static void main(String[] args) {
        Student s1 = new Student(); // non-param. const
        Student s2 = new Student("supra"); // param. const
        Student s3 = new Student("supra", 5);
        System.out.println(s1.name); // null
        System.out.println(s3.name);
        // when s1, s2, s3 const are created for different-different parameter is
        // called: constructor overloading

    }
}
   
class Student {
    String name;
    int age;

    // non-parameterized
    Student() {
        System.out.println("Non-parameterized const");
    }

    // parameterized
    Student(String name) {
        this.name = name;
    }

    // parameterized
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
