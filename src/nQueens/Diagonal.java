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
	}
	
	
	
	
	
	

}
