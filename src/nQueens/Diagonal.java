package nQueens;

import java.util.ArrayList;

public class Diagonal {
  private ArrayList<Integer> col = new ArrayList<Integer>();
  private ArrayList<Integer> diag45 = new ArrayList<Integer>();
  private ArrayList<Integer> diag135 = new ArrayList<Integer>();
  private ArrayList<Integer> diagJminus2K = new ArrayList<Integer>();
  private ArrayList<Integer> diag2JminusK = new ArrayList<Integer>();
  private ArrayList<Integer> diag2Jminus3K = new ArrayList<Integer>();
  private ArrayList<Integer> diag3Jminus2K = new ArrayList<Integer>();
  private ArrayList<Integer> diagJminus3K = new ArrayList<Integer>();
  private ArrayList<Integer> diag3JminusK = new ArrayList<Integer>();
  private ArrayList<Integer> diag2JplusK = new ArrayList<Integer>();
  private ArrayList<Integer> diagJplus2K = new ArrayList<Integer>();
  private ArrayList<Integer> diagJplus3K = new ArrayList<Integer>();
  private ArrayList<Integer> diag2Jplus3K = new ArrayList<Integer>();
  private ArrayList<Integer> diag3Jplus2K = new ArrayList<Integer>();
  private ArrayList<Integer> diag3JplusK = new ArrayList<Integer>();

  private boolean contains (ArrayList<Integer> list, int value){
    int counter = 0;
    for (int i = 0; i< list.size(); i++){
      if (list.get(i) == value){
        counter++;
      }
    }
    if (counter>=2){
      return true;
    }
    else{
      return false;
    }
  }

  public boolean testDiagonal (int j, int k){
    return !col.contains(j) && !diag45.contains(j-k) && !diag135.contains(j+k) &&
        !contains(diagJminus2K,(j-(2*k))) && !contains(diag2JminusK,((2*j)-k)) && 
        !contains(diag2Jminus3K,((2*j)-(3*k))) && !contains(diag3Jminus2K,((3*j)-(2*k))) && 
        !contains(diagJminus3K,(j-(3*k))) && !contains(diag3JminusK,((3*j)-k)) && 
        !contains(diag2JplusK,((2*j)+k)) && !contains(diagJplus2K,(j+(2*k))) &&
        !contains(diagJplus3K,(j+(3*k))) && !contains(diag2Jplus3K,((2*j)+(3*k))) &&
        !contains(diag3Jplus2K,((3*j)+(2*k))) && !contains(diag3JplusK,((3*j)+k));
  }

  public void addDiagonal (int j, int k){
    col.add(j);
    diag45.add(j-k);
    diag135.add(j+k);
    diagJminus2K.add(j-(2*k));
    diag2JminusK.add((2*j)-k);
    diag2Jminus3K.add((2*j)-(3*k));
    diag3Jminus2K.add((3*j)-(2*k));
    diagJminus3K.add(j-(3*k));
    diag3JminusK.add((3*j)-k);
    diag2JplusK.add((2*j)+k);
    diagJplus2K.add(j+(2*k));
    diagJplus3K.add(j+(3*k));
    diag2Jplus3K.add((2*j)+(3*k));
    diag3Jplus2K.add((3*j)+(2*k));
    diag3JplusK.add((3*j)+k);
  }

  public void removeDiagonal (){
    col.remove(col.size()-1);
    diag45.remove(diag45.size()-1);
    diag135.remove(diag135.size()-1);
    diagJminus2K.remove(diagJminus2K.size()-1);
    diag2JminusK.remove(diag2JminusK.size()-1);
    diag2Jminus3K.remove(diag2Jminus3K.size()-1);
    diag3Jminus2K.remove(diag3Jminus2K.size()-1);
    diagJminus3K.remove(diagJminus3K.size()-1);
    diag3JminusK.remove(diag3JminusK.size()-1);
    diag2JplusK.remove(diag2JplusK.size()-1);
    diagJplus2K.remove(diagJplus2K.size()-1);
    diagJplus3K.remove(diagJplus3K.size()-1);
    diag2Jplus3K.remove(diag2Jplus3K.size()-1);
    diag3Jplus2K.remove(diag3Jplus2K.size()-1);
    diag3JplusK.remove(diag3JplusK.size()-1);
  }







}
