import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BallGuiAnimated extends JPanel {
  int ballX;
  int ballY;
  Timer myTimer = new Timer(50, new TimerListener());

  public void animate() {
    /*for (int i = 0; i < 250; i++) {
      ballX++;
      ballY++;
      repaint();
      try {
        Thread.sleep(50);
      } catch (InterruptedException exc) {
        System.out.println("Interruption");
      }
    }*/
    myTimer.start();
  }

  public void paintComponent(Graphics g) {
    g.setColor(Color.BLACK);
    g.fillRect(0, 0, this.getWidth(), this.getHeight());
    g.setColor(Color.GREEN);
    g.fillOval(ballX, ballY, 60, 60);
  }

  class TimerListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      ballX++;
      ballY++;
      repaint();
      if (ballX > 100) {
        myTimer.stop();
      }
    }
  }
}
