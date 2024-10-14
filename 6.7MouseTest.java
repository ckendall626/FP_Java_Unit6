import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

  
class MouseTest{
  JFrame frame = new JFrame();
  JLabel label = new JLabel("Click to draw a circle");
  JPanel panel = new JPanel();
  int mx;
  int my;
  PaintedPanel pg = new PaintedPanel();
  int tracker = 0;

  public MouseTest(){
    frame.add(label);
    frame.add (panel);
    frame.add(pg);
    pg.addMouseListener(new mListener());
    
    

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    frame.setSize(300, 300);
    frame.setVisible(true);

  }
  class mListener implements MouseListener {
      @Override
    public void mouseClicked(MouseEvent e){
        System.out.println("Mouse Clicked");
      mx = e.getX();
      my = e.getY();
      frame.repaint();
      tracker = 1;
      }
    @Override
      public void mouseEntered(MouseEvent e){
        System.out.println("Mouse Entered");
      }
    @Override
      public void mouseExited(MouseEvent e){
        System.out.println("Mouse Exited");
      }
    @Override
      public void mousePressed(MouseEvent e){
        System.out.println("Mouse Pressed");
      }
    @Override
      public void mouseReleased(MouseEvent e){
        System.out.println("Mouse Released");
      }
  }
  class PaintedPanel extends JPanel{

  @Override
  public void paintComponent(Graphics g){
    g.fillOval(mx - 20, my - 20, 40, 40);
    }
}
}
