import java.util.Scanner;

//import java.util.Array;
//all squares less than n ex if n = 100 then 0,1,4,9,16 ...81
public class p184R4_1 {

    public static int compute(int num) {
        // these are NOT the same . this one raises faster 1^1 2^2, 3^3 4^4 etc
        // System.out.println(0); // 0 is a perfect square
        // for (int i = 1; Math.pow(i, i) < num; i++) {
        // System.out.println(Math.pow(i, i));

        // }
        // this one raises in only squares
        for (int i = 1; i * i < num; i++) {
            System.out.println(i * i);
        }
        return 0;
    }

    /*
     * In Java, String[] args means: “an array of String objects.”
     * 
     * In C++, char* argv[] or char** argv is kinda the same idea, but it’s an array
     * of C-style strings (character arrays).
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a value");
        while (scan.hasNextInt() == true) {
            int value = scan.nextInt();
            compute(value);
        }
        scan.close();
    }

}
