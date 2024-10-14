import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PaintedPanel extends JPanel implements ActionListener{

  int tracker = 0;
  
  @Override
  public void paintComponent(Graphics g){
    ImageIcon firefly = new ImageIcon("firefly.jpeg");
    int width = firefly.getIconWidth();
    int height = firefly.getIconHeight();
    Image fireflyImage = firefly.getImage();
    g.drawImage(fireflyImage, 0, 0, 300, 300*height/width, 0, 0, width, height, this);
    System.out.println(tracker);
    if (tracker == 1){
      g.fillOval(100, 50, 40, 30);
      g.fillOval(40, 79, 56, 1);
    }
  }
  
    @Override
    public void actionPerformed(ActionEvent event) {
      tracker = 1;
      repaint();
    }
  
}