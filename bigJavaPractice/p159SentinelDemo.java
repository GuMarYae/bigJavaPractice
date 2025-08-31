import java.util.Scanner;

public class p159SentinelDemo {
    public static void main(String[] args) {
        double sum = 0;
        int count = 0;
        double salary = 0; // start with anything that’s NOT -1

        System.out.print("Enter salaries (-1 to finish): ");
        Scanner in = new Scanner(System.in);

        /*
         * while (salary != -1 || !(finish.equalsIgnoreCase("f"))) {
         * This won't work because with OR (||), even if salary == -1, finish stays
         * true (never updated),
         * so the loop never ends since at least one side is always true.
         * 
         */
        // Loop until user types -1
        while (salary != -1) {
            salary = in.nextDouble();
            if (salary != -1) {
                sum += salary;
                count++;
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Average salary: " + average);
        } else {
            System.out.println("No data");
        }

        in.close();
    }
}
