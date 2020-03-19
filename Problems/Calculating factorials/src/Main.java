import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        // write your code here
        if (n == 0) return 1;
        for(long i = n - 1; i > 1; i--) {
            n *= i;
        }
        return n;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}