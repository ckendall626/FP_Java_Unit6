import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TextGui {
  JFrame frame = new JFrame();
  JLabel label = new JLabel("Welcome");
  JButton button = new JButton("Submit");
  JTextField input = new JTextField(20);

  public TextGui() {
    frame.setLayout(new FlowLayout());
    frame.add(label);
    frame.add(input);
    frame.add(button);
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    frame.setSize(300, 300);
    frame.setVisible(true);
  }

}
