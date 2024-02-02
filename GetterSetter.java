//Get: to return the value
//Set: to modify the value
// Both used when need to access private data, using a function
// this: is a keyword, to refer to the current object

public class GetterSetter {
    public static void main(String[] args) {
        Pen p = new Pen();

        p.setColor("red");
        //access private data through getter
        System.out.println(p.getColor());
        
        p.setTip(5);
        System.out.println(p.getTip());
    }
}

class Pen{
    private String color;
    private int tip;
    //getter
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    //setter
    void setColor(String newcolor){
        this.color = newcolor;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}