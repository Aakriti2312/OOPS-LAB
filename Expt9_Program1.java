import java.util.ArrayList;

public class Expt9_Program1 {
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Creating an ArrayList of integers (Autoboxing occurs here)
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Adding some numbers
        numbers.add(10);
        numbers.add(7);
        numbers.add(19);
        numbers.add(23);
        numbers.add(4);
        numbers.add(33);
        numbers.add(5);
        
        // Iterating through the list and checking for prime numbers
        for (Integer num : numbers) { // Unboxing happens here
            if (isPrime(num)) {
                System.out.println(num + " is a Prime Number");
            } else {
                System.out.println(num + " is NOT a Prime Number");
            }
        }
    }
}
