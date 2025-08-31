
/*
 * remember
 * 1 class
 * 2 member variables priv
 * 3 constructors
 * 4 member functions  pub
 */

public class Questions {
    private String text;
    private String answer;

    // default constructor
    public Questions() {
        text = null; // or ""
        answer = null;// or ""
    }

    // sets the questions text
    public void setText(String questionText) {
        this.text = questionText;// i like using the this now
    }

    // sets the answer
    public void setAnswer(String correctAnswer) {
        this.answer = correctAnswer;
    }

    public boolean checkAnswer(String response) {
        return response.equals(answer);// .equals() is a exclusive java method
    }

    // display the question
    public void display() {
        System.out.println(text);
    }
}