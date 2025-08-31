import java.util.Scanner;
import java.util.Arrays;

public class p265largestInArray {
    public static void main(String[] args) {
        final int LENGTH = 100;
        double[] values = new double[LENGTH];
        int currentSize = 0; // so the current size = 0.

        // Read the inputs
        System.out.println("Enter values: Q to quit: ");
        Scanner cin = new Scanner(System.in);
        // while the user inout is TRUE and while the current size
        // is smaller than the length of the array, do something
        /*
         * its actually checking if the input is true.
         * cpp equivilent is:
         * while (cin >> values[currentSize] && currentSize < SIZE) {
         * currentSize++;}
         * 💥💥💥 since they are the same, ima start naming Scanners variable name "cin"
         * 💥💥💥 cin is waiting and checks the user input to be TRUE or FALSE of a
         * number
         */

        // 💥💥💥 super importnt fact 💥 at hasNext, we're "cin"ing if the result is
        // true/false, NOT the number (like 5). thats why i wrote it so many times, to
        // drill it in

        while (cin.hasNextDouble() == true && currentSize < values.length) {
            /*
             * look at line 8. so its saying the values[currentSize] or
             * values[0] = a value, a value from cin.nextDouble() to be exact
             * Say, hasNext was TRUE because we entered 5. itll continue and let nextDouble
             * consume the number to 5.0. so now
             * values[0] = 5.0 line 35
             */
            values[currentSize] = cin.nextDouble();
            // currentSize grows plus one. and we use currentSize an array slot
            // since its ++ the loopback will have values[currentSize] as values[1]
            // always remember when you see[a number], this is not a value, its an index
            currentSize++;
        }

        // finding the largest value
        // so, we're not exactly saying that largest is values[0] but we have to start
        // somewhere, this is a starting point
        double largest = values[0];
        for (int i = 0; i < currentSize; i++) {
            if (values[i] > largest)
                // it actually matters to put largest = values instead of values = largest. They
                // are NOT THE SAME THING
                // like if values(9) > largest(8) if it was largest[i] = values, then you just
                // made values be 8 as well. WE DONT WANT THAT
                // we need largest to be changed instead
                largest = values[i];
        }
        // priting allo values, marking the largest
        for (int i = 0; i < currentSize; i++) {
            System.out.print(values[i]);
            if (values[i] == largest) {
                System.out.print(" <== largest value");
            }
            System.out.println();
        }

        // ___________________________________________________________
        cin.close();
    }
}
