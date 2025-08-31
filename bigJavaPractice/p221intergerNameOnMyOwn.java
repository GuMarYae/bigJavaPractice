import java.util.Scanner;

public class p221intergerNameOnMyOwn {

    public static String num_to_word_translat(int number) {
        // we need a copy of the parameter to make it make more sense
        int numberCopy = number;
        // this is what numberCopy is conna be converted into, into a string
        String word = "";

        if (numberCopy >= 100) {
            word += digit(numberCopy / 100) + " " + "hundred";
            numberCopy %= 100;
        }
        if (numberCopy >= 20) {

            word += " " + tens(numberCopy);
            numberCopy %= 10;
        } else if (numberCopy >= 10) {
            word += " " + teens(numberCopy);
            numberCopy = 0;
        }
        if (numberCopy > 0)
            word += " " + digit(numberCopy);

        return word;
    }

    // named it hundreds until i realized i can call it when im in the ones place
    public static String digit(int number) {
        switch (number) {

            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";

        }

    }

    public static String tens(int number) {
        return (number >= 90) ? "ninety"
                : (number >= 80) ? "eighty"
                        : (number >= 70) ? "seventy"
                                : (number >= 60) ? "sixty"
                                        : (number >= 50) ? "fifty"
                                                : (number >= 40) ? "forty"
                                                        : (number >= 30) ? "thirty"
                                                                : (number >= 20) ? "twenty" : "";

    }
    /*
     * never usd
     * public static String ones(int number) {
     * return digit(number);
     * }
     */

    public static String teens(int number) {
        return number == 10 ? "ten"
                : number == 11 ? "eleven"
                        : number == 12 ? "twelve"
                                : number == 13 ? "thirteen"
                                        : number == 14 ? "fourteen"
                                                : number == 15 ? "fifteen"
                                                        : number == 16 ? "sixteen"
                                                                : number == 17 ? "seventeen"
                                                                        : number == 18 ? "eighteen"
                                                                                : number == 19 ? "nineteen"
                                                                                        // supposedly this is never
                                                                                        // reached
                                                                                        // : number == 20 ? "twenty"
                                                                                        : "";
    }

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        // remember this is assigning/initializing and invoking the hasNext function at
        // the same time

        // hasNextInt() is a LOOK AHEAD, not a LOOK BACK.
        // It checks the NEXT token in the input before actually reading it.
        // So you always call hasNextInt() BEFORE nextInt() to validate.
        if (scan.hasNextInt() == true) {
            int number = scan.nextInt();

            System.out.println(num_to_word_translat(number));
        }

        scan.close();
    }
}
