import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TextGui implements ActionListener {
  JFrame frame = new JFrame();
  JLabel label = new JLabel("Please Enter Your Name: ");
  JButton button = new JButton("Submit");
  JTextField input = new JTextField("Your Name Here");
  String name;

  public TextGui() {
    frame.setLayout(new FlowLayout());
    frame.add(label);
    frame.add(input);
    frame.add(button);
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    frame.setSize(600, 600);
    frame.setVisible(true);
    button.addActionListener(this);
    

  }
  @Override
  public void actionPerformed(ActionEvent event) {
    name = input.getText();
    label.setText("Your name is ");
    if (name.equals("Colin")){
      label.setText("omg omg omg omg omg omg omg omg omg omg omg omg omg omg no way it's " );
    }
    frame.remove(button);
    frame.revalidate();
    frame.repaint();
  }

}
