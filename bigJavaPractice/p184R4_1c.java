import java.util.Scanner;

public class p184R4_1c {
    public static int powersOfTwo(int num) {
        System.out.println(0);
        for (int i = 1; i < num; i *= 2) {
            System.out.println(i);

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number: ");

        if (scan.hasNextInt()) {
            int number = scan.nextInt();
            powersOfTwo(number);
        }
        scan.close();
    }

}
