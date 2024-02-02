public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Supra";
        s1.roll = 5;
        s1.marks[0] = 90;
        s1.marks[1] = 100;
        s1.marks[2] = 99;

        Student s2 = new Student(s1); // s1 obj passed as parameter
        s2.password = "aaa";
        s1.marks[2] = 70; 
        /* change in prev object, reflect to obj2 also, bcz obj2 taking the reference
          not acctual data, to handle this error: shallow copy & deep copy introduced. 
          when deep copy used means a new array will created, then any change in s1 obj not reflect to s2 */
        System.out.println(s2.name + " " + s2.roll + " " + s2.password);

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];
    Student(){
        marks = new int[3];
        System.out.println("Default const");
    }

    // copy const, copy all the properties of object s1 to new const
    //shallow copy const.
    /*
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;   //shallow copy
    }    */

    //deep copy const.
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];   //deep copy
        }                    
    } 


}
