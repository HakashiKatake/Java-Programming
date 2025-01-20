
public class ExplicitConversion {
    public static void main(String[] args) {
        double d = 100.3;
        long l = (long)d;
        int i = (int)l;
        System.out.println("Long Value " +l);
        System.out.println("Int Value "+i);
    }
}
