import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int i = 1;
        while (i * i <= N){
            System.out.println(i * i);
            i += 1;
        }
    }
}