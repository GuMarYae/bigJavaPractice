//import java.util.Scanner;
//this is finding the first match using a while loop.  to me for loop is easier
//important factor is using the position and charAt method  
public class p166FindingTheFirstMatch {

    // we are looking for the first space in a string of characters
    public static void main(String[] args) {
        String word = "how are you doing";
        boolean status = false;
        char ch = '?';
        int position = 0;

        while (status == false && position < word.length()) {

            ch = word.charAt(position);
            if (ch == ' ') {
                status = true;
                System.out.println("the space was found after character: " + word.charAt(position - 1));

            } else
                position++;

        }
    }
}