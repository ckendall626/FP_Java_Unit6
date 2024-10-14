import javax.swing.*;
import java.awt.event.*;

class Gui extends JPanel {
  JButton button3;
  public Gui(){
    PaintedPanel pg = new PaintedPanel();
    JFrame frame = new JFrame();
    JFrame frame2 = new JFrame();



    frame.add(pg);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setSize(300, 300);
    frame.setVisible(true);
    frame2.setSize(100, 100);
    frame2.setVisible(true);
    
    button3 = new JButton("click to add more color");
    frame2.add(button3);
    button3.addActionListener(pg);
    }

  
}