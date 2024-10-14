import javax.swing.*;
// import the necessary tools

class Java61GUI{ 
    public Java61GUI() {
        JFrame frame61 = new JFrame();
        JFrame frame62 = new JFrame();
      JButton button = new JButton("click me");
        JLabel label62 = new JLabel("<html><i>okay?</i></html>");
      // objects that customise the window to the user's liking such as the frame text, the actual lext in the window, etc.

        frame61.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame61.setSize(400, 400); //width, height
        frame62.setSize(100, 50);
      frame62.add(label62);
      frame61.setVisible(true);
      frame62.setVisible(true);
      // customises the frame even more and its location within the program ans its size and its visibility
    }
} 
