
import java.util.ArrayList;

/*
 * remember 
 * 1 class name
 * 2 member variables
 * 3 constructors
 * 4 member functions
 */
public class ChoiceQuestion extends Questions {

    // 2 member variable
    private ArrayList<String> choices;

    // 3 constructor
    public ChoiceQuestion() {
        choices = new ArrayList<String>();
    }

    /*
     * adds an answer choice to the question
     * 
     * @param choice = the choice to add
     * 
     * @param correct is a boolean if it's the correct choice, false otherwise
     */

    /**
     * This function right here is NOT asking the user anything.
     * It ONLY sets up the question behind the scenes.
     * 
     * What it does:
     * - Adds the answer choice (right or wrong) into the list called 'choices'
     * - If the answer is correct (true), it saves the position of that answer (as a
     * string)
     * - That saved string gets stored using setAnswer() from the parent class
     * 
     * Why it saves the number as a string:
     * - Because later when the user answers, they enter something like "1" or "2"
     * - The program compares that to the string stored by this function
     * 
     * Important:
     * - choices.size() gives the total number of choices AFTER this one is added
     * - So if you're adding the 3rd answer, size becomes 3, and "3" is saved as the
     * correct answer
     * 
     * Again — THIS FUNCTION DOES NOT INTERACT WITH THE USER.
     * It just builds the question in the background.
     */
    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
        if (correct == true) {
            String choiceString = "" + choices.size(); // convert number to string
            setAnswer(choiceString); // from parent
        }
    }

    @Override
    public void display() {
        super.display(); // show question text

        for (int i = 0; i < choices.size(); i++) {
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));
        }
    }
}
