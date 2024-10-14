import javax.swing.*;
import java.awt.*;

class BallGui extends JPanel {
  public void paintComponent(Graphics g) {
    g.setColor(Color.BLACK);
    g.fillRect(0, 0, this.getWidth(), this.getHeight());
    g.setColor(Color.GREEN);
    g.fillOval(70, 70, 60, 60);
  }
}
