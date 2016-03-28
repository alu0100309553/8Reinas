package gui;

import java.util.Scanner;

import nQueens.NQueens;

public class Test {

  public static void main(String[] args) {
    NQueens problem = new NQueens ();
    GUI ventana = new GUI();
    problem.run();
    for (int i = 0; i < problem.getSolutions().size(); i++){
      Scanner textint = new Scanner(System.in);
      try{
        textint.nextLine();
      }catch (Exception e){
        System.err.println(e); 
      }
      ventana.update(problem.getTimes().get(i), problem.getSolutions().get(i));
    }
  }

}
