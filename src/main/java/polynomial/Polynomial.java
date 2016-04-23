package polynomial;

import java.util.*;
import java.util.Collections;

public class Polynomial {
	
	private ArrayList<term> termList;
	String poly = "";
	Boolean rev = false;
	
	
	
	public Polynomial(){
		termList = new ArrayList<term>();
	}
	
	public void insert(int X, int Y){
		term newTerm = new term(X, Y);
		if (termList.isEmpty()){
	          termList.add(newTerm);
	          return;
	      }
	      int polySize = termList.size() - 1 ;
	      for (int i = 0 ; i <= polySize ; i++){
	          term listTerm = termList.get(i) ;  
	          int listTermExpo = listTerm.getExponent() ;
	          if ( Y >= listTermExpo ){
	               termList.add(i, newTerm);
	               return;
	            }
	       }
	      termList.add(newTerm);
	      return;
	}
	
	
	
	public void reverse(){
		Collections.reverse(termList);
	}
	

	
	public void remove(int X, int Y){
		
		term newterm = new term(X, Y);
		for (term t: termList){
			if (t.equals(newterm)){
				System.out.println("yehi ho sun ka chijbij vetine thaun");
				termList.remove(t);
			}
		}
	}
	
	public String getPolynomial(){
		poly = "P(x) = ";		
		for (int x = 0; x < termList.size(); x++){
			String term = termList.get(x).toString();
			poly += term;
		}
		return poly;
		
	
	}
			
}	

