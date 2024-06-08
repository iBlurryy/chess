import javax.swing.JFrame;

public class test {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // creates a new frame
        frame.setTitle("CHESS!?!!?!?!"); // title of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of app
        frame.setResizable(false); // prevent frame resizing
        frame.setSize(420,420); // sets x y ratio of frame
        frame.setVisible(true); // makes frame visible
    }
}
