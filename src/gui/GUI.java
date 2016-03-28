package gui;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;

public class GUI extends JFrame {
  
  private static final long serialVersionUID = 1L;
  private final int WIDTH = 350;
  private final int HIGH = 270;
  private JFrame frame = new JFrame();
  
  private JFrame getFrame() {
    return frame;
  }
  
  public GUI () {
    getFrame().setLayout (new BorderLayout(0, 0));
    getFrame().setSize(WIDTH, HIGH);
    getFrame().setTitle ("8 Queens");
    getFrame().setLocationRelativeTo(null);
    getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getFrame().setVisible(true);
  }
  
  private void init (int time, ArrayList<Integer> solution) {
    InfoPanel info = new InfoPanel (time, solution);
    getFrame().add (info, BorderLayout.WEST);
    ChessPanel board = new ChessPanel ();
    board.setSolution(solution);
    board.repaint();
    getFrame().add (board, BorderLayout.CENTER);
    getFrame().validate();
  }
  
  public void update (int time, ArrayList<Integer> solution){
    getFrame().getContentPane().removeAll();
    init(time, solution);
  }
}
