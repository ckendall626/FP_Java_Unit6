import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MountainsPaintedPanel extends JPanel{

  @Override
  public void paintComponent(Graphics g){
    ImageIcon mountains = new ImageIcon("mountains.jpeg");
    int width = mountains.getIconWidth();
    int height = mountains.getIconHeight();
    Image mountainsImage = mountains.getImage();
    g.drawImage(mountainsImage, 0, 0, 300, 300*height/width, 0, 0, width, height, this);
    }
}