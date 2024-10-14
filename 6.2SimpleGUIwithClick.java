import javax.swing.*;
import java.awt.event.*;

public class SimpleGUIwithClick implements ActionListener {

  JFrame frame;
  JButton button;
  JFrame frame2;
  JButton button2;
  int x = 400;
  JLabel label;
  int tracker = 0;

  public SimpleGUIwithClick () {
    label = new JLabel("blue");
    frame = new JFrame();
    frame2 = new JFrame();
    button2 = new JButton("click to shrink");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(label);
    frame2.add(button2);

    frame.setSize(100, 100);
    frame.setVisible(true);
    
    button2.addActionListener(this);
    frame2.setSize(x, x);
    frame2.setVisible(true);

  }

  @Override
  public void actionPerformed(ActionEvent event) {
    tracker ++;
    frame2.setSize(x/2, x/2);
    x= x/2;
    if (tracker >= 3){
      label.setText("red");
    }
    else{
      label.setText("green");
    }
  }

}
