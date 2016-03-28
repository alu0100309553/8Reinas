package gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JPanel;

public class ChessPanel extends JPanel {

  private ArrayList<Integer> solution = new ArrayList<Integer>();

  public void setSolution(ArrayList<Integer> solution_){
    solution = solution_;
  }
  
  public void paintComponent (Graphics g){
    super.paintComponent(g);
    paintmarks(g);
    paintboard(g);
    paintqueens(g);
  }
  
  private void paintboard(Graphics g){
    Image img1 = Toolkit.getDefaultToolkit().getImage("img/claro.png");
    Image img2 = Toolkit.getDefaultToolkit().getImage("img/oscuro.png");
    for (int i = 0; i < 8; i++){
      for (int j = 0; j < 8; j++ ){
        if ((i+j)%2 == 0){
          g.drawImage(img1, (20 + (i*30)), (20 + (j*30)), 30, 30, this);
        }
        else{
          g.drawImage(img2, (20 + (i*30)), (20 + (j*30)), 30, 30, this);
        }
      }
    }
  }

  private ArrayList<Integer> getSolution() {
    return solution;
  }
  
  private void paintmarks(Graphics g) {
    for (int i = 0; i < 8 ; i++){
      g.drawChars(("" + (i+1)).toCharArray(), 0, 1, 5, (40 + (i*30)));
    }
    for (int i = 0; i < 8 ; i++){
      g.drawChars(("" +((char)(i + 'a'))).toCharArray(), 0, 1, (30 + (i*30)), 15 );
    }
  }

  private void paintqueens(Graphics g){
    Image img3 = Toolkit.getDefaultToolkit().getImage("img/queen.png");
    for (int i = 0; i < getSolution().size(); i++){
      g.drawImage(img3, (20 + (i*30)), (20 + ((getSolution().get(i)-1)*30)), 30, 30, this);
    }
  }
}
