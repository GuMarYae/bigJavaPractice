import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        ChoiceQuestion question1 = new ChoiceQuestion(); // sets up a blank multiple choice question (empty choices
                                                         // list)

        question1.setText("What was the original name of the Java language?");
        /*
         * sets the question text (not part of the list) so the question asked does NOT
         * go in the array
         * this sets the question text — it doesn't go in the choices list.
         * it's saved in a variable called 'text' which lives in the parent class
         * (Questions).
         * since ChoiceQuestion extends Questions, it inherits that variable and the
         * setText() method.
         * so when we call setText(), we're using the parent’s code to save the question
         * inside the object.
         * so, the object question1 doesnt have anything stored in itself yet
         */

        // Adds answer choices to the list;
        // first thing is the answer text, second is if it's the correct one
        // (true/false)

        question1.addChoice("Oak", true);
        // This adds "Oak" to the list at index 0
        // It's marked correct → choices.size() is 1 → sets answer to "1"

        question1.addChoice("JavaScript", false);
        // Adds "JavaScript" at index 1
        // Not marked correct, so answer stays "1"

        question1.addChoice("Python", false);
        // Adds "Python" at index 2
        // Still not correct, no change to answer

        question1.addChoice("C++", false);
        // Adds "C++" at index 3
        // Not correct either, answer still stays "1"

        // At this point:
        // choices list = ["Oak", "JavaScript", "Python", "C++"]
        // correct answer = "1" (which means choice #1 to the user, not index 0)
        // now question1.choices.size() is 4 even with the incorrect answers

        // SECOND QUESTION
        ChoiceQuestion question2 = new ChoiceQuestion(); // creates another blank multiple choice question

        question2.setText("What was the original name of the Java language?");
        // same question text as question1, but this is a separate object

        question2.addChoice("*7", false);
        // adds "*7" to the list, index 0 — not correct

        question2.addChoice("Duke", false);
        // index 1 — wrong

        question2.addChoice("Oak", true);
        // index 2 — correct → sets answer = "3"

        question2.addChoice("Gosling", false);
        // index 3 — still wrong

        // THIRD QUESTION
        ChoiceQuestion question3 = new ChoiceQuestion(); // another separate question object

        question3.setText("In which country was the inventor of Java born?");
        // sets the question text — doesn't go in the list, stored in the parent

        question3.addChoice("Australia", false);
        // index 0 — wrong

        question3.addChoice("Canada", true);
        // index 1 — correct → sets answer = "2"

        question3.addChoice("Denmark", false);
        // index 2 — wrong

        question3.addChoice("United States", false);
        // index 3 — wrong

        // show all 3 questions to the user
        presentQuestion(question1, cin);
        presentQuestion(question2, cin);
        presentQuestion(question3, cin);
        cin.close();
    }

    /**
     * Shows the question to the user and checks if their answer is correct.
     * 
     * @param q the multiple choice question to ask
     */
    public static void presentQuestion(ChoiceQuestion question, Scanner cin) {

        question.display(); // shows the question and all choices
        System.out.print("Your answer: "); // prompts user to type a number
        String response = cin.nextLine(); // grabs what the user typed (as a string)
        System.out.println(question.checkAnswer(response)); // checks if it's right or wrong (true/false);

    }
}
