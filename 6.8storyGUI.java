import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class storyGUI extends JFrame  {
  // all the different frames with the buttons, image, and con-text respectively
  JFrame frame = new JFrame();
  JFrame frameImage = new JFrame();
  JFrame frameText = new JFrame();
  // all the variables are here so they can be accessed by the subclasses too
  // for Image
  PaintedPanel Panel = new PaintedPanel(0);
  // buttons 
  JButton westButton = new JButton("Run Away");
  JButton eastButton = new JButton("Fight Back");
  // text area with '\n' so it all fits nicely in the frame
  JTextArea Text = new JTextArea("It's a nice sunny day at the park." + '\n' + "You are out strolling, touching some grass when all of a sudden, " + '\n' + "a meteor stars heading towards you." + '\n' + "What do you do?");
  
  public storyGUI() {
   
    // adding individual action listeners to the buttons so the buttons each do something different
    westButton.addActionListener(new WestActionListener());
    eastButton.addActionListener(new EastActionListener());


    // frame display/adding schematics
    frameImage.add(Panel);
    frame.add(BorderLayout.EAST, eastButton);
    frameText.add(Text);
    frame.add(BorderLayout.WEST, westButton);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200, 200);
    frame.setVisible(true);
    frameImage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frameImage.setSize(200, 200);
    frameImage.setVisible(true);  
    frameText.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frameText.setSize(300, 300);
    frameText.setVisible(true);  


  }

  class WestActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      // each if statement acts as an individual choice that changes everything
      if (westButton.getText().equals("Use Magic")){
        // if the user reaches an ending then the button frame disappears
        frame.setVisible(false);
        Text.setText("The magic spell you started to cast took" + '\n' + "too long and the meteor squished you." + '\n' + "You died");
        // for the image
        Panel.nj = 4;
      }
      else if (westButton.getText().equals("Skinny Tree")){
        frame.setVisible(false);
        Text.setText("Wow!! You survived the meteor!!!" + '\n' + "that bark must have really been something" + '\n' + "strong." + '\n' + "You cotninue with your day as if nothing ever " + '\n' + "happened" + '\n' + "Successful Ending 1 of 2: Survived");
        Panel.nj = 2;
      }
      else if (westButton.getText().equals("Run Away")){
        westButton.setText("Skinny Tree");
        eastButton.setText("Giant Rock");
        Text.setText("You have chosen to run away." + '\n' + "You successfully dodge the meteor but the blast wave" + '\n' + "is fast approaching you." + '\n' + "You need cover fast." + '\n' + "Where do you hide?");
        Panel.nj = 1;
      }
      // so the new image replaces the old one
      Panel.repaint();
    }
  }
  class EastActionListener implements ActionListener {
    @Override
      public void actionPerformed(ActionEvent e){
        if (eastButton.getText().equals("Giant Rock")){
          frame.setVisible(false);
          Text.setText("Turns out the giant rock was actually a" + '\n' + "clever cardboard cutout and blew away" + '\n' + "with the wind right before you could hide" + '\n' + "behind it." + '\n' + "You died by the shockwave.");
          Panel.nj = 4;
        }
        else if (eastButton.getText().equals("One Punch")){
          frame.setVisible(false);
          Text.setText("Wow!!!" + '\n' + "You destroyed the meteor into atoms with a" + '\n' + "single punch!!!"+ '\n' + "*insert one punch man reference here*" + '\n' + "You did it!!!" + '\n' + "You are the hero of the park!!!" + '\n' + "Successful Ending 2 of 2: One Punch Man");
          Panel.nj = 5;
        }
        else if (eastButton.getText().equals("Fight Back")){
          westButton.setText("Use Magic");
          eastButton.setText("One Punch");
          Text.setText("You have chosen to fight back." + '\n' + "Turns out you actually have crazy superpowers" + '\n' + "and knoweldge of magic." + '\n' + "You take a stand." + '\n' + "What do you do next?");
          Panel.nj = 3;
        }
        Panel.repaint();
      }
  }
  
}