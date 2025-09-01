import java.util.Scanner;
import java.util.ArrayList;

public class scratch {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("enter some numbers");

        Scanner cin = new Scanner(System.in);

        while (cin.hasNextInt() == true) {
            int entries = cin.nextInt();
            if (entries > 1) {
                numbers.add(entries);
            } else
                break;

        }
        if (cin.hasNextInt() == false) {
            System.out.println("Not no daym number");
        }

        for (int number : numbers) {
            System.out.println(number);
        }
        // --------------------------

        cin.close();
    }
}
