import java.util.Scanner;

public class LargestArray {
    public static void main(String[] args) {
        final int LENGTH = 100;
        double[] values = new double[LENGTH];
        int currentSize = 0;
        // read inputs

        System.out.println("enter values, q to quit");
        Scanner in = new Scanner(System.in);

        // as long as theres there are actual numbers being entered and they are smaller
        // than values = new double [LENGTH], do something
        while (in.hasNextDouble() && currentSize < values.length) {
            values[currentSize] = in.nextDouble();
            currentSize++;

        }

        // fnding the largest value
        double largest = 0;
        for (int i = 1; i < currentSize; i++) {
            if (values[i] > largest) {
                largest = values[i];
            }

        }

        // print all values
        for (int i = 0; i < currentSize; i++) {
            System.out.print(values[i]);                 // prints the value thats it literally
            if (values[i] == largest) {
                System.out.print("<== largest value"); // only prints "largest" if thats true, else this code does nothing else
            }
            System.out.println();                        // makes a new line whenever line 32 prints
        }
        // close the scanner
        in.close();
    }

}
