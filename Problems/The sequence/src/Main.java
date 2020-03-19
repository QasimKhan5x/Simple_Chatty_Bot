import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 1;
        while (n > 0) {
            for(int i = 1; i <= num; i++) {
                System.out.print(num + " ");
                --n;
                if (n == 0) {
                    break;
                }
            }
            ++num;
        }
    }
}