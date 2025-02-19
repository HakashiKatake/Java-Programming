package ExpectionHandling;

public class multiplecatch {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("Length of args is " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException err) {
            System.out.println("Division by zero");
        } catch (ArrayIndexOutOfBoundsException er) {
            System.out.println("Array index out of bounds");
        } catch (Exception e) {
            System.out.println("Any other exception");
        }
    }
    
}
