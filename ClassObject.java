public class ClassObject {
    public static void main(String args[]) {
        // actual pen, by creating object of Pen class
        // object created in heap memory
        Pen p1 = new Pen();

        p1.setColor("red");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        //or
        p1.tip = 6;
        System.out.println(p1.tip);
    }
}

// blueprint of acctual pen
class Pen {
    // class contains methods/func and properties
    String color;
    int tip;

    void setColor(String newcolor) {
        color = newcolor;
    }

    void setTip(int newtip) {
        tip = newtip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy, int chem, int math, int bio) {
        percentage = (phy + chem + math + bio) / 4;
    }
}
