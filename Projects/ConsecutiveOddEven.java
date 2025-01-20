public class ConsecutiveOddEven {
    public static void main(String[] args) {
        //WAP to find average of consecutive N Odd numbers and even numbers.

        int n = 10;
        int oddSum = 0;
        int evenSum = 0;
        int oddCount = 0;
        int evenCount = 0;
        int i = 1;
        while(oddCount < n || evenCount < n) {
            if(i % 2 != 0) {
                oddSum += i;
                oddCount++;
            } else {
                evenSum += i;
                evenCount++;
            }
            i++;
        }
        System.out.println("Average of first " + n + " odd numbers: " + (oddSum / n));
        System.out.println("Average of first " + n + " even numbers: " + (evenSum / n));
        
    }
}
