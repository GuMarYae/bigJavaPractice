import java.util.Scanner;
import java.util.ArrayList;

public class p297largestInArrayList {
    public static void main(String[] args) {
        // this is a constructor in java
        ArrayList<Double> values = new ArrayList<Double>();

        System.out.println("Please, enter some values or Q to quit: ");
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextDouble() == true) {
            values.add(cin.nextDouble());
        }
        // largest value
        double largest = values.get(0);
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i) > largest) {
                largest = values.get(i);
            }
        }
        // print all values marking the largest as well
        for (double element : values) {
            System.out.print(element);
            if (element == largest) {
                System.out.println(" <== largest ");
            }
            System.out.println();
        }

        // __________________
        cin.close();
    }

}
