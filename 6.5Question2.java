import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Question2 {
  JFrame frame3;
  Timer mytimer = new Timer (5000, new TimerListener());
  String [] imageList = {"animal.jpg", "sdc.jpg", "side_eye_cat.jpeg"};
  int y = 0;
  PaintedPanel pg = new PaintedPanel();

  public Question2(){
    frame3 = new JFrame();

    frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame3.add(pg);
    frame3.setSize(300, 300);
    frame3.setVisible(true);
    mytimer.start();

    }

  class TimerListener implements ActionListener{
    public void actionPerformed(ActionEvent event){
      if (y == 2){
      //mytimer.stop();
        y = -1;
      }
      else{
        y ++;
        System.out.println(y);
        pg.repaint();
      }
    }
  }
  class PaintedPanel extends JPanel{

    @Override
    public void paintComponent(Graphics g){
      ImageIcon mountains = new ImageIcon(imageList[y]);
      int width = mountains.getIconWidth();
      int height = mountains.getIconHeight();
      Image mountainsImage = mountains.getImage();
      g.drawImage(mountainsImage, 0, 0, 300, 300*height/width, 0, 0, width, height, this);
      }
  }
}