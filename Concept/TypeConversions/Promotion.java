public class Promotion {
    public static void main(String[] args) {
        byte b = 50;
        //b = b * 2; error
        System.out.println(b);

        b = (byte)(b * 2);
        System.out.println(b);
    }
}
