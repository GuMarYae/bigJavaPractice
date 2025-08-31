import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scIn = new Scanner(System.in);
        Questions q = new Questions();
        q.setText("who is my wife");
        q.setAnswer("Shaina");

        // this, q.display();, is whats actually showing the question. setText.() is
        // storing the question
        q.display();
        System.out.print("Your answer: ");
        String response = scIn.nextLine();// .nextLine() gets a whole line of code, .next() only gets the token (the
                                          // single word) up to the space bar
        System.out.println(q.checkAnswer(response));

    

            

        // ____________________
        scIn.close();
    }
    

}