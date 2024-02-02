public class Encapsulation {
    public static void main(String[] args) {
        Student std=new Student();
        std.calculatePercentage(81, 83, 100, 99);
        System.out.println(std.percentage);
    }

}
//binding data(properties, attribues) and methods/functions together
class Student {
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy, int chem, int math, int bio) {
        percentage = (float)(phy + chem + math + bio) / 4;
    }
}
