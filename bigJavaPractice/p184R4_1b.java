import java.util.Scanner;

public class p184R4_1b {
    public static int tens(int num) {

        for (int i = 0; i < num; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            } 
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        // dont put the variable before has next or else its always gonna check if its
        // an integer
        // int number = scan.nextInt(); == cin >> number
        /*
         * You’re initializing the number variable and invoking nextInt() in one line:
         */
        if (scan.hasNextInt()) {
            int number = scan.nextInt();
            tens(number);
        } else
            System.out.println("Has to be whole number!");
        scan.close();

    }

}
