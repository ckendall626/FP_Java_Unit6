import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PaintedPanel extends JPanel{
  int nj;
  // array of images that are associated with a number that is tied to a certain choice/point in the story
  ImageIcon [] imagelist = new ImageIcon[10];
  public PaintedPanel(int n) {
    nj = n;
    imagelist[0] = new ImageIcon("park.jpeg");
    imagelist[1] = new ImageIcon("explosion.jpg");
    imagelist[2] = new ImageIcon("thumbsup.jpg");
    imagelist[3] = new ImageIcon("meteor.jpg");
    imagelist[4] = new ImageIcon("skull.jpg");
    imagelist[5] = new ImageIcon("hero.png");
  }
// displaying the image
  @Override
  public void paintComponent(Graphics g){
    ImageIcon firefly = imagelist[nj];
    int width = firefly.getIconWidth();
    int height = firefly.getIconHeight();
    Image fireflyImage = firefly.getImage();
    g.drawImage(fireflyImage, 0, 0, 200, 200*height/width, 0, 0, width, height, this);
  }

}