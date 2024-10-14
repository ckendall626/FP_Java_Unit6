import javax.swing.*;
import java.awt.event.*;

class Main {

  public static void main(String[] args) {
    Question1 q1 = new Question1();
    Question2 q2 = new Question2();
    
    JFrame frame = new JFrame();
    BallGuiAnimated animation = new BallGuiAnimated();
    frame.add(animation);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.setSize(300, 300);
    frame.setVisible(true);
    animation.animate();
    
  }
  
}