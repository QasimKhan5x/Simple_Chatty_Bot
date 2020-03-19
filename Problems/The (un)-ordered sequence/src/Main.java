import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int old;

        boolean aOrdered = true;
        boolean dOrdered = true;

        while (true) {
            old = num;
            num = scan.nextInt();

            if (num == 0) break;

            if (num > old && dOrdered) {
                dOrdered = false;
                continue;
            }

            if (num < old && aOrdered) {
                aOrdered = false;
                continue;
            }

            if (num > old && dOrdered || num < old && aOrdered) {
                aOrdered = false;
                dOrdered = false;
                break;
            }

        }
        System.out.println(aOrdered || dOrdered);
    }
}