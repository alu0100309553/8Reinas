package gui;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InfoPanel extends JPanel{
  
  private static final long serialVersionUID = 1L;
  private final int WIDTH = 60;
  private final int HIGH = 270;
  
  InfoPanel(int time, ArrayList<Integer> solution){
    setLayout(new GridLayout(10, 1, 0, 0));
    setSize(WIDTH,HIGH);
    for (int i = 0; i < solution.size(); i++){
      add(new JLabel("Queen " + (i+1) +": " +((char)(i + 'a'))+ solution.get(i)));
    }
    add(new JLabel ("Time"));
    add(new JLabel ("  " + time + " ms"));
  } 
}
