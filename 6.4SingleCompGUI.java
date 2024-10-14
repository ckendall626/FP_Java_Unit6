import javax.swing.*;
import java.awt.*;

class SingleCompGUI {
  public SingleCompGUI() {
    JFrame frame = new JFrame();
    
    //Buttons are centered
    JButton centerButton = new JButton("Center");
    JButton centerButton2 = new JButton("Center2");
        
    frame.add(centerButton);
    frame.add(centerButton2);
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}