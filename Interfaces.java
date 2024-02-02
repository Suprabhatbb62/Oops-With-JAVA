//All the methods in Interface must be abstract
// 
public class Interfaces {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.move();

        King k=new King();
        k.move();

        Rook r=new Rook();
        r.move();
    }
}//making class using interface keyword
interface ChessGame{
    void move();  //bydefault public & abstract for interface
}
class Queen implements ChessGame{
    //declare as public: if not deeclared it becomes "default" specifier
    public void move(){
        System.out.println("Can move up, down, left, right, diagonal(In all 4 directions)");
    }
}
class King implements ChessGame{
    public void move(){
        System.out.println("Can move up, down, left, right, diagonal(by 1 step)");
    }
}
class Rook implements ChessGame{
    public void move(){
        System.out.println("Can move up, down, left, right");
    } 
}
