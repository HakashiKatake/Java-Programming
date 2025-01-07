package Operators;

public class ConditionalOpp {
    public static void main(String[] args) {
        //program to demonstrate condtional operators ternary 
        int a = 10;
        int b = 20;
        int c = (a < b) ? a : b;
        System.out.println("c = " + c);

        c = (a > b) ? a : b;
        System.out.println("largest = " + c);

        
        
    }
}
