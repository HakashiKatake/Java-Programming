
public class ArrayForEach {
    public static void main(String[] args) {
        
        // Sum of all elements in the array using for each loop
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of all elements in the array: " + sum);
        
    
    }   
}
