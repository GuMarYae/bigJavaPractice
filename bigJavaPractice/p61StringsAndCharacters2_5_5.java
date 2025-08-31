//package java.bigJavaPractice;

import java.util.Scanner;
//javac name.java
//java name

//name.charAt(1) == name[1] in cpp


public class p61StringsAndCharacters2_5_5 {
    public static void main(String[] args) {
        String userName = "tony";
        char start = userName.charAt(1);

        System.out.println(start);
        // this is to understand that you cant just use the variable name[]
        // like cpp. in cpp, it treats each string as an array but in java
        // theyre not array. theyre just objects.

        System.out.println(userName.substring(1, 3));
        // this part is for certain elements NOT including the second element number
        // mentioned

    }

}