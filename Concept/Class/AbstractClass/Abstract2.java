abstract class Honda {
    abstract void run();
}
class Bike extends  Honda{
    void run(){
        System.out.println("running safely");
    }
}
public class Abstract2 {
    public static void main(String args[]){
        Honda obj =new Bike();
        obj.run();
    }
    
}
