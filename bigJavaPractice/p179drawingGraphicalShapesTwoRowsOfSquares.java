import java.awt.Color;
// lets you pick colors to paint with (text, shapes, backgrounds)
import java.awt.Graphics;
// gives you tools to draw stuff (lines, shapes, text) on screen
import javax.swing.JFrame;
// the main window that pops up — holds everything (like the stage)
import javax.swing.JComponent;
// like a blank canvas — you draw on this inside the JFrame

public class p179drawingGraphicalShapesTwoRowsOfSquares {
    public static void draw(Graphics graphics) {
        final int WIDTH = 20;
        graphics.setColor(Color.BLUE);

        // top row. Note the top left coener of the drawing has coordinates(0,0)
        // unlke cpp, you have to assign values to variables, in cpp, if you dont, itll
        // store garbage values like 34324235235
        int x = 0;
        int y = 0;
        for (int i = 0; i < 10; i++) {
            // 💥💥 graphics.fillRect(...) is what actually DRAWS the square on the screen.
            // 💥💥 This is different from System.out.println, which prints text to the
            // console.
            // 💥💥 In graphics, calling fillRect paints pixels directly in the window.
            graphics.fillRect(x, y, WIDTH, WIDTH);

            // 💥💥 Move 40px to the right (20 for the square + 20 gap).
            // 💥💥 Without this, all squares would stack on top of each other.
            x += 2 * WIDTH;
        }
        // For second row, offset from the first one:
        // 💥💥 WIDTH = 20 (we set that at the top of the method)
        // x = WIDTH; → x = 20 → start 20px from the left edge
        // y = WIDTH; → y = 20 → start 20px from the top edge
        // 💥💥 That means the top-left corner of the first square in row 2 is at (20,
        // 20) on
        // the pixel grid
        // 💥💥So it’s not magic — it’s literally just: "Start a little to the right,
        // and
        // one square down from the top."

        x = WIDTH;// not zero but WIDTH and WIDTH is what, final int WIDTH = 20;
        y = WIDTH;
        for (int i = 0; i < 10; i++) {
            graphics.fillRect(x, y, WIDTH, WIDTH);
            // Move 40 pixels to the right: 20 for the square's width + 20 for the gap
            // If you change this to just "x += WIDTH;", the squares will be flush
            // (touching)
            // If you remove this entirely, x never changes and all squares stack in the
            // same spot
            x += 2 * WIDTH;
        }
    }

    public static void main(String[] args) {
        // Create the main window (JFrame) that will hold our drawing
        JFrame frame = new JFrame();

        // Set window size to 400x400 pixels
        final int FRAME_WIDTH = 400;
        final int FRAME_HEIGHT = 400;
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // Make sure program closes when the window's "X" button is clicked
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a custom JComponent (like a blank canvas)
        // Inside its paintComponent method, we call draw(graph) to do the drawing
        JComponent component = new JComponent() {
            public void paintComponent(Graphics graph) {
                draw(graph); // pass the paintbrush to our draw() method
            }
        };

        // Add our custom drawing component to the window
        frame.add(component);

        // Make the window visible on screen
        frame.setVisible(true);
    }
}