import javax.swing.*;
// import the necessary tools

class SimpleGUI{ 
    public SimpleGUI() {
        JFrame frame = new JFrame("This is our frame");
        JButton button = new JButton("click me");
        JLabel label = new JLabel("<html><u>Swing is pretty cool</u></html>");
      JLabel label1 = new JLabel("<html><u>NewJeans are pretty cool</u></html>");
      JLabel label2 = new JLabel("<html><u>cool</u></html>");
      JLabel label3 = new JLabel("<html><u>Swing </u></html>");
      JLabel label4 = new JLabel("<html><u>pretty </u></html>");
      // objects that customise the window to the user's liking such as the frame text, the actual lext in the window, etc.

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.add(label);
      frame.add(label1);
      frame.add(label2);
      frame.add(label3);
      frame.add(label4);
        frame.setSize(300, 300); //width, height
        frame.setVisible(true);
      // customises the frame even more and its location within the program ans its size and its visibility
    }
} 
