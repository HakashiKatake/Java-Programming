public class EvenNumber {
    public static void main(String[] args) {
        //Write a program to print all even numbers between 1 to 50.
        for(int i = 1; i <= 50; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
