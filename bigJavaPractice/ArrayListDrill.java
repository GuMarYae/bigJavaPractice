import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDrill {

    public static void main(String[] args) {
        int currentSize = 0;

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("enter some numbers grow this array list:");
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextInt() == true) {
            int num = cin.nextInt();
            numbers.add(num); // couldve just had numbers.add(cin.nextInt()) and didnt have to declare num at
                              // all
            currentSize++;
        }

        for (int number : numbers) {
            System.out.print(number + " ");

        }

        // --------------------------
        cin.close();
    }
}
