package ExpectionHandling;

public class ExpectionSubclass {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            // catch statement
        }
        //catch (ArithmeticException e) { 
        //    System.out.println("never reached");
       //}
    }
}  
