package nQueens;

import java.util.ArrayList;

import clock.Clock;

public class NQueens {
  private ArrayList<Integer> times = new ArrayList<Integer>();
  private ArrayList<ArrayList<Integer>> solutions = new ArrayList<ArrayList<Integer>>();
  private ArrayList<Integer> sol = new ArrayList<Integer>();
  private int counter = 0;
  private Clock timer = new Clock();
  public void run(){
    for (int i = 0; i<8; i++){
      sol.add(i);
    }
    timer.start();
    solve(0, new Diagonal());
  }
  private void solve(int k, Diagonal diagonals){
    if (k == 8){
      timer.stop();
      getTimes().add((int)timer.elapsedTime());
      solutions.add(new ArrayList<Integer>(sol));
      System.out.println(timer.elapsedTime());
      System.out.println("" + ++counter + sol);
    }
    else{
      for(int j = 1; j<=8; j++){
        if(diagonals.testDiagonal(j, k)){
          sol.set(k, j);
          diagonals.addDiagonal(j, k);
          solve(k+1, diagonals);
          diagonals.removeDiagonal();
        }
      }
    }
  }
  
  public ArrayList<Integer> getTimes () {
    return times;
  }
  
  public ArrayList<ArrayList<Integer>> getSolutions () {
    return solutions;
  }
}
