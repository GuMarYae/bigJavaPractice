import java.util.Scanner;

public class p221integerName {

    public static String intName(int number) {
        // EXAMPLE: how we keep adding to a String
        // String name = "";
        // name += "three"; // "three"
        // name += " hundred"; // "three hundred"
        // name += " and"; // "three hundred and"
        // name += " five"; // "three hundred and five"
        // Same idea below — we keep stacking words until we build the full number

        int part = number; // Make a copy so we can change it as we go
        String name = ""; // This will be the words for the number

        // If number is 100 or more, figure out the hundreds part
        if (part >= 100) {
            name = digitName(part / 100) + " hundred"; // Example: 345 -> "three hundred" . its only handling the
                                                       // hundreds place, not the full number.
                                                       // part / 100 takes 345 and does integer division → 3.
                                                       // Then digitName(3) gives "three", and you add " hundred" →
                                                       // "three hundred".
            part %= 100; // Remove the hundreds from the number (345 -> 45)
        }

        // If what's left is 20 or more, get the tens word (twenty, thirty, etc.)
        if (part >= 20) {
            name += " " + tensName(part); // Add tens name to what we have
            part %= 10; // Remove the tens (45 -> 5)
        }
        // If what's left is 10 to 19, get the special teen word
        else if (part >= 10) {
            name += " " + teensName(part); // Add teen name
            part = 0; // Teens are done, no ones left
        }

        // If there's still a ones digit left, add it
        if (part > 0) {
            name += " " + digitName(part); // Add single digit name
        }

        return name; // Give back the final number in words
    }

    /**
     * Turns a single digit (1–9) into its English name.
     * 
     * @param digit an integer between 1 and 9
     * @return the name of the given digit ("one" ... "nine"), or "" if out of range
     */
    public static String digitName(int digit) {
        if (digit == 1)
            return "one";
        if (digit == 2)
            return "two";
        if (digit == 3)
            return "three";
        if (digit == 4)
            return "four";
        if (digit == 5)
            return "five";
        if (digit == 6)
            return "six";
        if (digit == 7)
            return "seven";
        if (digit == 8)
            return "eight";
        if (digit == 9)
            return "nine";
        return "";
    }

    /**
     * Turns a number between 10 and 20 into its English name.
     * 
     * @param number an integer between 10 and 20
     * @return the name of the given number ("ten" ... "twenty"), or "" if out of
     *         range
     */
    public static String teensName(int number) {
        if (number == 10)
            return "ten";
        if (number == 11)
            return "eleven";
        if (number == 12)
            return "twelve";
        if (number == 13)
            return "thirteen";
        if (number == 14)
            return "fourteen";
        if (number == 15)
            return "fifteen";
        if (number == 16)
            return "sixteen"; // fixed typo from "sixten"
        if (number == 17)
            return "seventeen";
        if (number == 18)
            return "eighteen";
        if (number == 19)
            return "nineteen";
        if (number == 20)
            return "twenty";
        return "";
    }

    /**
     * Turns a multiple of ten (20–90) into its English name.
     * 
     * @param number an integer that is a multiple of ten between 20 and 90
     * @return the name of the given multiple of ten ("twenty" ... "ninety"), or ""
     *         if out of range
     */
    public static String tensName(int number) {
        if (number >= 90)
            return "ninety";
        if (number >= 80)
            return "eighty";
        if (number >= 70)
            return "seventy";
        if (number >= 60)
            return "sixty";
        if (number >= 50)
            return "fifty";
        if (number >= 40)
            return "forty";
        if (number >= 30)
            return "thirty";
        if (number >= 20)
            return "twenty";
        return "";
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number < 1000");
        int input = scan.nextInt();
        System.out.println(intName(input));

        scan.close();
    }
}
/**
 * Turns a number into its English name.
 * 
 * @param number a positive integer < 1,000
 * @return the name of the number (e.g. “two hundred seventy four”)
 */