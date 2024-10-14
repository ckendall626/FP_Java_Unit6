import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Question1 implements ActionListener{
  JFrame frame;
  JFrame frame2;
  JButton button;
  JLabel label;
  Timer mytimer = new Timer (1000, new TimerListener());
  int x = 0;
  int tracker = 0;

  public Question1(){
    label = new JLabel("0");
    frame = new JFrame();
    frame2 = new JFrame();
    button = new JButton("click to start timer");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(button);

    frame.setSize(300, 300);
    frame.setVisible(true);

    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame2.add(label);

    frame2.setSize(300, 300);
    frame2.setVisible(true);

    button.addActionListener(this);

   
    }
  @Override
    public void actionPerformed(ActionEvent event) {
      if (tracker ==1){
        mytimer.stop();
        tracker = 0;
      }
      else {
        mytimer.start();
        tracker = 1;
      }
  }
  class TimerListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
      x ++;
      label.setText(Integer.toString(x));
    }
  }
}