package polynomial;

import java.util.*;


public class Polynomial {
	
	private ArrayList<term> termList;
	private ArrayList<term> termFresh;
	private String poly = "";
	private String ettikai = "";
	
	
	// Constructor
	public Polynomial(String ettikai){
		termList = new ArrayList<term>();
		termFresh = new ArrayList<term>();
		this.ettikai = ettikai;
	}
	
	/**
	 * Insert X and Y into term and adding term into termlist 
	 * in descending order
	 * @param X
	 * @param Y
	 */
	public void insert(int X, int Y){
		
		term newTerm = new term(X, Y);
		if (termList.isEmpty()){
	          termList.add(newTerm);
	          termFresh.add(newTerm);
	          return;
	      }
	      int polySize = termList.size() - 1 ;
	      for (int i = 0 ; i <= polySize ; i++){
	          term listTerm = termList.get(i) ;  
	          int listTermExpo = listTerm.getExponent() ;
	          if ( Y >= listTermExpo ){
	        	  
	               termList.add(i, newTerm);
	               
	               termFresh.add(i, newTerm);
	               
	               return;
	            }
	       }
	      termList.add(newTerm);
	      termFresh.add(newTerm);
	      return;
	}
	

	/**
	 * Reversing listerms
	 */
	public void reverse(){

		Collections.reverse(termList);
	}

	/**
	 * Remove specific term from termList
	 * @param X
	 * @param Y
	 */
	public void remove(int X, int Y){
		
		term newterm = new term(X, Y);
		for (term t: termList){
			if (t.equals(newterm)){
				termList.remove(t);
			}
		}
	}
	
	/**
	 * get coefficient and exponent of all terms and calculate the product
	 * @return product of terms
	 */
	public String getProduct(){
		String product = "Product = ";
		int expo = 0;
		int Coeff = 1;
		for (int x = 0; x < termList.size(); x++){
			term currentterm = termList.get(x);
			Coeff = Coeff * currentterm.getCoefficient();
			expo = expo + currentterm.getExponent();
			
		}
		product += String.valueOf(Coeff) + "x^" + String.valueOf(expo);
		return product;
		
	}

	
	/**
	 * get all terms from termlist and concatenate their string forms
	 * @return the final polynomial value
	 */

	
	public String getPolynomial(){
		poly = "P(x) = ";		
		for (int x = 0; x < termList.size(); x++){
			String term = termList.get(x).toString();
			poly += term;
		}
		
		poly = poly.substring(0, 6) + poly.substring(8);
		return poly;
	}
	
	/**
	 * 
	 * @return the polynomial in ascending order
	 */

	
	public String Product(){
		poly = "P(x) = ";
		for (int x = 0; x < termFresh.size(); x++){
			String term = termFresh.get(x).toString();
			poly += term;
		}
		
		poly = poly.substring(0, 6) + poly.substring(8);
		return poly;
		
		
	}
	
	
	
	
	
}	

