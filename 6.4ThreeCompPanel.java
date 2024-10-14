import javax.swing.*;
import java.awt.*;

class ThreeCompPanel {
  public ThreeCompPanel() {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label1 = new JLabel("Corner 1");
    JLabel label2 = new JLabel("Corner 2");
    JLabel label3 = new JLabel("Corner 3");
    JLabel label4 = new JLabel("Corner 4");

    frame.add(panel);
    frame.setLayout(new GridLayout(4,3));
    
    frame.add(label1);
    frame.add(label2);
    frame.add(label3);
    frame.add(label4);
        
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}