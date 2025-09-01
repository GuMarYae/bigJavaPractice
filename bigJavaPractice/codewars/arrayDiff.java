//package codewars;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayDiff {

    public static ArrayList<Integer> arrList(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i = 0; i < a.size(); i++) {
            boolean found = false;
            for (int j = 0; j < b.size(); j++) {
                if (b.get(j) == a.get(i)) {
                    found = true;
                    //since brink is in j, it only breaks the loop, it doesnt break the whole entire loop, cause i has to increment,
                    //it only breaks the j loop
                    break;
                }
            }
            //remember, this is still part of the forloop, i
            // these are the same thing; !found and false
            if (!found || found == false) {
                newList.add(a.get(i));
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4,3,5,4,54));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(2,3,5,3,4));

        System.out.println(arrList(a, b));
    }

}
