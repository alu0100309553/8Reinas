package nQueens;

import java.util.ArrayList;

import clock.Clock;

public class NQueens {
  private ArrayList<Integer> sol = new ArrayList<Integer>();
  private int counter = 0;
  private Clock timer = new Clock();
  public void run(){
    for (int i = 0; i<8; i++){
      sol.add(i);
    }
    timer.start();
    solve(0, new ArrayList<Integer>() , new ArrayList<Integer>(), new ArrayList<Integer>());
  }
  private void solve(int k, ArrayList<Integer> col, ArrayList<Integer> diag45, ArrayList<Integer> diag135){
    if (k == 8){
      timer.stop();
      System.out.println(timer.elapsedTime());
      System.out.println("" + ++counter + sol);
    }
    else{
      for(int j = 1; j<=8; j++){
        if(!col.contains(j) && !diag45.contains(j-k) && !diag135.contains(j+k)){
          sol.set(k, j);
          col.add(j);
          diag45.add(j-k);
          diag135.add(j+k);
          solve(k+1, col, diag45, diag135);
          col.remove(col.size()-1);
          diag45.remove(diag45.size()-1);
          diag135.remove(diag135.size()-1);
        }
      }
    }
  }
  boolean otherDiag(int j, int k){
	  boolean aux = true;
    return true;
  }

}
